package com.shoppingcart.application.controller;

import com.shoppingcart.application.dto.OrderDto;
import com.shoppingcart.application.model.Order;
import com.shoppingcart.application.model.OrderItem;
import com.shoppingcart.application.model.Product;
import com.shoppingcart.application.model.User;
import com.shoppingcart.application.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Controller
public class OrderController {
    @Autowired
    OrderService orderService;

    @RequestMapping(value = "/orders", method = RequestMethod.GET)
    public ModelAndView listOrders() {

        ModelAndView model = new ModelAndView();
        Order orderDto=new Order();
//        OrderItem orderItem=new OrderItem();
//        orderItem.setQuantity(500);
//        orderItem.setProduct(new Product());
//        orderDto.getOrderItems().add(orderItem);
        model.addObject("order",orderDto);
//        model.addObject("orderList", orderService.list());
        model.setViewName("order");

        return model;

    }

    @RequestMapping(value = "/orders", method = RequestMethod.POST)
    public String saveOrder(@ModelAttribute("order") @Valid Order order,
                            BindingResult result, Model model) {

        if (result.hasErrors()) {
            return "order";
        }
//        order.setUser(new User("sadeep"));
//        orderService.save(order);
        return "redirect:/orders";
    }
}
