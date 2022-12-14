package com.example.Poha.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "gym")
public class Panner_model {
    @Id
    @GeneratedValue
    Long id;
    String name;
    int quantity;
    String type;

    public Panner_model() {
    }

    public Panner_model(Long id, String name, int quantity, String type) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
