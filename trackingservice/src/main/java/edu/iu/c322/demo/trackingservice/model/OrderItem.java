package edu.iu.c322.demo.trackingservice.model;

public record OrderItem(int id,
                        String name,
                        int quantity,
                        float price) {
}
