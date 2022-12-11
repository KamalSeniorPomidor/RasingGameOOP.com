package RasingGame;

public class Level {
    private final double speed;
    private final int distance;
    private final String name;
    private final Difficult diff;

    public Level(Difficult diff) {
        this.diff = diff;
        distance = diff.getDistance();
        speed = diff.getSpeed();
        name = diff.getName();
    }

    public Difficult getDiff() {
        return diff;
    }


    public double getSpeed() {
        return speed;
    }

    public int getDistance() {
        return distance;
    }

    public String getName() {
        return name;
    }
}
