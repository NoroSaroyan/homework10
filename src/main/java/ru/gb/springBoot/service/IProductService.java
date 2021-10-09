package ru.gb.springBoot.service;


import ru.gb.springBoot.entity.Product;

import java.util.List;
import java.util.Optional;

public interface IProductService {

    Optional<Product> findById(int id);

    List<Product> findAll();

    void deleteById(int id);

    Product save(Product product);

}