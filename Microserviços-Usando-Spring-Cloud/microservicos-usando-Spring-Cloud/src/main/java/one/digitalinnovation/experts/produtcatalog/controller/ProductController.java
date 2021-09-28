package one.digitalinnovation.experts.produtcatalog.controller;

import one.digitalinnovation.experts.produtcatalog.model.Product;
import one.digitalinnovation.experts.produtcatalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/product")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

@RequestMapping(method = RequestMethod.POST)
Object create(@RequestBody Product product) {
        return productRepository.save(product);
    }
    @RequestMapping(value = "/{id}",  method = RequestMethod.GET)
    Optional findById(@PathVariable Integer id) {
       return productRepository.findById(id);
    }
}
