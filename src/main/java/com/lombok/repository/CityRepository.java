package com.lombok.repository;

import com.lombok.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {
    List<City> findByName(String name);
    List<City> findByPlateCode(String plateCode);
}
