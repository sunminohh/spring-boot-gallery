package org.sun.gallery.backend.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.sun.gallery.backend.entity.Order;


public interface OrderRepository extends JpaRepository<Order, Integer> {



}
