import java.util.Comparator;

public class AthleteTimeComparator implements Comparator<Athlete> {
    public int compare(Athlete a1, Athlete a2) {
        return Double.compare(a1.getTime(),a2.getTime());
    }
}
