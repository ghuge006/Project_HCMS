/*
 * package com.project_hcms;
 * 
 * import java.math.BigDecimal; import java.time.LocalDate;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.boot.CommandLineRunner; import
 * org.springframework.stereotype.Component;
 * 
 * import com.project_hcms.entities.Department; import
 * com.project_hcms.entities.Employee; import com.project_hcms.entities.Role;
 * import com.project_hcms.services.DepartmentServices; import
 * com.project_hcms.services.EmployeeServices; import
 * com.project_hcms.services.RoleServices;
 * 
 * @Component public class DataLoader implements CommandLineRunner {
 * 
 * @Autowired private RoleServices roleService;
 * 
 * @Autowired private EmployeeServices employeeService;
 * 
 * @Autowired private DepartmentServices departmentService;
 * 
 * @Override public void run(String... args) throws Exception { Role role1 = new
 * Role(); role1.setRoleName("Manager");
 * role1.setDescription("Manager role desc"); roleService.addRole(role1);
 * 
 * Role role2 = new Role(); role2.setRoleName("Developer");
 * role2.setDescription("Developer role desc"); roleService.addRole(role2);
 * 
 * Department d1 = new Department(); d1.setDepartmentName("IT");
 * d1.setDescription("IT Desc"); departmentService.addDepartment(d1);
 * 
 * Department d2 = new Department(); d2.setDepartmentName("HR");
 * d2.setDescription("HR Desc"); departmentService.addDepartment(d2);
 * 
 * Employee manager = new Employee(); manager.setFirstName("Rahul");
 * manager.setLastName("Dravid"); manager.setGender("M");
 * manager.setDateOfBirth(LocalDate.of(1990, 6, 18));
 * manager.setEmail("xyz@gmail.com"); manager.setPhone("9876543210");
 * manager.setAddress("Karnataka"); manager.setNationalId("6756756");
 * manager.setMaritalStatus("Married");
 * manager.setEmergencyContactName("Vijeta");
 * manager.setEmergencyContactPhone("7456346457");
 * manager.setPosition("Software Manager");
 * manager.setSkillSet("Java , Spring Boot, AWS , Microservices");
 * manager.setEmploymentStartDate(LocalDate.of(2019, 2, 2));
 * manager.setEmploymentEndDate(null); manager.setSalary(new
 * BigDecimal("190000.0")); manager.setEmploymentStatus("ACTIVE");
 * manager.setBankAccountNumber("746574365"); manager.setManager(null);
 * manager.setDepartment(d2); manager.setRole(role2);
 * 
 * Employee emp1 = new Employee(); emp1.setFirstName("Rohit");
 * emp1.setLastName("Sharma"); emp1.setGender("M");
 * emp1.setDateOfBirth(LocalDate.of(1990, 5, 15));
 * emp1.setEmail("abc@gmail.com"); emp1.setPhone("1234567890");
 * emp1.setAddress("Mumbai"); emp1.setNationalId("112343");
 * emp1.setMaritalStatus("Single"); emp1.setEmergencyContactName("Ritika");
 * emp1.setEmergencyContactPhone("9087654321");
 * emp1.setPosition("Software Developer");
 * emp1.setSkillSet("Java , Spring Boot");
 * emp1.setEmploymentStartDate(LocalDate.of(2020, 1, 1));
 * emp1.setEmploymentEndDate(null); emp1.setSalary(new BigDecimal("80000.0"));
 * emp1.setEmploymentStatus("ACTIVE"); emp1.setBankAccountNumber("36758793465");
 * emp1.setManager(manager); emp1.setDepartment(d1); emp1.setRole(role1);
 * 
 * employeeService.addEmployee(manager); employeeService.addEmployee(emp1);
 * 
 * 
 * }
 * 
 * }
 */