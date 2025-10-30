package com.springinaction.taco_cloud.controller;

import com.springinaction.taco_cloud.model.TacoOrder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@Slf4j
@RequestMapping("/orders")
@SessionAttributes("tacoOrder")
public class OrderController {

    @GetMapping("/current")
    public String orderForm(){
        return "orderForm";
    }

    @PostMapping
    public String processOrder(TacoOrder order,
                               SessionStatus sessionStatus) {
        log.info("Order submitted: {}",order);
        sessionStatus.setComplete();

        return "redirect:/";
    }
}
