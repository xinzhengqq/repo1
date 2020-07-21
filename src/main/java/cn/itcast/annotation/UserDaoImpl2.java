package cn.itcast.annotation;

import org.springframework.stereotype.Repository;

@Repository("userDaoImpl2")
public class UserDaoImpl2 implements UserDao {


    public void findUsers() {
        System.out.println("------UserDaoImpl2-----findUsers--");
    }
}
