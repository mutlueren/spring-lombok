package com.lombok.repository;

import com.lombok.model.Class;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

public interface ClassRepository extends JpaRepository<Class, Integer> {
    List<Class> findByCode(String code);
}
