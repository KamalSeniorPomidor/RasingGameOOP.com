package RasingGame;

import RasingGame.Layers.LayerCars.LayerModelCarImpl;
import RasingGame.Layers.LayerObstacle;

import java.io.IOException;

public class Render {

    /**
     * Метод отрисовки всего происходящего в консоль
     */
    public static void renderFrame() {
        clearCmd();
        int[][] temp = Start.road.createRoad();
        LayerModelCarImpl.printCar(new Player(), temp);
        LayerObstacle.printCar(Start.road.getObstacles(), temp);
        System.out.println("--------------------------------------------------------------");
        for (int i = 0; i < Start.road.getRoad().length; i++) {
            for (int j = 0; j < Start.road.getRoad()[0].length; j++) {
                if (temp[i][j] == 1)
                    System.out.print("|");
                if (temp[i][j] == 3) {
                    System.out.print("X");
                } else if (temp[i][j] == 2) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("До финиша " + Start.game.getPlayer().getLevel().getDiff().getDistance() + "М");
        System.out.println("--------------------------------------------------------------");
        System.out.println("|||||||     direction:   A - LEFT , D - RIGHT  life: " + Start.life);
        System.out.println("--------------------------------------------------------------");
    }

    /**
     * Метод очистки командной строки
     */

    private static void clearCmd() {
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {
        }
    }
}
