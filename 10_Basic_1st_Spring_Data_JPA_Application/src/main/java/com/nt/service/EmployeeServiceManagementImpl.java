package com.nt.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.Employee;
import com.nt.reposetory.IEmployeeReposetory;

@Service("employeeservice")
public class EmployeeServiceManagementImpl implements IEmployeeServiceManagement {
	
	@Autowired
	private IEmployeeReposetory repo;

	@Override
	public String registerEmployee(Employee emp) {
		Employee employee=repo.save(emp);
		return "Employee is registered with ID no is::"+employee.getEid();
	}

	@Override
	public String registerGroupOfEmployee(Iterable<Employee> emp) {
	
		
		Iterable<Employee> registerAllEmp=repo.saveAll(emp);
		
		if(registerAllEmp !=null) {
		List<Employee> registerAllEmpByList=(List<Employee>) registerAllEmp;
		//	By using stream api we get name of  employee	which are going to be saved
		Set<String> set1=registerAllEmpByList.stream().map(emplo->emplo.getEname()).collect(Collectors.toSet());
		return "Employees are registered with names are::"+set1;
		}
		/*	
			//By using advanced for loop
			if(registerAllEmp !=null) {
			List<String> list2=new ArrayList();
			for(Employee empo:registerAllEmp) {
				empo.getEname();
				list2.add(empo.getEname());
				
			}
			return "Employee names are ::"+list2;
			}*/
		return "Problem in saving employee";
	}

	@Override
	public String totalNoOfEmployee() {
		Long count=repo.count();
		return "The No of Employee in DB is ::"+count;
	}

	@Override
	public String employeeAvailableOrNot(Integer id) {
		Boolean avaOrNotMsg=repo.existsById(id);
		return "The id value "+id +"  number of Employee is available::"+avaOrNotMsg;
	}

	@Override
	public String searchEmployeeById(Integer id) {
		Optional<Employee> findMsg=repo.findById(id);
		return "The EMployee details are::"+findMsg;
	}

	@Override
	public Iterable<Employee> searchMultipleEmployee() {
		Iterable<Employee> multipleEmployee=repo.findAll();
		return multipleEmployee;
	}
	
	@Override
	public String fetchMultipleEmployeeById(List<Integer> ids) {
		Iterable<Employee> mulEmployee=repo.findAllById(ids);
		 mulEmployee.forEach(empo->{
			System.out.println(empo);
		});
		 return "The Employee you searched for is listed above";
	}
	
	@Override
	public Optional<Employee> fetchEmployeeById(int id) {
	Optional<Employee> emp=repo.findById(id);
		return emp;
	}

	@Override
	public String performPartialUpdate(int id, Double sal) {
		Optional<Employee> check=repo.findById(id);
		if(check.isPresent()) {
			 Employee emp=check.get();
			 System.out.println("Old salary is::"+emp.getSal());
			 emp.setSal(sal);
			 repo.save(emp);
			 System.out.println("New Salary is ::"+emp.getSal());
			 return "Employee salary is updated to ::"+emp.getSal();
		}else
		return "Employee with given id is not found";
	}

	@Override
	public String performFullUpdate(Employee emp) {
		Optional<Employee> verifyEmployee=repo.findById(emp.getEid());
		if(verifyEmployee.isPresent()) {
			Optional<Employee> previousDetails=repo.findById(emp.getEid());
			System.out.println("Employee old details is::"+previousDetails);
			
			Employee newDetails=new Employee();
			newDetails.setEaddress(emp.getEaddress());
			newDetails.setEname(emp.getEname());
			newDetails.setSal(emp.getSal());
			newDetails.setEid(previousDetails.get().getEid());
			newDetails.setEntryTime(previousDetails.get().getEntryTime());
			System.out.println("Before Save method");
			repo.save(newDetails);
			System.out.println("After Save method");
			System.out.println("Employee new details is::"+newDetails);
			return "Employee is record is updated";
		}else 
			repo.save(emp);
		
		return "Employee is registered with employee id is::"+emp.getEid();
	}
}
