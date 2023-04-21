package edu.iu.c322.demo.trackingservice.controller;

import edu.iu.c322.demo.trackingservice.model.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/tracking")
public class TrackingController {

    private final WebClient orderService;

    public TrackingController(WebClient.Builder webClientBuilder) {
        orderService = webClientBuilder.baseUrl("http://localhost:8083").build();
    }


    @GetMapping("/{orderId}")
    public Mono<Order> findByOrderIdandItemId(@PathVariable int orderId,@PathVariable int itemId){
        return orderService.get().uri("/orders/order/{orderId}/{itemId}", orderId,itemId)
                .retrieve()
                .bodyToMono(Order.class);

    }


}
