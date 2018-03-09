package com.example.examplestatemachine;

public class StateContext {
    private State state;

    private State.Action firstAction;

    private StateAccept stateAccept;
    private StateReject stateReject;

    public StateContext() {
        stateAccept = new StateAccept(this);
        stateReject = new StateReject(this);
        state = stateReject;
    }

    public void actionA() {
        if (firstAction == null) {
            firstAction = State.Action.A;
        }
        state.actionA();
    }

    public void actionB() {
        if (firstAction == null) {
            firstAction = State.Action.B;
        }
        state.actionB();
    }

    public boolean isAccept() {
        return state.isAccept();
    }

    public State.Action getFirstAction() {
        return this.firstAction;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
        state.accept = state instanceof StateAccept;
    }

    public State getStateAccept() {
        return this.stateAccept;
    }

    public State getStateReject() {
        return this.stateReject;
    }
}
