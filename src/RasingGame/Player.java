package RasingGame;

public class Player {
    Level level;
    private int x;
    private int y;

    private String name;
    int[][] car;

    public Player() {
    }

    /**
     * Метод установки начальных кооридант автомобиля
     */
    public Player(String name) {
        this.x = 24;
        this.y = 38;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }


    public int[][] getCar() {
        return car;
    }

    public void setCar(int[][] car) {
        this.car = car;
    }
}
