package RasingGame.Layers.LayerCars;

public class AudiQ8 extends LayerModelCarImpl{
    private  int [][] car;
    public AudiQ8() {
    }

    /**
     * Метод создания матрицы машины
     */
    @Override
    public int[][] modelCar() {
        car =  new int[][]{
                {3, 3, 3, 3, 3, 3, 3, 3, 3, 3},
                {3, 3, 3, 3, 3, 3, 3, 3, 3, 3},
                {0, 0, 0, 3, 3, 3, 3, 0, 0, 0},
                {0, 0, 0, 3, 3, 3, 3, 0, 0, 0},
                {0, 0, 0, 3, 3, 3, 3, 0, 0, 0},
                {3, 3, 3, 3, 3, 3, 3, 3, 3, 3},};
        return car;
    }

}
