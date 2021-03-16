package bd.edu.seu.HibernateDemo.repository;

import bd.edu.seu.HibernateDemo.model.Product;

import java.util.List;

public interface ProductDao {
    public List<Product> fildAll();
    public List<Product> findAll(long id);
    public Product save(Product product);
 }
