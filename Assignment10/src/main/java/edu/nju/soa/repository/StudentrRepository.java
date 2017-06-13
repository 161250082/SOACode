package edu.nju.soa.repository;

import edu.nju.soa.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by cuihao on 2017-06-13.
 * Student repo definition
 */
public interface StudentrRepository extends JpaRepository<StudentEntity,Integer> {
}
