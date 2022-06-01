package com.iauro.service;

import java.util.List;

import com.iauro.entity.Product;

public interface IProductService {
	
	public  List<Product>  getAllProducts();
    public  String  registerProduct(Product prod); 
    public  Product   getProductById(int no);
    public  String   editProduct(Product prod);
    public  String   deleteProduct(int no);
    
}
