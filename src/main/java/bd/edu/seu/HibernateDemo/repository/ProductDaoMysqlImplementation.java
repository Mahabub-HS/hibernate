package bd.edu.seu.HibernateDemo.repository;

import bd.edu.seu.HibernateDemo.model.Product;
import bd.edu.seu.HibernateDemo.util.HibernateUtil;
import org.hibernate.Session;

import java.util.List;

public class ProductDaoMysqlImplementation implements ProductDao {

    @Override
    public List<Product> fildAll() {
        return null;
    }

    @Override
    public List<Product> findAll(long id) {
        return null;
    }

    @Override
    public Product save(Product product) {
        Session session = HibernateUtil.getSessionFactory().openSession();
         session.beginTransaction();
         session.save(product);
         session.getTransaction().commit();

         // Todo fix later
         return product;
    }
}
