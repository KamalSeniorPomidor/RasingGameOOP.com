package RasingGame.Layers;

import RasingGame.Difficult;
import RasingGame.Level;
import RasingGame.Start;

import java.time.Year;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class LayerObstacle {
    private RasingGame.Difficult Difficult;
   static Difficult diff;
    private Level defaultLvl;

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

    public Level getDefaultLvl() {
        return defaultLvl;
    }

    public void setDefaultLvl(Level defaultLvl) {
        this.defaultLvl = defaultLvl;
    }

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
        this.y = this.y + diff.getSpeed();
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
            int left = obstacles.get(i).getX();
            int top = obstacles.get(i).getY();
            int[][] wood = obstacles.get(i).getTree();

            for (int k = 0; k < 9; k++) {
                for (int j = 0; j < 12; j++) {
                    if (top + k >= Start.road.getHEIGHT() || left + j >= Start.road.getWIDTH()) continue;
                    if (wood[k][j] == 2) {
                        temp[top + k][left + j] = 2;
                    }

                }
            }
        }
    }

    public static void printCar(ArrayList<LayerObstacle> obstacle, int[][] temp) {
        for (int i = 0; i < obstacle.size(); i++) {
            int tempX1 = obstacle.get(i).getX();
            int tempY1 = obstacle.get(i).getY();
            int[][] carMas = obstacle.get(i).getCar();
            for (int k = 0; k < 6; k++) {
                for (int j = 0; j < 9; j++) {
                    if (tempY1 + k >= Start.road.getHEIGHT() || tempX1 + j >= Start.road.getWIDTH()) continue;
                    if (carMas[k][j] == 3) {
                        temp[tempY1 + k][tempX1 + j] = 3;
                    }
                }
            }
        }
    }
}


