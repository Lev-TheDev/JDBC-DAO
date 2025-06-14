package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("===== TEST 1: department findById =====");
		Department department = departmentDao.findById(4); 
		System.out.println(department);
		
		
		System.out.println("===== TEST 2: department findAll =====");
		List<Department> list = departmentDao.findAll();
		for (Department dep : list) {
			System.out.println(dep);
		}
		
		/*
		System.out.println("===== TEST 3: department insert =====");
		Department newDepartment = new Department(null, "E-readers");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());
		

		System.out.println("===== TEST 4: department update =====");
		department = departmentDao.findById(6);
		department.setName("Smartbands");
		departmentDao.update(department);
		System.out.println("Update completed!");
		
		
		System.out.println("===== TEST 5: department delete =====");
		System.out.print("Enter ID for delete department: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed!");
		*/
		
		sc.close();
	}
}
