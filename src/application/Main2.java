package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class Main2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DepartmentDao departmentDao = new DaoFactory().createDepartmentDao();

        System.out.println("============ Test 1: department findById ============");
        Department department = departmentDao.findById(2);
        System.out.println(department);
        /*
        System.out.println("\n ============ Test 2: seller findByDepartment ============");
        // Reaproveintado no Test 4
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller s : list){
            System.out.println(s);
        }
        System.out.println("\n ============ Test 3: seller findAll ============");
        list = sellerDao.findAll();
        for (Seller s : list){
            System.out.println(s);
        }
        System.out.println("\n ============ Test 4: seller insert ============");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.00, department);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New id = " + newSeller.getId());
        System.out.println("\n ============ Test 5: seller update ============");
        seller = sellerDao.findById(1);
        seller.setName("Marta Waine");
        seller.setEmail("marta@gmail.com");
        sellerDao.update(seller);
        System.out.println("Update completed");
        System.out.println("\n ============ Test 5: seller deleteById ============");
        System.out.print("Enter id for delete test: ");
        int id = sc.nextInt();
        sellerDao.deleteById(id);
        System.out.println("deleteById completed");


         */
        sc.close();
    }
}