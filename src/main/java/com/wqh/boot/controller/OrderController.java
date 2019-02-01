package com.wqh.boot.controller;

import java.util.List;

import com.wqh.boot.domain.entity.Order;
import com.wqh.boot.domain.so.OrderSO;
import com.wqh.boot.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/search")
    public List<Order> search(@RequestBody OrderSO so) {
        return orderService.searchVOList(so);
    }
}
