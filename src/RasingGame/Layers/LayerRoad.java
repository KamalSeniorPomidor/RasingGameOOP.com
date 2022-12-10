package RasingGame.Layers;

import java.util.ArrayList;

public class LayerRoad {
    private final int HEIGHT = 30;
    private final int WIDTH = 59;
    private final LayerObstacle obstacleTouch = new LayerObstacle();
    public final ArrayList<LayerObstacle> obstacles = new ArrayList<>();

    public final int[][] road = new int[HEIGHT][WIDTH];

    /***
     * Метод создания матрицы дороги
     */

    public LayerRoad(int[][] car, ArrayList<LayerObstacle> woods) {
    }
    public int[][] createRoad() {
        int[][] temp = new int[HEIGHT][WIDTH];
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < 30; j++) {
                temp[i][0] = road[i][0] = 1;
                temp[i][19] = road[i][19] = 1;
                temp[i][39] = road[i][39] = 1;
                temp[i][58] = road[i][58] = 1;
            }
        }
        return temp;
    }

    public ArrayList<LayerObstacle> getObstacles() {
        return obstacles;
    }


    public int getHEIGHT() {
        return HEIGHT;
    }

    public int getWIDTH() {
        return WIDTH;
    }

    public int[][] getRoad() {
        return road;
    }
}
