package com.huzh.create.simplefactory;

/**
 * @author: YueXian
 * @date: 2024/6/27 15:44
 */
public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Product product = factory.createProduct("a");
        product.use();
    }
}
