//Repositorio Java//

package com.ecommercebd.order.infra;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommercebd.order.domain.Order;
import com.ecommercebd.order.domain.OrderRepository;

public interface OrderJpaRepository extends JpaRepository<Order, Long>, OrderRepository {

   @EntityGraph(attributePaths = {"customer"})
    List<Order> findAll();


}