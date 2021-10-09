package ru.gb.springBoot.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.gb.springBoot.entity.Cart;

import java.util.List;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer> {

    @Query(value = "select * from onlineShop.carts where(id_product) = :idProduct", nativeQuery = true)
    List<Cart> findCartByProductId(@Param("idProduct") int idProduct);

}