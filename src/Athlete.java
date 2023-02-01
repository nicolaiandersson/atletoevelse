public class Athlete {
    private String name;
    private double time;

    public Athlete(String name, double time) {
        this.name = name;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public double getTime() {
        return time;
    }

    public String toString() {
        return "Name: " + getName() + "| Ranking: " + getTime();
    }
}
