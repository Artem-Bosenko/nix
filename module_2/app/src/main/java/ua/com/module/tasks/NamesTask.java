package ua.com.module.tasks;

import ua.com.module.CLassForDetectFirstUniqueWordInLine;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

public class NamesTask {
    public void run(){
        File file = new File("task2.txt");
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
                writer = new FileWriter(file, true);
            } catch (IOException e) {
                e.printStackTrace();
            }
            try (BufferedWriter bufferedWriter = new BufferedWriter(Objects.requireNonNull(writer))) {
                bufferedWriter.write("Task 2\n");
                ArrayList<String> list = new ArrayList<>(Arrays.asList(massive));
                Optional<String> s = CLassForDetectFirstUniqueWordInLine.findUniqueWord(list);
                if(s.isPresent()){
                    bufferedWriter.write("First unique name: " + s.get() + " have index = "+ list.indexOf(s.get()));
                }else bufferedWriter.write("no one unique word");
                bufferedWriter.write("\n\n");
                bufferedWriter.write("Task 3\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
