package com.yuexian.behaviorpatterns.state.demo2;

/**
 * @author yuexian
 * @description 环境类
 * @date 2021.4.14 16:05
 */
public class ScoreContext {
    private AbstractState state;

    ScoreContext() {
        state = new LowState(this);
    }

    public void setState(AbstractState state) {
        this.state = state;
    }

    public AbstractState getState() {
        return state;
    }

    public void add(int score) {
        state.addScore(score);
    }
}
