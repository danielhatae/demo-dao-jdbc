import com.mysql.cj.jdbc.SuspendableXAConnection;
import model.dao.DaoFactory;
import model.dao.SellerDao;

import model.entities.Department;
import model.entities.Seller;

import java.util.List;


public class Main {
    public static void main(String[] args) {

        SellerDao sellerDao = new DaoFactory().createSellerDao();

        System.out.println("============ Test 1: seller findById ============");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);
        System.out.println("\n ============ Test 2: seller findByDepartment ============");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller s : list){
            System.out.println(s);
        }

    }
}