package com.Arc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Arc.entity.Student_info;

public interface Studentrepo extends JpaRepository<Student_info, Integer> {

}
