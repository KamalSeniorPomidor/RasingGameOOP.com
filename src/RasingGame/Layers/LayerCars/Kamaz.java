package RasingGame.Layers.LayerCars;

public class Kamaz extends LayerModelCarImpl {
    private  int [][] car;
    public Kamaz() {
    }

    /**
     * Метод создания матрицы машины
     */
    @Override
    public int[][] modelCar() {
        car = new int[][]{
                {0, 0, 3, 3, 3, 3, 3, 0, 0,0},
                {0, 0, 3, 3, 3, 3, 3, 0, 0,0},
                {3, 3, 3, 3, 3, 3, 3, 3, 3,0},
                {3, 3, 3, 3, 3, 3, 3, 3, 3,0},
                {3, 3, 3, 3, 3, 3, 3, 3, 3,0},
                {3, 3, 3, 3, 3, 3, 3, 3, 3,0},
        };
        return car;
    }
}
