package com.example.e_commerce.repository;

import com.example.e_commerce.model.CartItem;
import com.example.e_commerce.model.Product;
import com.example.e_commerce.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartItemRepository extends JpaRepository <CartItem, Long> {
    CartItem findByUserAndProduct(User user, Product product);

    void deleteByUserAndProduct(User user, Product product);

    List<CartItem> findByUser(User user);

    void deleteByUser(User user);
}
