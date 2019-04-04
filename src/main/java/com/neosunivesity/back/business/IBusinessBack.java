package com.neosunivesity.back.business;

import com.neosunivesity.back.domain.RequestDomain;
import com.neosunivesity.back.domain.ResponseDomain;

public interface IBusinessBack {

    ResponseDomain getAllBusinessInformation(RequestDomain requestDomain);
}
