package ua.com.module.console.levelsapplication;


import ua.com.module.gameinlive.GameInLive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class LevelThree {

    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static final Random rand = new Random();
    private static int n;
    private static int m;

    public static void start(){
        int[][] matrix;
        try {
            System.out.print("Please write size of line ");
            m = Integer.parseInt(reader.readLine());
            System.out.print("Please write size of column ");
            n = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        matrix = new int[m][n];

        for (int i = 0; i< m; i++){
            for(int j = 0; j< n; j++){
                matrix[i][j] = generateValue(rand.nextInt()%2);
            }
        }

        System.out.println("Last condition");
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + "  ");
            }
            System.out.println();
        }
        System.out.println("\nNew condition");

        GameInLive gameInLive =  new GameInLive(matrix,n,m);
        matrix = gameInLive.isLiveCell();

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + "  ");
            }
            System.out.println();
        }

        System.out.println("Your variant: if you want exit, please input 0, else, repeat logic");
    }

    private static int generateValue(int value){
        if(value < 0) return generateValue(rand.nextInt()%2);
        return value;
    }
}
