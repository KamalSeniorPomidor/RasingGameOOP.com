package RasingGame;

import RasingGame.Layers.LayersObstacle.LayerCar;
import RasingGame.Layers.LayerRoad;
import RasingGame.Layers.LayersObstacle.LayerTree;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import static java.lang.System.*;

public class Start {
    static int testCoordinate = 16;
    static int life = 3;

    public static Game game = new Game();
    public static LayerRoad road;

    public static void main(String[] args) {

        road = new LayerRoad((game.getPlayer().getCar()), new ArrayList<>(), new ArrayList<>());
        road.getTrees().add(new LayerTree());
        road.getCars().add(new LayerCar());
        Runnable run = new Runnable() {
            @Override
            public void run() {
                if (game.getPlayer().getLevel().getDiff().getDistance() >= 0) {
                    if (road.getTrees().get(0).getY() > road.getHEIGHT()) {
                        road.getTrees().set(0, new LayerTree());
                    } else if (road.getCars().get(0).getY() > road.getHEIGHT()) {
                        road.getCars().set(0, new LayerCar());
                    } else if (road.getCars().get(0).getX() == road.getTrees().get(0).getX()) {
                        road.getCars().get(0).setX(44);
                        road.getTrees().get(0).setX(4);
                    }


                    LayerTree.woodsMoveDown();
                    LayerCar.woodsMoveDown();
                    Render.renderFrame();
                    life = isTouch(life);
                    game.getPlayer().getLevel().getDiff().setDistance(game.getPlayer().getLevel().getDiff().getDistance() - 2);
                } else {
                    game.finishDistance();

                }
            }
        };
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        executor.scheduleAtFixedRate(run, 0, 550, TimeUnit.MILLISECONDS);

        while (true) {
            Scanner input = new Scanner(in);
            char direction = input.next().charAt(0);
            if (direction == 'a' || direction == 'A' || direction == 'ф' || direction == 'Ф') {
                Drivable.toLeft();
            } else if (direction == 'd' || direction == 'D' || direction == 'в' || direction == 'В') {
                Drivable.toRight();
            }
        }
    }

    /**
     * Метод проверки на столькновения
     */
    private static int  isTouch(int life) {
            if (32 == road.getCars().get(0).getY()
                    && game.getPlayer().getX() == road.getCars().get(0).getX()) {
                System.out.println("game over");
                life--;

            } else if (32 == road.getTrees().get(0).getY() &&
                    game.getPlayer().getX() == road.getTrees().get(0).getX()) {
                System.out.println("game over");
                life--;
            } else if (life == 0) {
                System.exit(1);
            }
        return life;
    }
}


