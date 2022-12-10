package RasingGame;

public class Level {
   private  final int speed;
    private final int distance;
   private final String name;
    Difficult diff;

    public Difficult getDiff() {
        return diff;
    }

    public Level(Difficult diff) {
        this.diff = diff;
        distance = diff.getDistance();
        speed = diff.getSpeed();
        name = diff.getName();
    }

    public int getSpeed() {
        return speed;
    }

    public int getDistance() {
        return distance;
    }

    public String getName() {
        return name;
    }
}
