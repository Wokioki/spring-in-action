package com.springinaction.taco_cloud.controller;

import com.springinaction.taco_cloud.service.OrderAdminService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin")
public class AdminController {

    private OrderAdminService adminService;

    public AdminController(OrderAdminService adminService){
        this.adminService = adminService;
    }

    @GetMapping
    public String admin(Model model){
        model.addAttribute("orders", adminService.findAllOrders());
        return "admin";
    }

    @PostMapping("/deleteOrders")
    public String deleteOrders(){
        adminService.deleteAllOrders();
        return "redirect:/admin";
    }

    @PostMapping("/deleteOrder/{orderId}")
    public String deleteOrder(@PathVariable Long orderId) {
        adminService.deleteOrderById(orderId);
        return "redirect:/admin";
    }

}
