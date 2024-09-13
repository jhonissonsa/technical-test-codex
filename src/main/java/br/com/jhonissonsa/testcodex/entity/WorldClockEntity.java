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

    public String getCurrentDateTime() {
        return currentDateTime;
    }

}
