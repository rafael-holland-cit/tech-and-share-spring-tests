package com.total.august.cit.controllers;

import com.total.august.cit.entities.Product;
import com.total.august.cit.services.ProductService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.springframework.data.domain.Pageable;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping
    public ResponseEntity<List<Product>> findAll(){
        return ResponseEntity.ok().body(service.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id){
        return ResponseEntity.ok().body(service.findbyId(id));
    }

    @PostMapping
    public ResponseEntity<Product> save(@Valid @RequestBody Product product){
        service.save(product);
        return ResponseEntity.status(201).body(product);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Product> delete(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(value = "{id}")
    public ResponseEntity<Product> update(@PathVariable Long id, @RequestBody Product product){

        return ResponseEntity.ok().body(service.update(id, product));
    }

}
