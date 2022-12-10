package RasingGame.Layers;

import RasingGame.Difficult;
import RasingGame.Level;
import RasingGame.Start;

import java.time.Year;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class LayerObstacle {

    private final int[] COORDINATE_NUM = {4, 24, 44};
    private int x;
    private int y;
    /**
     * Создание матрицы дерева
     */
    public int[][] tree = new int[][]{
            {0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 2, 2, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 2, 2, 2, 2, 0, 0, 0, 0},
            {0, 0, 0, 2, 2, 2, 2, 2, 2, 0, 0, 0},
            {0, 0, 2, 2, 2, 2, 2, 2, 2, 2, 0, 0},
            {0, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0},
            {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
            {0, 0, 0, 0, 0, 2, 2, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 2, 2, 0, 0, 0, 0, 0},

    };

    public int[][] car = new int[][]{
            {0, 0, 3, 3, 3, 3, 3, 0, 0,0},
            {3, 3, 3, 3, 3, 3, 3, 3, 3,0},
            {0, 0, 3, 3, 3, 3, 3, 0, 0,0},
            {0, 0, 3, 3, 3, 3, 3, 0, 0,0},
            {3, 3, 3, 3, 3, 3, 3, 3, 3,0},
            {3, 3, 3, 3, 3, 3, 3, 3, 3,0},
    };


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    /**
     * Конструктор задает рандомные координаты дереву
     */
    public LayerObstacle() {
        this.x = COORDINATE_NUM[ThreadLocalRandom.current().nextInt(0, 3)];
        this.y = ThreadLocalRandom.current().nextInt(1, 2);
    }

    public void moveDown() {
        this.y = this.y + Start.game.getPlayer().getLevel().getSpeed();
    }

    public void setX(int x) {
        this.x = x;
    }



    public int[][] getTree() {
        return tree;
    }

    public int[][] getCar() {
        return car;
    }

    public static void woodsMoveDown() {
        for (LayerObstacle obstacle : Start.road.getObstacles())
            obstacle.moveDown();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LayerObstacle that = (LayerObstacle) o;
        return x == that.x && y == that.y;
    }

    /**
     * Метод добавления матрицы  дерева в матрицу дороги
     */
    public static void printTree(ArrayList<LayerObstacle> obstacles, int[][] temp) {
        for (int i = 0; i < obstacles.size(); i++) {
            int tempX = obstacles.get(i).getX();
            int tempY = obstacles.get(i).getY();
            int[][] wood = obstacles.get(i).getTree();

            for (int k = 0; k < 9; k++) {
                for (int j = 0; j < 12; j++) {
                    if (tempY + k >= Start.road.getHEIGHT() || tempX + j >= Start.road.getWIDTH()) continue;
                    if (wood[k][j] == 2) {
                        temp[tempY + k][tempX + j] = 2;
                    }

                }
            }
        }
    }

    public static void printCar(ArrayList<LayerObstacle> obstacle, int[][] temp) {
        for (int i = 0; i < obstacle.size(); i++) {
            int tempX1 = obstacle.get(i).getX();
            int tempY = obstacle.get(i).getY();
            int[][] carMas = obstacle.get(i).getCar();
            for (int k = 0; k < 6; k++) {
                for (int j = 0; j < 9; j++) {
                    if (tempY + k >= Start.road.getHEIGHT() || tempX1 + j >= Start.road.getWIDTH()) continue;
                    if (carMas[k][j] == 3) {
                        temp[tempY + k][tempX1 + j] = 3;
                    }
                }
            }
        }
    }
}


