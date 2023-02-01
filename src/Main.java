import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Ranking ranking = new Ranking();

        Athlete a1 = new Athlete("Victor", 12.43);
        Athlete a2 = new Athlete("Anders", 15.76);
        Athlete a3 = new Athlete("Tobias", 14.98);

        ranking.addAthlete(a1);
        ranking.addAthlete(a2);
        ranking.addAthlete(a3);

        System.out.println("Rangering før sortering: ");

        for(Athlete a : ranking.athletes) {
            System.out.println(a);
        }

        Collections.sort(ranking.athletes, new AthleteTimeComparator());

        System.out.println("Rangering efter sortering: ");

        for(Athlete a : ranking.athletes) {
            System.out.println(a);
        }
    }
}
