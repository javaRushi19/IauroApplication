package com.iauro.controller;

import java.lang.StackWalker.Option;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.iauro.entity.Admin;
import com.iauro.entity.Customers;
import com.iauro.entity.Product;
import com.iauro.repo.AdminRepo;
import com.iauro.repo.CustomerRepo;
import com.iauro.service.AdminServiceImpl;
import com.iauro.service.CustomerServiceImpl;
import com.iauro.service.ProductServiceImpl;




@Controller
public class ProjMainController {
	
	@Autowired
	private AdminRepo adminRepo;
	
	@Autowired
	private CustomerRepo custRepo;
	
	@Autowired
	private CustomerServiceImpl custService;
	
	@Autowired
	private AdminServiceImpl adminService;
	
	@Autowired
	private ProductServiceImpl prodService;
	
	@GetMapping("/home")
	public String showHome() {
		
		return  "home";	
	}
	
	@GetMapping("/signup_customers")
	public String signUpCustomer(@ModelAttribute("cs") Customers cust) {
		/*
		 * System.out.println("inside cust"); String msg=
		 * custService.registerCustomer(cust);
		 */
		return  "customerSignUp";	
	}
	
	@PostMapping("/signup_customers")
	public String signUpCustomerPost(@ModelAttribute("cs") Customers cust) {
		System.out.println("inside cust");
	String msg=	custService.registerCustomer(cust);
		return  "customres_home";	
	}
	
	@GetMapping("/signup_admin")
	public String signUpAdmin(@ModelAttribute("ad") Admin admin) {
		/*
		 * System.out.println("inside admin"); String msg =
		 * adminService.registerAdmin(admin);
		 */
		return  "adminSignup";	
	}
	
	@PostMapping("/signup_admin")
	public String signUpAdminPost(@ModelAttribute("ad") Admin admin) {
		System.out.println("inside admin");
		String msg = adminService.registerAdmin(admin);
		return  "admin_home";	
	}
	
	@GetMapping("/admin_home")
	public String showAdmin(@ModelAttribute("ad") Admin admin) {
		
		return  "admin_home";	
	}
	
	@GetMapping("/customres_home")
	public String showCustomers(@ModelAttribute("cs") Customers cust) {
		
		return  "customres_home";	
	}
	
	@PostMapping("/register")
	public   String  registerJSByUploadingFiles(@ModelAttribute("ad") Admin admin,
			  Map<String,Object> map)throws Exception {
		return null;
		
	}
	
	@PostMapping("/register1")
	public   String  registerJSByUploadingFiles(@ModelAttribute("cs") Customers cust,
			  Map<String,Object> map)throws Exception {
		
		return null;
		
	}
	
	
	
	@PostMapping("/SignIn_admin")
	public   String  signInAdmin(@ModelAttribute("ad") Admin admin,
			  Map<String,Object> map)throws Exception {
		String status="";
		String uname=admin.getUsername();
		String pw=admin.getPassword();
		
	Admin opt = adminRepo.fetchAdminByUserNameAndPassword(uname, pw);
	
	if(opt != null) {
		
		status="adminDashboard";
		
	}else {
		status="adminSignup";
	}
		
		return status;
		
	}
	
	@PostMapping("/SignIN_customer")
	public   String  signInCustomers(@ModelAttribute("cs") Customers cust,
			  Map<String,Object> map)throws Exception {
		String uname=cust.getUsername();
		String pw=cust.getPassword();
		String status="";
		
		Customers customer=custRepo.fetchCustomerByUserNameAndPassword(uname, pw);
		
		if(customer != null) {
			
			status="customerDashboard";
		}else {
			
			status="customerSignUp";
		}

		return status;
		
	}
	
	@GetMapping("/add")
	public String showAddProductForm(@ModelAttribute("prod") Product prod) {
		 
		   return "addProduct";
	}
	
	
	@PostMapping("/add")
	public String addProduct(Map<String,Object> map,
			                                        @ModelAttribute("prod") Product prod) {
		//use service
		
	   String result=prodService.registerProduct(prod);
	   List<Product> list=prodService.getAllProducts();
	   //keep results in model attributes
	   map.put("resultMsg", result);
	   map.put("prodData",list);
	   //return LVN
	   return "productList";
		
	}
	
	@GetMapping("/report")
	public  String  showProductReport(Map<String,Object> map,@RequestParam("type") String type) {
		String logicalViewName="";
		if(type.equalsIgnoreCase("admin")) {
			  List<Product> prod =prodService.getAllProducts();
			  map.put("prodData",prod);
			  logicalViewName = "productList";
		  }else {
			  List<Product> prod =prodService.getAllProducts();
			  map.put("prodData",prod); 
			  logicalViewName = "customerProdList";
		  }
		
		return logicalViewName;
	}//method
	
	@GetMapping("/edit")
	public String  showEditProductForm(@RequestParam("no") int no,
			                                                           @ModelAttribute("prod") Product product) {
		Product p =  prodService.getProductById(no);

		 BeanUtils.copyProperties(p, product);
		 //return lvn
		 return "editProduct";
	}
	
	@PostMapping("/edit")
	public String  EditProduct(@ModelAttribute("prod") Product p,
			                                          Map<String,Object> map) {
		//use  service
		 String msg=prodService.editProduct(p);
		 List<Product> prod =prodService.getAllProducts();
		  map.put("prodData",prod);
		
		   map.put("resultMsg", msg);
		
		//return lvn
		   return "productList";
	}
	
	
	@GetMapping("/delete")
	public String  deleteProduct(@RequestParam("no") int no,
			                                               Map<String,Object> map) {
		//use service
		String msg=prodService.deleteProduct(no);
		 List<Product> prod =prodService.getAllProducts();
		  map.put("prodData",prod);
		
		   map.put("resultMsg", msg);
		
		//return lvn
		   return "productList";
	}
	

}
