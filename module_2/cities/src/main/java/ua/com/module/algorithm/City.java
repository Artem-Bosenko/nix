package ua.com.module.algorithm;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class City implements Comparable<City>{
    @Getter
    @Setter
    private int index;
    @Getter
    private String name;
    @Getter
    private final List<Paths> neighbors = new ArrayList<>();
    @Setter
    @Getter
    private int previousCity;
    @Setter
    @Getter
    private int minPath = 20000;

    public void addNeighbor(Paths city){
        neighbors.add(city);
    }
    public City(String name, int index){
        this.name = name;
        this.index = index;
    }

    @Override
    public int compareTo(City o) {
        return Double.compare(this.minPath,o.minPath);
    }

    @Override
    public String toString() {
        return name;
    }
}
