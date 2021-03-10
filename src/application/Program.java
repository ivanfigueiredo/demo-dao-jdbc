package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Department depart = new Department(6, "Gerente de TI");
		
		Seller seller = new Seller(11, "Ivan", "ivan@gmail.com", sdf.parse("30/12/1986"), 3000.0, depart);
		
		System.out.println(seller);

	}

}
