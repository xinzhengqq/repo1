package cn.itcast.demo;

public class StaticFactoryBean {
    public StaticFactoryBean() {
        System.out.println("----------staticFactoryBean构造方法");
    }

    public static User getUser(){
        System.out.println("----------静态工厂中的getUser()方法");
        return new User();
    }
}
