package ua.com.hometask.calendar.services.impl;

import ua.com.hometask.calendar.services.FormatService;

public class FormatServiceImpl implements FormatService {
    private final long MILLISECONDS_IN_DAY = 86400000L;
    private final long MILLISECONDS_IN_HOUR = 3600000;
    private final int MILLISECONDS_IN_MINUTE = 60000;
    private final int MILLISECONDS_IN_SECOND = 1000;

    @Override
    public long convertToYears(long milliseconds, int numDays) {
        return milliseconds / (numDays * MILLISECONDS_IN_DAY);
    }

    @Override
    public long convertToMonths(long milliseconds, int numDays) {
        return milliseconds / (numDays * MILLISECONDS_IN_DAY);
    }


    @Override
    public long convertToDays(long milliseconds) {
        return milliseconds / MILLISECONDS_IN_DAY;
    }

    @Override
    public long convertToHours(long milliseconds) {
        return milliseconds / MILLISECONDS_IN_HOUR;
    }

    @Override
    public long convertToMinutes(long milliseconds) {
        return milliseconds / MILLISECONDS_IN_MINUTE;
    }

    @Override
    public long convertToSeconds(long milliseconds) {
        return milliseconds / MILLISECONDS_IN_SECOND;
    }

}
