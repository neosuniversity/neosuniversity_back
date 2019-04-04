package com.neosunivesity.back.business;

import com.neosunivesity.back.domain.RequestDomain;
import com.neosunivesity.back.domain.ResponseDomain;
import org.neosuniversity.time.NeosDateUtil;

public class BusinessBackImpl implements IBusinessBack {

    @Override
    public ResponseDomain getAllBusinessInformation(RequestDomain requestDomain) {
        ResponseDomain domain= new ResponseDomain();
        domain.setCurrentDate(NeosDateUtil.getDateByString(requestDomain.getPattern(),requestDomain.getStringDate()));
        domain.setStringDate(NeosDateUtil.getCurrentDatePlusDays(requestDomain.getDayPlus(),requestDomain.getPattern()));
        domain.setDays(NeosDateUtil.getDaysBetweenDates(requestDomain.getPattern(),requestDomain.getLstDates().get(0),requestDomain.getLstDates().get(1)));
        return domain;
    }
/*
    @Override
    public ResponseDomain getAllBusinessInformation(String patter) {
        ResponseDomain domain= new ResponseDomain();
        domain.setCurrentDate(NeosDateUtil.getDateByString(patter,"06-04-2019"));
        domain.setStringDate(NeosDateUtil.getCurrentDatePlusDays(0,patter));
        domain.setDays(NeosDateUtil.getDaysBetweenDates(patter,"02-04-2019","06-04-2019"));
        return domain;
    }
    */
}
