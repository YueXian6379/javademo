package com.yuexian.behaviorpatterns.state.demo2;

/**
 * @author yuexian
 * @description 抽象状态类
 * @date 2021.4.14 16:05
 */
public abstract class AbstractState {
    protected ScoreContext hj;  //环境
    protected String stateName; //状态名
    protected int score; //分数

    public abstract void checkState(); //检查当前状态

    public void addScore(int x) {
        score += x;
        System.out.print("加上：" + x + "分，\t当前分数：" + score);
        checkState();
        System.out.println("分，\t当前状态：" + hj.getState().stateName);
    }
}
