package com.neosunivesity.back.front;

import com.neosunivesity.back.business.BusinessBackImpl;
import com.neosunivesity.back.business.IBusinessBack;
import com.neosunivesity.back.domain.RequestDomain;
import com.neosunivesity.back.domain.ResponseDomain;

import java.util.ArrayList;
import java.util.List;

public class TestBack {

    private static final String PATTERN_SLASH_dd_MM_yyyy="dd/MM/yyyy";
    private static final String PATTERN_dd_MM_yyyy="dd-MM-yyyy";


    public static void main(String[] args) {

        IBusinessBack business = new BusinessBackImpl();

        ResponseDomain domain=business.getAllBusinessInformation(buildRequest());

        System.out.println(domain.getStringDate());
        System.out.println(domain.getCurrentDate());
        System.out.println(domain.getDays());
    }

    private static RequestDomain buildRequest(){
        RequestDomain request = new RequestDomain();
        List<String> lstFechas = new ArrayList<>();
        lstFechas.add("03/04/2019");
        lstFechas.add("06/04/2019");

        request.setDayPlus(1);
        request.setStringDate("03/04/2019");
        request.setLstDates(lstFechas);
        request.setPattern(PATTERN_SLASH_dd_MM_yyyy);
        return request;
    }
}
