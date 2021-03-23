package ua.com.module.console.leveloneconsole;

import ua.com.module.knightmove.KnightMove;
import ua.com.module.triangle.TriangleSquare;
import ua.com.module.uniqelements.UniqueElements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChooseTask {
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void taskOne(){
        System.out.print("Введи элем эллементы: ");
        String str = "";
        try {
            str = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(str);
        int count = UniqueElements.findNumberUniqueElements(str);
        System.out.println("Number unique elements = " + count);
        System.out.println("Your variant: if you want exit, please input 0, else, repeat logic");
    }
    public static void taskTwo() throws IOException {

        int startX, startY, predX, predY;
        System.out.println("Input start position of horse:");
        System.out.print("X = ");
        startX = Integer.parseInt(reader.readLine());
        System.out.print("Y = ");
        startY = Integer.parseInt(reader.readLine());

        System.out.println("Input yor predicated position of horse:");
        System.out.print("X = ");
        predX = Integer.parseInt(reader.readLine());
        System.out.print("Y = ");
        predY = Integer.parseInt(reader.readLine());

        boolean result = KnightMove.isKnightMoveReal(startX,startY,predX,predY);
        System.out.println(result);
        System.out.println("Your variant: if you want exit, please input 0, else, repeat logic");
    }
    public static void taskThree() throws IOException {

        int x1,y1,x2,y2,x3,y3;

        System.out.println("Please, input coordinates of vertex");
        System.out.print("point A: x = ");
        x1 = Integer.parseInt(reader.readLine());
        System.out.print("point A: y = ");
        y1 = Integer.parseInt(reader.readLine());

        System.out.print("point B: x = ");
        x2 = Integer.parseInt(reader.readLine());
        System.out.print("point B: y = ");
        y2 = Integer.parseInt(reader.readLine());

        System.out.print("point C: x = ");
        x3 = Integer.parseInt(reader.readLine());
        System.out.print("point C: y = ");
        y3 = Integer.parseInt(reader.readLine());

        double square = TriangleSquare.calculateTriangleSquare(x1,y1,x2,y2,x3,y3);
        System.out.println("Square of triandle = " + square);
        System.out.println("Your variant: if you want exit, please input 0, else, repeat logic");
    }
}
