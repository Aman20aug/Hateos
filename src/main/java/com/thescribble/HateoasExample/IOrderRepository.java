package com.thescribble.HateoasExample;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderRepository extends JpaRepository<Order,Long> {
}
