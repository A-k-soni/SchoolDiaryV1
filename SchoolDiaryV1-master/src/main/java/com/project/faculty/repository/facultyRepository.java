package com.project.faculty.repository;

import com.project.faculty.dto.faculty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface facultyRepository extends JpaRepository<faculty,Integer> {

    @Query(value = "select * from faculty where user_id_faculty =?1",nativeQuery = true)
    public faculty fetchClass(String id);

}
