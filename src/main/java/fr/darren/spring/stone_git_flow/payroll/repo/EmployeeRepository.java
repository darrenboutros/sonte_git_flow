package fr.darren.spring.stone_git_flow.payroll.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.darren.spring.stone_git_flow.payroll.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
