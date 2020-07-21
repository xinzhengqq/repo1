package cn.itcast.annotation;

import org.springframework.stereotype.Repository;

@Repository("userDaoImpl1")
public class  UserDaoImpl1 implements UserDao {


    public void findUsers() {
        System.out.println("------UserDaoImpl1-----findUsers--");
    }
}
