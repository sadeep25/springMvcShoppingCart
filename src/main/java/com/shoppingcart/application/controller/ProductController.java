package com.shoppingcart.application.controller;

import com.shoppingcart.application.model.Product;
import com.shoppingcart.application.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public ModelAndView listProduct() {
        ModelAndView model = new ModelAndView();
        model.addObject("product", new Product());
        model.addObject("productList", productService.list());
        model.setViewName("product");

        return model;

    }

    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public String saveProduct(@ModelAttribute("product") @Valid Product product,
                              BindingResult result, Model model) {

        if (result.hasErrors()) {
            return "products";
        }
        productService.save(product);
        return "redirect:/products";
    }
}
