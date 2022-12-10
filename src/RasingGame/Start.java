package RasingGame;
import RasingGame.Layers.LayerObstacle;
import RasingGame.Layers.LayerRoad;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Start   {
        static int life = 3;

        public static Game game = new Game();
        public static LayerRoad road;

        public static void main(String[] args) {

            road = new LayerRoad((game.getPlayer().getCar()), new ArrayList<>());
            road.getObstacles().add(new LayerObstacle());
            road.getObstacles().add(new LayerObstacle());
            Runnable run = new Runnable() {
                @Override
                public void run() {
                    if (game.getPlayer().getLevel().getDiff().getDistance() >= 0) {

                        if (road.getObstacles().get(0).getY() > road.getHEIGHT()) {
                            road.getObstacles().set(0, new LayerObstacle());
                        } else if (Start.road.getObstacles().get(0).getX() == Start.road.getObstacles().get(1).getX()) {
                            Start.road.getObstacles().get(0).setX(Start.road.getObstacles().get(1).getX() + 20);
                        }

                        LayerObstacle.woodsMoveDown();
                        Render.renderFrame();
                        isTouch();
                    } else {
                        game.finishDistance();
                    }
                }
            };
            ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
            executor.scheduleAtFixedRate(run, 0, 250, TimeUnit.MILLISECONDS);

            while (true) {
                Scanner input = new Scanner(System.in);
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
        private static void isTouch() {
            for (int i = 16; i < Start.game.getPlayer().getY(); i++) {
                if (i == road.getObstacles().get(0).getY()
                        && game.getPlayer().getX() == road.getObstacles().get(0).getX()) {
                    System.out.println("game over");
                    life--;
                    break;

                } else if (i == road.getObstacles().get(1).getY() &&
                        game.getPlayer().getX() == road.getObstacles().get(1).getX()) {
                    System.out.println("game over");
                    life--;
                    break;
                } else if (life == 0) {
                    System.exit(1);
                }
            }
        }
    }

