package com.iauro.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iauro.entity.Product;
import com.iauro.repo.ProductRepo;

@Service
public class ProductServiceImpl implements IProductService {

	@Autowired
	private ProductRepo repo;
	
	@Override
	public List<Product> getAllProducts() {
		
		return repo.findAll();
	}

	@Override
	public String registerProduct(Product prod) {
		Integer id = repo.save(prod).getPid();
		return "Product Saved With ID"+id;
	}

	@Override
	public Product getProductById(int no) {
		Optional<Product> p= repo.findById(no);
	
		
		return p.get();
	}

	@Override
	public String editProduct(Product prod) {
		int id= repo.save(prod).getPid();
		return "Employee Updated With the ID"+id;
	}

	@Override
	public String deleteProduct(int no) {
		repo.deleteById(no);
		return "Product Deleted With ID --"+no;
	}

}
