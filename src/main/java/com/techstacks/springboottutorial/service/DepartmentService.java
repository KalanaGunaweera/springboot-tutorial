package com.techstacks.springboottutorial.service;

import com.techstacks.springboottutorial.entity.Department;
import com.techstacks.springboottutorial.error.DepartmentNotFoundError;

import java.util.List;

public interface DepartmentService {
   public Department saveDepartment(Department department);

   public List<Department> fetchDepartmentList();

  public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundError;

  public void deleteDepartmentById(Long departmentId);

   public Department updateDepartment(Long departmentId, Department department);

   public Department fetchDepartmentByName(String departmentName);
}
