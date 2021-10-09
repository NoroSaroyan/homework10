package ru.gb.springBoot.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.gb.springBoot.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}