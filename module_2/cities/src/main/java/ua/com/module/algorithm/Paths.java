package ua.com.module.algorithm;

import lombok.Getter;

@Getter
public class Paths {
    private final int neighbor;
    private final int cost;
    public Paths(int neighbor, int cost) {
        this.neighbor = neighbor; this.cost = cost;
    }
}
