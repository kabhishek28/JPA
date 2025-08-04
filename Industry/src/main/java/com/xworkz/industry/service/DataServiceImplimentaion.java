package com.xworkz.industry.service;

import com.xworkz.industry.entity.XworkzBTMEntity;
import com.xworkz.industry.entity.XworkzRajajinagarEntity;
import com.xworkz.industry.repository.DataRepository;
import com.xworkz.industry.repository.DataRepositoryImplimentation;

public class DataServiceImplimentaion implements DataService {
    DataRepository dataRepository = new DataRepositoryImplimentation();

    @Override
    public void saveRajajinagar(XworkzRajajinagarEntity xworkzRajajinagarEntity) {
        dataRepository.insertRajajinagar(xworkzRajajinagarEntity);
    }

    @Override
    public void saveBTM(XworkzBTMEntity xworkzBTMEntity) {
        dataRepository.insertBTM(xworkzBTMEntity);
    }
}
