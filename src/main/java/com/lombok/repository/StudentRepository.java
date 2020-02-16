package com.lombok.repository;

import com.lombok.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    List<Student> findByFirstName(String firstName);
    List<Student> findByLastName(String lastName);
}
