package org.example.util;

public class Pair<U,T> {
    private U token1;
    private T token2;

    public Pair(U token1, T token2) {
        this.token1 = token1;
        this.token2 = token2;
    }

    public Pair(){

    }

    public void setToken1(U token1) {
        this.token1 = token1;
    }


    public void setToken2(T token2) {
        this.token2 = token2;
    }

    public U getToken1() {
        return token1;
    }

    public T getToken2() {
        return token2;
    }
}