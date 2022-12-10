package RasingGame;

public enum Difficult {
    EASY("Легкий уровень", 3, 150),
    MEDIUM("Средний уровень", 5, 300),
    HIGH("Сложный уровень", 7, 400),
    HARD("Очень сложный уровень", 9, 550);
    private final int speed;
    private final String name;
    private  int distance;


    Difficult( String name,int speed, int distance) {
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }
}
