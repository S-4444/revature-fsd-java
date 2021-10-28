package com.revature.springlearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.revature.springlearn.model.Department;

@Repository
public interface DepartmentRepositroy extends JpaRepository<Department, Integer> {

}