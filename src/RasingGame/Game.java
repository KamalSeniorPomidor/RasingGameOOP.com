package RasingGame;

import RasingGame.Layers.LayerCars.AudiQ8;
import RasingGame.Layers.LayerCars.BmwM5;
import RasingGame.Layers.LayerCars.Kamaz;
import RasingGame.Layers.LayerCars.Vaz2107;

import java.util.Scanner;

public class Game {
    private final String START_TEXT = "Добро пожаловать в игру Racing";

    private Player player;

    public Game() {
        createPlayer();
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    /**
     * Метод создания игрока
     */

    private void createPlayer() {
        System.out.println(START_TEXT);
        System.out.println("    Создайте игрока");
        Scanner input = new Scanner(System.in);
        System.out.println("      Введите имя");
        String name = input.next();
        player = new Player(name);
        player.setCar(choiceCar());
        player.setLevel(choiceLevel());
    }

    /**
     * Метод выбора автомобиля
     */
    private int[][] choiceCar() {
        System.out.println();
        System.out.println("Игрок о имени %s выберите автомобиль ");
        System.out.println();
        System.out.println(""" 
                .......................
                |    1 - Бмв М5       |
                |    2 - Ваз 2107     |
                |    3 - Камаз        |
                |    4 - Ауди Q8      |
                |.....................|""");
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.println("Введите номер автомобиля");
        int position = input.nextInt();
        switch (position) {
            case 1 -> {
                return new BmwM5().modelCar();
            }
            case 2 -> {
                return new Vaz2107().modelCar();
            }
            case 3 -> {
                return new Kamaz().modelCar();
            }
            case 5 -> {
                return new AudiQ8().modelCar();
            }
            default -> {
                System.out.println("Введите корректный номер автомоблия");
                return choiceCar();
            }
        }
    }

    /**
     * Метод выбора уровня
     */

    private Level choiceLevel() {
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("Выберите уровень сложности");
        System.out.println();
        System.out.println(""" 
                ........................
                |    1 - Легкий        |
                |    2 - Средний       |
                |    3 - Сложный       |
                |    4 - Очень сложный |
                |......................|""");
        System.out.println();
        System.out.println("Введите номер уровня");
        int position = input.nextInt();
        switch (position) {
            case 1 -> {
                return new Level(Difficult.EASY);
            }
            case 2 -> {
                return new Level(Difficult.MEDIUM);
            }
            case 3 -> {
                return new Level(Difficult.HIGH);
            }
            case 5 -> {
                return new Level(Difficult.HARD);
            }
            default -> {
                System.out.println("Введите корректный номер автомоблия");
                return choiceLevel();
            }
        }
    }

    /**
     * Метод  окончания игры
     */
    protected void finishDistance() {
        Scanner sc = new Scanner(System.in);
        if (Start.game.getPlayer().getLevel().getDiff().getDistance() <= 0) {
            System.out.println("ПОЗДРАВЛЯЮ ВЫ ПРОШЛИ УРОВЕНЬ!!");
            System.out.println("""
                    Выбрать другой уровень?
                    1.Да
                    2.Выйти""");
            int choice = sc.nextInt();
            if (choice == 1) {
                Start.game.choiceLevel();
            } else if (choice == 2) {
                System.exit(1);
            } else {
                System.out.println("Введите корректное число");
                finishDistance();
            }

        }
    }
}
