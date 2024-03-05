/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2;

import java.time.LocalTime;

/**
 *
 * @author danis
 */
public class Client {
    private String name;
    private ClientType type;
    private LocalTime minTime;
    private LocalTime maxTime;

    public Client(String name, ClientType type, LocalTime minTime, LocalTime maxTime) {
        this.name = name;
        this.type = type;
        this.minTime = minTime;
        this.maxTime = maxTime;
    }

    public Client() {
    }

    public Client(String name) {
        this.name = name;
    }

   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClientType getType() {
        return type;
    }

    public void setType(ClientType type) {
        this.type = type;
    }

    public LocalTime getMinTime() {
        return minTime;
    }

    public void setMinTime(LocalTime minTime) {
        this.minTime = minTime;
    }

    public LocalTime getMaxTime() {
        return maxTime;
    }

    public void setMaxTime(LocalTime maxTime) {
        this.maxTime = maxTime;
    }

    @Override
    public String toString() {
        return "Client{" + "name=" + name + ", type=" + type + ", minTime=" + minTime + ", maxTime=" + maxTime + '}';
    }
    
}
