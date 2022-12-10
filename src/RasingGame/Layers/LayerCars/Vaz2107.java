package RasingGame.Layers.LayerCars;

public class Vaz2107 extends LayerModelCarImpl {
    public Vaz2107() {
    }

    /**
     * Метод создания матрицы машины
     */
    @Override
    public int[][] modelCar() {
        return new int[][]{
                {0, 0, 0, 3, 3, 3, 3, 0, 0, 0},
                {3, 3, 3, 3, 3, 3, 3, 3, 3, 3},
                {0, 0, 3, 3, 3, 3, 3, 3, 0, 0},
                {0, 0, 3, 3, 3, 3, 3, 3, 0, 0},
                {0, 0, 3, 3, 3, 3, 3, 3, 0, 0},
                {3, 3, 3, 3, 3, 3, 3, 3, 3, 3},
        };
    }

}
