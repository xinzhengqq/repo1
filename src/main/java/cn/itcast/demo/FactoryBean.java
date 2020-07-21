package cn.itcast.demo;

public class FactoryBean {

    public FactoryBean(){
        System.out.println("-----------FactoryBean的构造方法-------------");
    }

    public User getUser(){
        return new User();
    }
}