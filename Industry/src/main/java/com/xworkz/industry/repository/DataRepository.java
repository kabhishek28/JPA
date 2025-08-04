package com.xworkz.industry.repository;

import com.xworkz.industry.entity.XworkzBTMEntity;
import com.xworkz.industry.entity.XworkzRajajinagarEntity;

public interface DataRepository {

    void insertRajajinagar(XworkzRajajinagarEntity xworkzRajajinagarEntity);

    void insertBTM(XworkzBTMEntity xworkzBTMEntity);
}
