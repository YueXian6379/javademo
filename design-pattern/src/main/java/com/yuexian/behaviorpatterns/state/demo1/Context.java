package com.yuexian.behaviorpatterns.state.demo1;

/**
 * @author yuexian
 * @description 环境类
 * @date 2021.4.14 15:54
 */
public class Context {
    private State state;

    //定义环境类的初始状态
    public Context() {
        this.state = new ConcreteStateA();
    }

    //设置新状态
    public void setState(State state) {
        this.state = state;
    }

    //读取状态
    public State getState() {
        return (state);
    }

    //对请求做处理
    public void Handle() {
        state.Handle(this);
    }
}
