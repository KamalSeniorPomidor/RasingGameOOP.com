package RasingGame;

public class Level {
   private  final int speed;
    private final int distance;
   private final String name;
  private final   Difficult diff;

    public Difficult getDiff() {
        return diff;
    }

    public Level(Difficult diff) {
        this.diff = diff;
        distance = diff.getDistance();
        speed = diff.getSpeed();
        name = diff.getName();
    }


}
