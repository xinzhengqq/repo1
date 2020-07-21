package cn.itcast.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    //@Qualifier("UserDaoImpl1")
    UserDao userDaoImpl1;
    public void findUsers() {
        userDaoImpl1.findUsers();
    }
}
