package ua.com.module.tasks;

import ua.com.module.Controller;
import ua.com.module.CustomDate;
import ua.com.module.DetectType;

import java.io.*;
import java.util.Objects;

public class DateTask {
    public void run(){
        File file = new File("task1.txt");
        StringBuilder builder = new StringBuilder(10);

        if (file.exists()) {

            FileReader reader = null;
            try {
                reader = new FileReader(file);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            try (BufferedReader bufferedReader = new BufferedReader(Objects.requireNonNull(reader))) {
                String line = bufferedReader.readLine();
                while (line != null) {
                    builder.append(line);
                    line = bufferedReader.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        String[] massive = builder.toString().split(";");
        file = new File("output.txt");
        if (file.exists()) {

            FileWriter writer = null;
            try {
                writer = new FileWriter(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
            try (BufferedWriter bufferedWriter = new BufferedWriter(Objects.requireNonNull(writer))) {
                bufferedWriter.write("Task 1\n");
                for (int i = 0; i < massive.length - 1; i += 2) {
                    bufferedWriter.write("start for -> " + massive[i] + "\n");
                    CustomDate newDate = Controller.newDate(massive[i], DetectType.getType(massive[i + 1]));
                    bufferedWriter.write(newDate.getDate() + "\n");
                }
                bufferedWriter.write("\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
