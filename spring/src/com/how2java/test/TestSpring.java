package com.how2java.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.how2java.pojo.Category;
import com.how2java.pojo.Product;
import com.how2java.service.ProductService;

public class TestSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "applicationContext.xml" });
//		ApplicationContext context = new FileSystemXmlApplicationContext("fileapplicationContext.xml");
//		Category c = (Category) context.getBean("c");
//
//		System.out.println(c.getName());
//		Product p = (Product) context.getBean("p");
//        System.out.println(p.getName());
//        System.out.println(p.getCategory().getName());
        ProductService s = (ProductService) context.getBean("s");
        s.doSomeService();
	}
}