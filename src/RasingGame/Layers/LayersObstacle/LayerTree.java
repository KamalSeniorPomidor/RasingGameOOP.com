package RasingGame.Layers.LayersObstacle;

import RasingGame.Start;

import java.util.ArrayList;

public class LayerTree extends LayerObstacleImpl {
    @Override
    public int[][] modelObstacle() {
        return new int[][]{
                {0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 2, 2, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 2, 2, 2, 2, 0, 0, 0, 0},
                {0, 0, 0, 2, 2, 2, 2, 2, 2, 0, 0, 0},
                {0, 0, 2, 2, 2, 2, 2, 2, 2, 2, 0, 0},
                {0, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0},
                {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
                {0, 0, 0, 0, 0, 2, 2, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 2, 2, 0, 0, 0, 0, 0},

        };
    }

    public static void printTree(ArrayList<LayerTree> trees, int[][] matrix) {
        for (LayerTree tree : trees) {
            int tempX = tree.getX();
            int tempY = (int) tree.getY();
            int[][] treeMatrix = tree.modelObstacle();
            for (int k = 0; k < 9; k++) {
                for (int j = 0; j < 12; j++) {
                    if (tempY + k >= Start.road.getHEIGHT() || tempX + j >= Start.road.getWIDTH()) continue;
                    if (treeMatrix[k][j] == 2) {
                            matrix[tempY + k][tempX + j] = 2;
                        }
                    }
                }
            }
        }


    public static void woodsMoveDown() {
        for (LayerTree obstacle : Start.road.getTrees())
            obstacle.moveDown();
    }
}
