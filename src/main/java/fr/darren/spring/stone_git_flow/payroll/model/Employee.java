package fr.darren.spring.stone_git_flow.payroll.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Employee {
	
	  private  @Id @GeneratedValue Long id;
	  
	  private String name;
	  private String role;

}
