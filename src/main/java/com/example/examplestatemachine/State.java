package com.example.examplestatemachine;

public abstract class State {
    protected StateContext sc;
    protected boolean accept = false;

    public State(StateContext sc) {
        this.sc = sc;
    }

    public void actionA() {
        if (sc.getFirstAction().equals(Action.A)) {
            sc.setState(sc.getStateAccept());
        } else {
            sc.setState(sc.getStateReject());
        }
    }

    public void actionB() {
        if (sc.getFirstAction().equals(Action.B)) {
            sc.setState(sc.getStateAccept());
        } else {
            sc.setState(sc.getStateReject());
        }
    }

    public boolean isAccept() {
        return this.accept;
    }

    enum Action {
        A, B
    }
}
