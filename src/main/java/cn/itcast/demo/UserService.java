package cn.itcast.demo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserService {
    private String username;

    public  void play(){
        System.out.println("----------play()--------"+username);
    }

}
