package ua.com.hometask.calendar.UI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClientController {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public String read(){
        try {
            return bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        throw new RuntimeException("invalid read");
    }

    public void output(String str){
        System.out.println(str);
    }
}
