package RasingGame.Layers.LayerCars;

public class BmwM5 extends LayerModelCarImpl {
    public BmwM5() {
    }

    /**
     * Метод создания матрицы машины
     */
    @Override
    public int[][] modelCar() {
        return new int[][]{
                {3, 3, 3, 0, 0, 0, 0, 3, 3, 3},
                {0, 0, 3, 3, 3, 3, 3, 3, 0, 0},
                {0, 0, 3, 3, 3, 3, 3, 3, 0, 0},
                {0, 0, 3, 3, 3, 3, 3, 3, 0, 0},
                {0, 3, 3, 3, 3, 3, 3, 3, 3, 0},
                {3, 3, 3, 0, 0, 0, 0, 3, 3, 3},
        };
    }
}

