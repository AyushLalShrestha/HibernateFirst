/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.als.springcommerce.dao.impl;

import com.als.springcommerce.dao.ProductDAO;
import com.als.springcommerce.entity.Product;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Dell
 */

@Repository(value = "productDAOImpl")
public class ProductDAOImpl implements ProductDAO{
    @Autowired
    private SessionFactory sessionFactory;
    private Session session;
    private Transaction trans;
    
    @Override
    public List<Product> getAllProducts() {
       session = sessionFactory.openSession();
       return session.createQuery("SELECT p from Product p").list();
    }

    @Override
    public Product getProductById(String id) {
        session = sessionFactory.openSession();
        return (Product) session.get(Product.class, id);
    }

    @Override
    public int insertProduct(Product product) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int deleteProduct(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
