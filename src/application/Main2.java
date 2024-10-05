package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

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

        System.out.println("\n ============ Test 2: department findAll ============");
        List<Department> list = departmentDao.findAll();
        for (Department d : list){
            System.out.println(d);
        }

        System.out.println("\n ============ Test 3: department insert ============");
        Department newDepartment = new Department(null, "Game");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New id = " + newDepartment.getId());

        System.out.println("\n ============ Test 4: department update ============");
        department = departmentDao.findById(1);
        department.setName("Notebooks");
        departmentDao.update(department);
        System.out.println("Update completed");

        System.out.println("\n ============ Test 5: department deleteById ============");
        System.out.print("Enter id for delete test: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("deleteById completed");

        sc.close();
    }
}