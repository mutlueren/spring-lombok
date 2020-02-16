package com.lombok.repository;

import com.lombok.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
    List<Teacher> findByFirstName(String firstName);
    List<Teacher> findByLastName(String lastName);
}
