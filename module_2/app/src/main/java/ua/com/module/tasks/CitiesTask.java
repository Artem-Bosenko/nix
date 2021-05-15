package ua.com.module.tasks;

import ua.com.module.FindMinPathBetweenTwoNodes;
import ua.com.module.algorithm.City;
import ua.com.module.algorithm.Paths;
import ua.com.module.factory.CityFactory;

import java.io.*;
import java.util.Objects;

public class CitiesTask {
    public void run() {
        File file = new File("task3.txt");
        CityFactory factory = CityFactory.getInstance();
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
                    builder.append(line).append("\n");
                    line = bufferedReader.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        String[] massive = builder.toString().split("\n");
        int countCities = Integer.parseInt(massive[0]);
        int index = 1;

        for (int i = 1; i < massive.length; i++) {
            if(countCities!=0) {
                City city = new City(massive[i], index);
                int countNeighbor = Integer.parseInt(massive[++i]);
                while (countNeighbor != 0) {
                    String[] elements = massive[++i].split(" ");
                    city.addNeighbor(new Paths(Integer.parseInt(elements[0]), Integer.parseInt(elements[1])));
                    countNeighbor--;
                }
                factory.addCity(city);
                countCities--;
                index++;
            }else {
                int countPaths = Integer.parseInt(massive[i]);
                while (countPaths != 0) {
                    file = new File("output.txt");
                    String[] cities = massive[++i].split(" ");
                    if (file.exists()) {

                        FileWriter writer = null;
                        try {
                            writer = new FileWriter(file, true);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        try (BufferedWriter bufferedWriter = new BufferedWriter(Objects.requireNonNull(writer))) {

                            bufferedWriter.write("Minimum path between " + cities[0] + " and " + cities[1] + " = "+
                                    FindMinPathBetweenTwoNodes.findPah(factory.getCityByName(cities[0]).getIndex(),
                                            factory.getCityByName(cities[1]).getIndex())+"\n");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        countPaths--;
                    }
                }
            }
        }
        System.out.println(factory.getCount());
    }
}
