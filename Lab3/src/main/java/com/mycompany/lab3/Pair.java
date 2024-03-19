/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3;

/**
 *
 * @author danis
 * @param <T>
 * @param <U>
 */
public class Pair<T, U> {
    private T key;
    private U value;

    /**
     *
     * @param key
     * @param value
     */
    public Pair(T key, U value) {
        this.key = key;
        this.value = value;
    }

    /**
     *
     * @return
     */
    public T getKey() {
        return key;
    }

    /**
     *
     * @param key
     */
    public void setKey(T key) {
        this.key = key;
    }

    /**
     *
     * @return
     */
    public U getValue() {
        return value;
    }

    /**
     *
     * @param value
     */
    public void setValue(U value) {
        this.value = value;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Pair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
