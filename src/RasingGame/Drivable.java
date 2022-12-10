package RasingGame;

public interface Drivable {

    /**
     * Метод изменения координат машины для смещения влево
     */
    static void toLeft() {
        if (Start.game.getPlayer().getX() > 10) {
            Start.game.getPlayer().setX(Start.game.getPlayer().getX() - 20);
        }
    }
    /**
     * Метод изменения координат машины для смещения вправо
     */

    static void toRight() {
        if (Start.game.getPlayer().getX() < 40) {
            Start.game.getPlayer().setX(Start.game.getPlayer().getX() + 20);
        }
    }
}
