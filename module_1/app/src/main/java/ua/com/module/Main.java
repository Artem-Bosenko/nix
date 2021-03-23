package ua.com.module;

import ua.com.module.knightmove.KnightMove;
import ua.com.module.triangle.TriangleSquare;
import ua.com.module.uniqelements.UniqueElements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ////////////////////////////////////////////////////////////////////////////////////
        /*System.out.print("Введи элем эллементы: ");
        String str = reader.readLine();

        System.out.println(str);
        int k = UniqueElements.findNumberUniqueElements(str);
        System.out.println(k);*/
        /////////////////////////////////////////////////////////////////////////////////////

        /*boolean t = KnightMove.isKnightMoveReal(150,62,149,60);
        System.out.println(t);*/
        /////////////////////////////////////////////////////////////////////////////////////

        double t = TriangleSquare.calculateTriangleSquare(2,8,-3,6,0,1);
        System.out.println(t);
    }
}
