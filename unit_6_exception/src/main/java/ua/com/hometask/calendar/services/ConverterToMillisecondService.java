package ua.com.hometask.calendar.services;

import ua.com.hometask.console.DateSequance;

public interface ConverterToMillisecondService {
    long run(DateSequance date);
}
