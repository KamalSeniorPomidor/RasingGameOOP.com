package RasingGame.Layers;

import RasingGame.Layers.LayersObstacle.LayerCar;
import RasingGame.Layers.LayersObstacle.LayerTree;

import java.util.ArrayList;

public class LayerRoad {
    private final int HEIGHT = 45;
    private final int WIDTH = 59;
    public final ArrayList<LayerCar> cars = new ArrayList<>();
    public final ArrayList<LayerTree> trees =  new ArrayList<>();

    public final int[][] road = new int[HEIGHT][WIDTH];

    /***
     * Метод создания матрицы дороги
     */

    public LayerRoad(int[][] car, ArrayList<LayerCar> cars, ArrayList<LayerTree> trees) {
    }
    public int[][] createRoad() {
        int[][] matrix = new int[HEIGHT][WIDTH];
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < 30; j++) {
                matrix[i][0] = road[i][0] = 1;
                matrix[i][19] = road[i][19] = 1;
                matrix[i][39] = road[i][39] = 1;
                matrix[i][58] = road[i][58] = 1;
            }
        }
        return matrix;
    }

    public ArrayList<LayerCar> getCars() {
        return cars;
    }
    public ArrayList<LayerTree> getTrees() {
        return trees;
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
