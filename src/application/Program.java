package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1: seller findById ===");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n=== TEST 2: seller findByDepartment ===");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println("\n=== TEST 2: seller findAll ===");
        list = sellerDao.findAll();
        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println("\n=== TEST 4: seller insert ===");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.00, department);
        sellerDao.insert(newSeller);
        System.out.printf("\nINSERTED! New id = %d", newSeller.getId());

        System.out.println("\n=== TEST 4: seller insert ===");
        seller = sellerDao.findById(9);
        seller.setName("Kendrick Lamar");
        seller.setEmail("kdot@gmai.com");
        seller.setBirthDate(new Date());
        sellerDao.update(seller);
        seller = sellerDao.findById(7);
        seller.setBaseSalary(7500.00);
        department.setId(3);
        seller.setDepartment(department);
        System.out.println("Update completed!");
        sellerDao.update(seller);
    }
}
