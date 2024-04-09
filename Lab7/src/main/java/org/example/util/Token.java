package org.example.util;

public class Token extends Pair<Integer,Integer>{
    public Token(int token1, int token2) {
        this.setToken1(token1);
        this.setToken2(token2);
    }

    @Override
    public String toString() {
        return this.getToken1() + " " + this.getToken2();
    }
}
