package ru.gb.springBoot.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.gb.springBoot.entity.Cart;
import ru.gb.springBoot.service.ICartService;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/carts")
public class CartController {

    private final ICartService service;

    public CartController(ICartService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Cart>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<List<Cart>> findCartByProductId(@PathVariable int id) {
        List<Cart> products = service.findCartByProductId(id);
        if (products.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(products);
    }

    @PostMapping("/add/{id}")
    public ResponseEntity<Cart> addProduct(@PathVariable(name = "id") int id){
        Cart newCart = service.saveProduct(id);
        return ResponseEntity.created(URI.create("/carts" + newCart.getId())).body(newCart);
    }

}