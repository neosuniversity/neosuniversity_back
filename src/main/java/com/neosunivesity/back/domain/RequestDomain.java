package com.neosunivesity.back.domain;

import java.util.List;

public class RequestDomain {

    private String pattern;
    private String stringDate;
    private List<String> lstDates;
    private int dayPlus;


    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getStringDate() {
        return stringDate;
    }

    public void setStringDate(String stringDate) {
        this.stringDate = stringDate;
    }

    public List<String> getLstDates() {
        return lstDates;
    }

    public void setLstDates(List<String> lstDates) {
        this.lstDates = lstDates;
    }

    public int getDayPlus() {
        return dayPlus;
    }

    public void setDayPlus(int dayPlus) {
        this.dayPlus = dayPlus;
    }
}
