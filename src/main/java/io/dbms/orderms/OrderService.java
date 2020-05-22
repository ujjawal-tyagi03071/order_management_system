package io.dbms.orderms;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class OrderService {

    private List<Orders> orders = new ArrayList<>(Arrays.asList(
            new Orders("one","ujjawal","i am ujjawal"),
            new Orders("two","ujjawal","i am sanjay"),
            new Orders("three","ujjawal","i am nitya tyagi")
    ));

    public List<Orders> getAllOrder(){
        return orders;
    }

    public Orders getOneOrder(String id){
        return orders.stream().filter(t->t.getId().equals(id)).findFirst().get();
    }

    public void addOrder(Orders newTopic) {
        orders.add(newTopic);
    }


}
