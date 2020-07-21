package cn.itcast.di;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String name;
    private int age;
    private String address;
    private Date birthday;
}
