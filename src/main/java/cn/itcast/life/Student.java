package cn.itcast.life;

public class Student {

    public Student(){
        System.out.println("Student构造方法被调用");
    }

    public void init(){
        System.out.println("容器创建时调用了");
    }

    public void service(){
        System.out.println("stu对象的service方法执行了");
    }

    public void destroy(){
        System.out.println("容器销毁时调用...");
    }
}
