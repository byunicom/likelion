package com.example.springdatajpa4;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    //Example of custom query
    List<Employee> findByLastName(String lastName);

    List<Employee> findBySalaryGreaterThanEqual(Double salary);

    List<Employee> findBySalaryLessThanOrSalaryGreaterThan(Double salary1, Double salary2);

    List<Employee> findByHireDateBetween(Date startDate, Date endDate);

    List<Employee> findByDepartmentIdIn(List<Integer> departmentIds);

//    List<Employee> findByDepartmentIdInAndSalaryBetween(List<Integer> departmentIds, Double minSalary, Double maxSalary);
    @Query("SELECT e FROM Employee e JOIN FETCH e.department d WHERE d.id IN :departmentIds AND e.salary BETWEEN :minSalary AND :maxSalary")
    List<Employee> findByDepartmentIdInAndSalaryBetween(@Param("departmentIds") List<Integer> departmentIds, @Param("minSalary") Double minSalary, @Param("maxSalary")Double maxSalary);

    List<Employee> findByManagerIdIsNull();

    List<Employee> findByManagerIdIsNotNull();

    List<Employee> findByCommissionPctNotNullOrderBySalaryDescCommissionPctDesc();

    List<Employee> findByLastNameStartingWith(String prefix);

//    List<Country> findByName(String name);

    Optional<Employee> findById(Integer employeeId);    //추가된 부분

    List<Employee> findByFirstNameContaining(String name);


}
