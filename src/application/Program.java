package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		SellerDao sellerDao = DaoFactory.createSellerDao();
		// DaoFactory retorna para o sellerDao um sellerDaoJDBC com uma connection
		
		System.out.println("===== TEST 1: seller findById =====");
		Seller seller = sellerDao.findById(3); 
		// o sellerDao, que é sellerDaoJDBC, dá um findById e retorna o seller
		
		System.out.println(seller);
		
		System.out.println("\n===== TEST 2: seller findByDepartment =====");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n===== TEST 3: seller findAll =====");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}

		/*
		System.out.println("\n===== TEST 4: seller insert =====");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
		
		System.out.println("\n===== TEST 5: seller update =====");
		seller = sellerDao.findById(9);
		seller.setName("Martha Waine");
		sellerDao.update(seller);
		System.out.println("Update completed!");
		
		System.out.println("\n===== TEST 6: seller delete =====");
		System.out.print("Enter ID for delete seller: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete completed!");
		*/
		sc.close();
	}
}
