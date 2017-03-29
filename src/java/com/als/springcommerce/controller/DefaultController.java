/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.als.springcommerce.controller;

import com.als.springcommerce.dao.ProductDAO;
import com.als.springcommerce.dao.impl.ProductDAOImpl;
import com.als.springcommerce.entity.Product;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/")
public class DefaultController {
    
    @Autowired
    ProductDAO productDAO = new ProductDAOImpl();
    
    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model){
        List<Product> productList = (List)productDAO.getAllProducts();
       model.addAttribute("productList", productList);
       return "index";
   } 
    
    @RequestMapping(value = "/product/{productId}",method = RequestMethod.GET)
    public @ResponseBody String getAProduct(@PathVariable("productId") String productId  ,Model model){
       Product product = productDAO.getProductById(productId);
       if(product != null){
       String productStr = product.getProductId() + " " + product.getProductName()+" - " + product.getProductType();
       return productStr;
       }
       return "No product as Such";
    } 
    
    
    
}
