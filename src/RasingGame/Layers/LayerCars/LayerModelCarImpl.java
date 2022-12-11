package RasingGame.Layers.LayerCars;

import RasingGame.Player;
import RasingGame.Start;

public abstract class LayerModelCarImpl implements LayerModelCar {


    /**
     * Метод добавления матрицы машины в матрицу дороги
     */
    public static void printCar(Player car, int[][] temp) {
        int tempX = Start.game.getPlayer().getX();
        int tempY = Start.game.getPlayer().getY();
        int[][] carMatrix = Start.game.getPlayer().getCar();
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                if (tempY + i >= Start.road.getHEIGHT() || tempX + j >= Start.road.getWIDTH()) continue;
                if (carMatrix[i][j] == 3) {
                    temp[tempY + i][tempX + j] = 3;
                }
            }
        }
    }
}