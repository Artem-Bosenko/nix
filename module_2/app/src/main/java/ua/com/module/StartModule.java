package ua.com.module;

import ua.com.module.tasks.CitiesTask;
import ua.com.module.tasks.DateTask;
import ua.com.module.tasks.NamesTask;

public class StartModule {

    public static void main(String[] args) {

        DateTask dateTask = new DateTask();
        NamesTask namesTask = new NamesTask();
        CitiesTask citiesTask = new CitiesTask();
        dateTask.run();
        namesTask.run();
        citiesTask.run();
    }
}
