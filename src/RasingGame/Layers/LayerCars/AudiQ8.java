package RasingGame.Layers.LayerCars;

public class AudiQ8 extends LayerModelCarImpl{
    public AudiQ8() {
    }

    /**
     * Метод создания матрицы машины
     */
    @Override
    public int[][] modelCar() {
        return new int[][]{
                {3, 3, 3, 3, 3, 3, 3, 3, 3, 3},
                {3, 3, 3, 3, 3, 3, 3, 3, 3, 3},
                {0, 0, 0, 3, 3, 3, 3, 0, 0, 0},
                {0, 0, 0, 3, 3, 3, 3, 0, 0, 0},
                {0, 0, 0, 3, 3, 3, 3, 0, 0, 0},
                {3, 3, 3, 3, 3, 3, 3, 3, 3, 3},};
    }

}
