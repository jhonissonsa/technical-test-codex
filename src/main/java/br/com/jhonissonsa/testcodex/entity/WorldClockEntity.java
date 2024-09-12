package br.com.jhonissonsa.testcodex.entity;

public class WorldClockEntity {

    private String id;
    private String currentDateTime;
    private String utcOffset;
    private boolean isDayLightSavingsTime;
    private String dayOfTheWeek;
    private String timeZoneName;
    private long currentFileTime;
    private String ordinalDate;
    private String serviceResponse;

    public String getId() {
        return id;
    }

    public String getCurrentDateTime() {
        return currentDateTime;
    }

    public String getUtcOffset() {
        return utcOffset;
    }

    public boolean isDayLightSavingsTime() {
        return isDayLightSavingsTime;
    }

    public String getDayOfTheWeek() {
        return dayOfTheWeek;
    }

    public String getTimeZoneName() {
        return timeZoneName;
    }

    public long getCurrentFileTime() {
        return currentFileTime;
    }

    public String getOrdinalDate() {
        return ordinalDate;
    }

    public String getServiceResponse() {
        return serviceResponse;
    }
}
