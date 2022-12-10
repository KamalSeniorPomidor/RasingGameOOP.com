package RasingGame.Layers.LayerCars;

import RasingGame.Player;
import RasingGame.Start;

public abstract class LayerModelCarImpl implements LayerModelCar {

    public LayerModelCarImpl() {
    }


    /**
     * Метод добавления матрицы машины в матрицу дороги
     */
    public static void printCar(Player car, int[][] temp) {
        int tempX1 = Start.game.getPlayer().getX();
        int tempY1 = Start.game.getPlayer().getY();
        int[][] carMas = Start.game.getPlayer().getCar();
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                if (tempY1 + i >= Start.road.getHEIGHT() || tempX1 + j >= Start.road.getWIDTH()) continue;
                if (carMas[i][j] == 3) {
                    temp[tempY1 + i][tempX1 + j] = 3;
                }
            }
        }
    }
}