package RasingGame.Layers.LayerCars;

public class Kamaz extends LayerModelCarImpl{
    public Kamaz() {
    }

    /**
     * Метод создания матрицы машины
     */
    @Override
    public int[][] modelCar() {
        return new int[][]{
                {0, 0, 3, 3, 3, 3, 3, 0, 0,0},
                {0, 0, 3, 3, 3, 3, 3, 0, 0,0},
                {3, 3, 3, 3, 3, 3, 3, 3, 3,0},
                {3, 3, 3, 3, 3, 3, 3, 3, 3,0},
                {3, 3, 3, 3, 3, 3, 3, 3, 3,0},
                {3, 3, 3, 3, 3, 3, 3, 3, 3,0},
        };
    }
}
