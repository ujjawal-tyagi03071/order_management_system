package io.dbms.orderms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private OrderService orderService;


    @GetMapping("/orders")
    public List<Orders> getAllTopics() {
        return orderService.getAllOrder();
    }

    @GetMapping("/orders/{id}")
    public Orders getOrder(@PathVariable String id) {

        return orderService.getOneOrder(id);
    }

    @RequestMapping(method= RequestMethod.POST ,value = "/orders")
    public void addOrder(@RequestBody Orders topic) {
        orderService.addOrder(topic);
    }

}