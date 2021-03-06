package com.example.cola;

import com.example.order.domain.entity.Order;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Extension(country = "a", bizCode = "order", order = 1)
public class OrderCreateExtensionPointOne implements ExtensionPointI<Order> {

    @Override
    public void execute(Order order) {

        order.setOrderNo("1");
        log.info("1L is print");

    }
}

