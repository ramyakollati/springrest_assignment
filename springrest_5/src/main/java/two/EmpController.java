package two;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import four.EmpService;
import three.Emp;

@RestController
public class EmpController {
	
	@Autowired
	EmpService employeeService;
	
	@GetMapping("/employee")
	public List<Emp> getInventories() {
		return this.employeeService.getEmployee();
	}
	
	@GetMapping("/employee/{id}")
	public Emp getOneEmployee(@PathVariable int id ) {
		return this.employeeService.getEmployee(id);
	}
	
	@PostMapping("/employee")
	public List<Emp> addInventory(@RequestBody Emp employee ) {
		return this.employeeService.addOneEmployee(employee);
	}
	
	
	@PutMapping("/employee/{id}")
	public List<Emp> updateOneInventories(@PathVariable int id,@RequestBody Emp employee ) {
		return this.employeeService.updateOneEmployee(id,employee);
	}
	
	
	@DeleteMapping("/employee/{id}")
	public List<Emp> deleteOneEmployee(@PathVariable int id) {
		return this.employeeService.deleteOneInventory(id);
	}
	

}
