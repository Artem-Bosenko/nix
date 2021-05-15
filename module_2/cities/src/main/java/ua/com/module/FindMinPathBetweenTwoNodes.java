package ua.com.module;

import ua.com.module.algorithm.SearchMinPath;
import ua.com.module.factory.CityFactory;

public final class FindMinPathBetweenTwoNodes {
    public static int findPah(int source, int end){
        CityFactory factory = CityFactory.getInstance();
        SearchMinPath.computePaths(factory.getCity(source));
        return factory.getCity(end).getMinPath();
    }
}
