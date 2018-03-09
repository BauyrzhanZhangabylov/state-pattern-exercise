package com.example.examplestatemachine;

public abstract class State {
    protected StateContext sc;
    protected boolean accept = false;

    public State(StateContext sc) {
        this.sc = sc;
    }

    public abstract void actionA();

    public abstract void actionB();

    public boolean isAccept() {
        return this.accept;
    }
}
