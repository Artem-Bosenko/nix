package ua.com.module.triangle;

public class TriangleSquare {

    public static double calculateTriangleSquare(int x1, int y1, int x2, int y2, int x3, int y3) {
        double square = 0;

        int[][] matr = {{x1 - x3, y1 - y3}, {x2 - x3, y2 - y3}};
        double tmp = matr[0][0]*matr[1][1]-matr[1][0]*matr[0][1];
        square = 0.5 * Math.abs(tmp);
        return square;
    }
}
