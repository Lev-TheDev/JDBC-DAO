package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller seller = sellerDao.findById(3); 
				//new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, obj);
		
		System.out.println(seller);
		

	}

}
