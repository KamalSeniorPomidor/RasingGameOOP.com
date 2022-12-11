package RasingGame.Layers.LayersObstacle;

import RasingGame.Start;

import java.util.ArrayList;

public class LayerCar extends LayerObstacleImpl {
    @Override
    public int[][] modelObstacle() {
        return new int[][]{
                {0, 0, 2, 2, 2, 2, 2, 0, 0, 0},
                {2, 2, 2, 2, 2, 2, 2, 2, 2, 0},
                {0, 0, 2, 2, 2, 2, 2, 0, 0, 0},
                {0, 0, 2, 2, 2, 2, 2, 0, 0, 0},
                {2, 2, 2, 2, 2, 2, 2, 2, 2, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        };
    }

    public static void printCar(ArrayList<LayerCar> cars, int[][] matrix) {
        for (LayerCar car : cars) {
            int tempX = car.getX();
            int tempY = (int) car.getY();
            int[][] carMatrix = car.modelObstacle();
            for (int k = 0; k < 6; k++) {
                for (int j = 0; j < 9; j++) {
                    if (tempY + k >= Start.road.getHEIGHT() || tempX + j >= Start.road.getWIDTH()) continue;
                    if (carMatrix[k][j] == 2) {
                        matrix[tempY + k][tempX + j] = 2;
                    }
                }
            }
        }
    }

    public static void woodsMoveDown() {
        for (LayerCar obstacle : Start.road.getCars())
            obstacle.moveDown();
    }
}

