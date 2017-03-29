
package com.als.springcommerce.dao;

import com.als.springcommerce.entity.Product;
import java.util.List;


public interface ProductDAO {
    
    List<Product> getAllProducts();
    Product getProductById(String id);
    int insertProduct(Product product);
    int deleteProduct(String id);
}
