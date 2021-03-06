package com.DawidM.SavingDataCar.Services;

import com.DawidM.SavingDataCar.entity.Car;
import com.DawidM.SavingDataCar.entity.Repair;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RepairService {

    List<Repair> findAll();

    Repair findById(Long id);

    Repair save(Repair repair);

    void deleteById(Long id);

    List<Repair> findByCategory(String category);
}
