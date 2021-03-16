package main.java.ua.com.hometask.factory;

import main.java.ua.com.hometask.ConsoleHelper;
import org.reflections.Reflections;

import java.util.Set;

public class ConsoleFactory {

    private static ConsoleFactory factory;
    private Set<Class<? extends ConsoleHelper>> consoles;
    private Reflections reflection;

    private ConsoleFactory(){
        reflection =new Reflections("main.java.ua.com.hometask");
        consoles = reflection.getSubTypesOf(ConsoleHelper.class);
    }

    public static ConsoleFactory getInstance(){

        if(factory == null){
            factory = new ConsoleFactory();
        }
        return factory;
    }

    public ConsoleHelper getConsoleHelper(){
        for (Class<? extends ConsoleHelper> console : consoles) {
            if(!console.isAnnotationPresent(Deprecated.class)){
                try {
                    return console.getDeclaredConstructor().newInstance();
                }
                catch (Exception e){
                    throw new RuntimeException("Vse poshlo ne po planu");
                }
            }
        }
        throw new RuntimeException("Vse poshlo ne po planu");
    }
}
