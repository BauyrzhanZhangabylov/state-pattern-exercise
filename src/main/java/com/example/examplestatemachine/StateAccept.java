package com.example.examplestatemachine;

public class StateAccept extends State {
    public StateAccept(StateContext sc) {
        super(sc);
    }

    @Override
    public void actionA() {
        if (sc.getFirstAction().equals(Action.A)) {
            sc.setState(sc.getStateAccept());
        } else {
            sc.setState(sc.getStateReject());
        }
    }

    @Override
    public void actionB() {
        if (sc.getFirstAction().equals(Action.B)) {
            sc.setState(sc.getStateAccept());
        } else {
            sc.setState(sc.getStateReject());
        }
    }
}
