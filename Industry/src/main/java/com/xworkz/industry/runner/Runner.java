package com.xworkz.industry.runner;

import com.xworkz.industry.entity.XworkzBTMEntity;
import com.xworkz.industry.entity.XworkzRajajinagarEntity;
import com.xworkz.industry.service.DataService;
import com.xworkz.industry.service.DataServiceImplimentaion;

public class Runner {
    public static void main(String[] args) {

        XworkzRajajinagarEntity xworkzRajajinagarEntity = new XworkzRajajinagarEntity("Om","Rajajinagar",10,250);
        XworkzBTMEntity xworkzBTMEntity = new XworkzBTMEntity("Akshara","BTM",15,150);
        DataService dataService = new DataServiceImplimentaion();
        dataService.saveRajajinagar(xworkzRajajinagarEntity);
        dataService.saveBTM(xworkzBTMEntity);
    }
}
