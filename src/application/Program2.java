package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("\n=== TEST 1: Department findById ===");
        Department department = departmentDao.findById(2);
        System.out.println(department);

        System.out.println("\n=== TEST 2: Department findAll ===");
        List<Department> list = departmentDao.findAll();
        for (Department dep : list) {
            System.out.println(dep);
        }

        /* System.out.println("\n=== TEST 3: Department insert ===");
        Department newDepartment = new Department(6, "Games");
        departmentDao.insert(newDepartment);
        System.out.printf("\nINSERTED! New id = %d", newDepartment.getId()); */

        System.out.println("\n=== TEST 4: Department update ===");
        department = departmentDao.findById(7);
        department.setName("Magazines");
        departmentDao.update(department);
        department = departmentDao.findById(1);
        department.setName("Music");
        departmentDao.update(department);
        System.out.println("Update completed!");

        /* System.out.println("\n=== TEST 5: Department delete ===");
        System.out.print("Enter the id for delete test: ");
        int id = scan.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Department DELETED!"); */

        scan.close();
    }
}
