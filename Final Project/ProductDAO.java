package com.demo;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import java.util.List;

public class ProductDAO {

    // Save a new product
    public void saveProduct(Product product) {
        Session session = new Configuration().configure().buildSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(product);
        tx.commit();
        session.close();
    }

    // Get all products
    public List<Product> getAllProducts() {
        Session session = new Configuration().configure().buildSessionFactory().openSession();
        List<Product> products = session.createQuery("from Product", Product.class).list();
        session.close();
        return products;
    }

    // Get a product by ID
    public Product getProductById(int pid) {
        Session session = new Configuration().configure().buildSessionFactory().openSession();
        Product product = session.get(Product.class, pid);
        session.close();
        return product;
    }

    // Update an existing product
    public void updateProduct(Product product) {
        Session session = new Configuration().configure().buildSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.update(product);
        tx.commit();
        session.close();
    }

    // Delete a product by ID
    public void deleteProduct(int pid) {
        Session session = new Configuration().configure().buildSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Product product = session.get(Product.class, pid);
        if (product != null) {
            session.delete(product);
        }
        tx.commit();
        session.close();
    }

    // Search Product by name
    public List<Product> getProductsByName(String pname) {
        Session session = new Configuration().configure().buildSessionFactory().openSession();
        Query<Product> query = session.createQuery("from Product where name = :name", Product.class);
        query.setParameter("pname", pname);
        List<Product> product = query.list();
        session.close();
        return product;
    }


    // Get the total number of products
    public long getTotalProducts() {
        Session session = new Configuration().configure().buildSessionFactory().openSession();
        long count = (long) session.createQuery("select count(*) from Product").uniqueResult();
        session.close();
        return count;
    }

    // Delete  Product
    public void deleteAllProducts() {
        Session session = new Configuration().configure().buildSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.createQuery("delete from Product").executeUpdate();
        tx.commit();
        session.close();
    }
}