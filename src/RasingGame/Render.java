package RasingGame;

import RasingGame.Layers.LayerCars.LayerModelCarImpl;
import RasingGame.Layers.LayersObstacle.LayerCar;
import RasingGame.Layers.LayersObstacle.LayerTree;

import java.io.IOException;

public class Render {
    /**
     * Метод отрисовки всего происходящего в консоль
     */
    public static void renderFrame() {
        clearCmd();
        int[][] matrix = Start.road.createRoad();
        LayerModelCarImpl.printCar(new Player(), matrix);
        LayerCar.printCar(Start.road.getCars(), matrix);
        LayerTree.printTree(Start.road.getTrees(), matrix);
        System.out.println("--------------------------------------------------------------");
        for (int i = 0; i < Start.road.getRoad().length; i++) {
            for (int j = 0; j < Start.road.getRoad()[0].length; j++) {
                if (matrix[i][j] == 1)
                    System.out.print("|");
                if (matrix[i][j] == 3) {
                    System.out.print("X");
                } else if (matrix[i][j] == 2) {
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
