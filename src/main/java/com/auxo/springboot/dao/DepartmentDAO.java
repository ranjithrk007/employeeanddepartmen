package com.auxo.springboot.dao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.auxo.springboot.model.Department;
import com.auxo.springboot.repository.DepartmentRepository;

@Service
public class DepartmentDAO {
	@Autowired
	DepartmentRepository departmentRepository;
	public Department save(Department dprt) {
		return departmentRepository.save(dprt);
	}
	public List<Department> findAll(){
		return departmentRepository.findAll();
	}
	public Department findOne(Long dprtid) {
		return departmentRepository.findById(dprtid).orElse(null);
	}
	public void delete(Department dprt) {
		departmentRepository.delete(dprt);
	}
}