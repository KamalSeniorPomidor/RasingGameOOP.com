package RasingGame.Layers.LayersObstacle;

import RasingGame.Start;

import java.util.concurrent.ThreadLocalRandom;

public abstract class LayerObstacleImpl implements LayerModelObstacle {

    private final int[] COORDINATE_NUM = {4, 24};
    private int x;
    private double y;

    /**
     * Создание матрицы машины
     */


    public int getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    /**
     * Конструктор задает рандомные координаты препятсви.
     */
    public LayerObstacleImpl() {
        this.x = COORDINATE_NUM[ThreadLocalRandom.current().nextInt(0, 2)];
        this.y = ThreadLocalRandom.current().nextInt(1, 3);
    }

    /**
     * Метод метод изменения коориднаты Y
     */

    public void moveDown() {
        this.y = this.y + Start.game.getPlayer().getLevel().getSpeed();
    }

    public void setX(int x) {
        this.x = x;
    }


    /**
     * Метод смещения матрицы препрятсвия вниз
     */
    public void setY(int y) {
        this.y = y;
    }


}



