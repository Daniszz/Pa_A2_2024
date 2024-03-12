/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2;

import java.time.LocalTime;
import java.util.Objects;

/**
 *
 * @author danis
 */
/**
 * Represents a client.
 */
public class Client {
    private String name;
    private ClientType type;
    private LocalTime minTime;
    private LocalTime maxTime;

    /**
     *
     */
    public Client() {
    }

    /**
     *
     * @param name
     */
    public Client(String name) {
        this.name = name;
    }

    /**
     *
     * @param name
     * @param minTime
     * @param maxTime
     */
    public Client(String name, LocalTime minTime, LocalTime maxTime) {
        this.name = name;
        this.minTime = minTime;
        this.maxTime = maxTime;
    }

    /**
     *
     * @param name
     * @param type
     * @param minTime
     * @param maxTime
     */
    public Client(String name, ClientType type, LocalTime minTime, LocalTime maxTime) {
        this.name = name;
        this.type = type;
        this.minTime = minTime;
        this.maxTime = maxTime;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public LocalTime getMaxTime() {
        return maxTime;
    }

    /**
     *
     * @param maxTime
     */
    public void setMaxTime(LocalTime maxTime) {
        this.maxTime = maxTime;
    }

    /**
     *
     * @return
     */
    public LocalTime getMinTime() {
        return minTime;
    }

    /**
     *
     * @param minTime
     */
    public void setMinTime(LocalTime minTime) {
        this.minTime = minTime;
    }

    /**
     *
     * @return
     */
    public ClientType getType() {
        return type;
    }

    /**
     *
     * @param type
     */
    public void setType(ClientType type) {
        this.type = type;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Client{" + "name=" + name + ", type=" + type + ", minTime=" + minTime + ", maxTime=" + maxTime + '}';
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.name);
        hash = 41 * hash + Objects.hashCode(this.type);
        hash = 41 * hash + Objects.hashCode(this.minTime);
        hash = 41 * hash + Objects.hashCode(this.maxTime);
        return hash;
    }

    /**
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Client other = (Client) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.type != other.type) {
            return false;
        }
        if (!Objects.equals(this.minTime, other.minTime)) {
            return false;
        }
        return Objects.equals(this.maxTime, other.maxTime);
    }
}