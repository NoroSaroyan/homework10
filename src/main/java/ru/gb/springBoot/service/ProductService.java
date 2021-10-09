package ru.gb.springBoot.service;


import org.springframework.stereotype.Service;
import ru.gb.springBoot.entity.Product;
import ru.gb.springBoot.repository.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements IProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public Optional<Product> findById(int id) {
        return repository.findById(id);
    }

    @Override
    public List<Product> findAll() {
        return repository.findAll();
    }

    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
    }

    @Override
    public Product save(Product product) {
        return repository.save(product);
    }

}