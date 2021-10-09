package ru.gb.springBoot.service;


import ru.gb.springBoot.entity.Cart;
import ru.gb.springBoot.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ICartService {

    Cart saveProduct(int id);

    List<Cart> findAll();

    List<Cart> findCartByProductId(int id);

}