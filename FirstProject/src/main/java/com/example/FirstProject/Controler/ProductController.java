package com.example.FirstProject.Controler;

import com.example.FirstProject.Model.Product;
import com.example.FirstProject.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/products")
    public List<Product> products()
    {
        return productService.getAllProducts();
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<Product> productsById(@PathVariable int id){

        Product product = productService.getProductById(id);

        if(product != null) {
            return new ResponseEntity<>(product, HttpStatus.OK);
        }
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping("/products")
    public ResponseEntity<Product> addProduct(@RequestBody Product product) {

        Product saveProd = productService.saveProduct(product);

        return new ResponseEntity<>(saveProd, HttpStatus.CREATED);
    }

    @PutMapping("/products/{id}")
    public ResponseEntity<String> updateProduct(@PathVariable int id, @RequestBody Product product) {
        Product updateProd= productService.updateProduct(product);
        return new ResponseEntity<>("Updated",HttpStatus.OK);
    }
}
