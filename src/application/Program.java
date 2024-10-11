package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {
        Department dep = new Department(1, "Books");
        Seller sel = new Seller(1, "Vivian", "vivian@gmail.com", LocalDate.parse("15/03/2000", DateTimeFormatter.ofPattern("dd/MM/yyyy")), 2500.00, dep);

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println(sel);
    }
}
