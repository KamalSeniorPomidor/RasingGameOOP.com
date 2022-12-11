package RasingGame;

public enum Difficult {
    EASY("Легкий уровень", 2, 150),
    MEDIUM("Средний уровень", 3, 300),
    HIGH("Сложный уровень", 4, 400),
    HARD("Очень сложный уровень", 5, 550);
    private final double speed;
    private final String name;
    private int distance;


    Difficult(String name, double speed, int distance) {
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public double getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }
}
