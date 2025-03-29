package com.example.FirstProject.Service;

import com.example.FirstProject.Model.Product;
import com.example.FirstProject.Repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo productRepo;

    public List<Product> getAllProducts() {

        return productRepo.findAll();
    }

    public Product getProductById(int id) {

        return productRepo.findById(id).get();

    }

    public Product saveProduct(Product product) {

        return productRepo.save(product);
    }

    public Product updateProduct(Product product) {

        return productRepo.save(product);
    }
}
