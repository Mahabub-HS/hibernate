package bd.edu.seu.HibernateDemo;

import bd.edu.seu.HibernateDemo.model.Product;
import bd.edu.seu.HibernateDemo.repository.ProductDao;
import bd.edu.seu.HibernateDemo.repository.ProductDaoMysqlImplementation;

public class Main {
    public Main(){
        Product product = new Product(896,"One plus 5T",50_000,5);
        System.out.println(product);

        ProductDao productDao = new ProductDaoMysqlImplementation();
        productDao.save(product);

    }
    public static void main(String[] args) {
        new Main();
    }
}
