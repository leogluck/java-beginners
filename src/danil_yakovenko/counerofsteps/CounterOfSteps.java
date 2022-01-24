package danil_yakovenko.counerofsteps;

import java.util.LinkedList;
import java.util.Queue;

/*
You are given a m x n 2D grid initialized with these three possible values.
-1 - A wall or an obstacle.
0 - A gate.
INF(-2) - Infinity means an empty room. We use the value 231 - 1 = 2147483647 to represent INF as you may assume that the distance to a gate is less than 2147483647.
Fill each empty room with the distance to its nearest gate. If it is impossible to reach a gate, it should be filled with INF.
For example, given the 2D grid:
-2   -1   0   -2
-2   -2  -2   -1
-2   -1  -2   -1
 0   -1  -2   -2
--------------
INF WL  GT  INF
INF INF INF WL
INF WL  INF WL
GT  WL  INF INF
=======
INF - Infinity means an empty room. We use the value 231 - 1 = 2147483647 to represent INF as you may assume that the distance to a gate is less than2147483647.
Fill each empty room with the distance to its nearest gate. If it is impossible to reach a gate, it should be filled with INF.
For example, given the 2D grid:
INF  -1  0  INF
INF INF INF  -1
INF  -1 INF  -1
  0  -1 INF INF
After running your function, the 2D grid should be:
  3  -1   0   1
  2   2   1  -1
  1  -1   2  -1
  0  -1   3   4
  */


public class CounterOfSteps {
    private static final int GATE = 0;
    public static final int WALL = -1;
    private static final int EMPTY_ROOM = -2;

    private static final int[][] DIRECTIONS = new int[][]{
            {-1, 0},
            {0, -1},
            {1, 0},
            {0, 1}
    };

    private final int[][] map = new int[][]{
            {-2, -1, 0, -2},
            {-2, -2, -2, -1},
            {-2, -1, -2, -1},
            {-2, -1, 0, 0},
            {0, -1, -2, -2}
    };

    public static void main(String[] args) {
        CounterOfSteps counterOfSteps = new CounterOfSteps();
        counterOfSteps.count();
    }

    private void count() {
        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j] == GATE) {
                    queue.add(new int[]{i, j});
                }
            }
        }

        while (!queue.isEmpty()) {
            int[] coord = queue.poll();

            for (int[] step : DIRECTIONS) {
                int newI = coord[0] + step[0];
                int newJ = coord[1] + step[1];
                if (newI < 0 || newJ < 0 || newI >= map.length || newJ >= map[0].length) {
                    continue;
                }

                if (map[newI][newJ] == EMPTY_ROOM) {
                    map[newI][newJ] = map[coord[0]][coord[1]] + 1;
                    queue.add(new int[]{newI, newJ});
                }
            }
        }

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (j == 0) {
                    System.out.println();
                }
                System.out.print(map[i][j] + ": ");
            }
        }
    }
}