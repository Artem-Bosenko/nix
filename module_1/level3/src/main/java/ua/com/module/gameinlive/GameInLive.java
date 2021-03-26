package ua.com.module.gameinlive;

public class GameInLive {

    private final int[][] matrix;
    private final int n;
    private final int m;

    public GameInLive(int[][] matrix,int n, int m) {
        this.matrix = matrix;
        this.n = n;
        this.m = m;

        Thread t = new Thread();
        t.start();
    }

    public int[][] isLiveCell() {

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int counter = countLive(i, j);
                if(matrix[i][j] == 1){
                    if(counter<2) matrix[i][j] = 0;
                    if(counter == 2 || counter == 3) matrix[i][j] = 1;
                    if(counter>3)matrix[i][j] = 0;
                }
                else if(matrix[i][j] == 0){
                    if(counter == 3) matrix[i][j] = 1;
                }
            }
        }

        return matrix;
    }

    private boolean isLive(int i, int j) {

        return matrix[i][j] == 1;
    }

    private int countLive(int cellI, int cellJ) {

        int count = 0;

        if (cellI == 0 && cellJ == 0) {
            if (isLive(0, 1)) count++;
            if (isLive(1, 0)) count++;
            if (isLive(1, 1)) count++;
        }
        if (cellI == 0 && cellJ == n - 1) {
            if (isLive(0, n - 2)) count++;
            if (isLive(1, n - 1)) count++;
            if (isLive(1, n - 2)) count++;
        }
        if (cellI == m - 1 && cellJ == 0) {
            if (isLive(m - 2, 0)) count++;
            if (isLive(m - 1, 1)) count++;
            if (isLive(m - 2, 1)) count++;
        }
        if (cellI == m - 1 && cellJ == n - 1) {

            if (isLive(m - 1, n - 2)) count++;
            if (isLive(m - 2, n - 1)) count++;
            if (isLive(m - 2, n - 2)) count++;

        }

        if (cellI == 0 && cellJ != 0 && cellJ != n - 1) {
            if (isLive(cellI, cellJ + 1)) count++;
            if (isLive(cellI, cellJ - 1)) count++;
            if (isLive(cellI + 1, cellJ)) count++;
            if (isLive(cellI + 1, cellJ - 1)) count++;
            if (isLive(cellI + 1, cellJ + 1)) count++;
        }
        if (cellJ == 0 && cellI != 0 && cellI != m - 1) {

            if (isLive(cellI + 1, cellJ)) count++;
            if (isLive(cellI - 1, cellJ)) count++;
            if (isLive(cellI, cellJ + 1)) count++;
            if (isLive(cellI - 1, cellJ + 1)) count++;
            if (isLive(cellI + 1, cellJ + 1)) count++;
        }
        if (cellI == m - 1 && cellJ != n - 1 && cellJ != 0) {

            if (isLive(cellI, cellJ + 1)) count++;
            if (isLive(cellI, cellJ - 1)) count++;
            if (isLive(cellI - 1, cellJ)) count++;
            if (isLive(cellI - 1, cellJ - 1)) count++;
            if (isLive(cellI - 1, cellJ + 1)) count++;

        }
        if (cellJ == n - 1 && cellI != 0 && cellI != m - 1) {

            if (isLive(cellI + 1, cellJ)) count++;
            if (isLive(cellI - 1, cellJ)) count++;
            if (isLive(cellI, cellJ - 1)) count++;
            if (isLive(cellI - 1, cellJ - 1)) count++;
            if (isLive(cellI + 1, cellJ - 1)) count++;

        } else if (cellI != 0 && cellJ != 0 && cellI != m - 1 && cellJ != n - 1) {

            if (isLive(cellI + 1, cellJ)) count++;
            if (isLive(cellI - 1, cellJ)) count++;
            if (isLive(cellI, cellJ + 1)) count++;
            if (isLive(cellI, cellJ - 1)) count++;
            if (isLive(cellI - 1, cellJ + 1)) count++;
            if (isLive(cellI + 1, cellJ + 1)) count++;
            if (isLive(cellI - 1, cellJ - 1)) count++;
            if (isLive(cellI + 1, cellJ - 1)) count++;
        }

        return count;
    }
}
