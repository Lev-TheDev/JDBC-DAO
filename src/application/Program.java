package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();
		// DaoFactory reterna para o sellerDao um sellerDaoJDBC com uma connection
		
		Seller seller = sellerDao.findById(3); 
		// o sellerDao, que é sellerDaoJDBC dá um findById e retorna o seller
		
		System.out.println(seller);
		

	}

}
