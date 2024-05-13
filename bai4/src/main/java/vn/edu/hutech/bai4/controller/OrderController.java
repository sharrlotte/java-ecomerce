package vn.edu.hutech.bai4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.validation.Valid;
import vn.edu.hutech.bai4.model.CartItem;
import vn.edu.hutech.bai4.model.Order;
import vn.edu.hutech.bai4.service.CartService;
import vn.edu.hutech.bai4.service.OrderService;

@Controller
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @Autowired
    private CartService cartService;

    @GetMapping("/checkout")
    public String checkout(Model model) {
        model.addAttribute("order", new Order());
        return "/cart/checkout";
    }

    @PostMapping("/submit")
    public String submitOrder(String customerName, @Valid Order order, BindingResult result) {
        if (result.hasErrors()) {
            return "/cart/checkout";
        }

        List<CartItem> cartItems = cartService.getCartItems();
        if (cartItems.isEmpty()) {
            return "redirect:/cart";
        }
        orderService.createOrder(order, cartItems);
        return "redirect:/order/confirmation";
    }

    @GetMapping("/confirmation")
    public String orderConfirmation(Model model) {
        model.addAttribute("message", "Your order has been successfully placed.");
        return "cart/order-confirmation";
    }
}
