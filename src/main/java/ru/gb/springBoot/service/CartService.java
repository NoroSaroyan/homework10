package ru.gb.springBoot.service;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.gb.springBoot.entity.Cart;
import ru.gb.springBoot.entity.Product;
import ru.gb.springBoot.repository.CartRepository;
import ru.gb.springBoot.repository.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CartService implements ICartService {

    private final CartRepository cartRepository;

    private final ProductRepository productRepository;

    public CartService(CartRepository cartRepository, ProductRepository productRepository) {
        this.cartRepository = cartRepository;
        this.productRepository = productRepository;
    }

    @Override
    public Cart saveProduct(int id) {
        Cart cart = new Cart();
        cart.setProduct(productRepository.getById(id));
        cartRepository.save(cart);
        return cart;
    }

    @Override
    public List<Cart> findAll() {
        return cartRepository.findAll();
    }

    @Override
    public List<Cart> findCartByProductId(int id) {
        return cartRepository.findCartByProductId(id);
    }

}