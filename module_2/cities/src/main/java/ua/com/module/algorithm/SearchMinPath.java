package ua.com.module.algorithm;

import ua.com.module.factory.CityFactory;

import java.util.PriorityQueue;

public final class SearchMinPath {

    public static void computePaths(City source)
    {
        CityFactory factory = CityFactory.getInstance();
        source.setMinPath(0);
        PriorityQueue<City> vertexQueue = new PriorityQueue<>();
        vertexQueue.add(source);

        while (!vertexQueue.isEmpty()) {
            City u = vertexQueue.poll();

            for (Paths e : u.getNeighbors())
            {
                City v = factory.getCity(e.getNeighbor());
                int weight = e.getCost();
                int distanceThroughU = u.getMinPath() + weight;
                if (distanceThroughU < v.getMinPath()) {
                    vertexQueue.remove(v);

                    v.setMinPath(distanceThroughU);
                    v.setPreviousCity(u.getIndex());
                    vertexQueue.add(v);
                }
            }
        }
    }
}
