package org.example.util;


public class Token {
    private final int token1;
    private final int token2;

    public Token(int token1, int token2) {
        this.token1 = token1;
        this.token2 = token2;
    }

    public int getToken1() {
        return token1;
    }

    public int getToken2() {
        return token2;
    }

    @Override
    public String toString() {
        return "(" + token1 + ", " + token2 + ")";
    }

 
}

