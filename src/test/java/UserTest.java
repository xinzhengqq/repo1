import cn.itcast.annotation.UserDaoImpl1;
import cn.itcast.annotation.UserServiceImpl;
import cn.itcast.demo.User;
import cn.itcast.di.ComplexBean;
import cn.itcast.di.Person;
import cn.itcast.life.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.*;

public class UserTest {

    @Test
    public void testUser(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        User user = applicationContext.getBean("user", User.class);

        System.out.println(user);

    }

    @Test
    public void testUser02(){
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("E:\\ideaProjects\\SpringProject\\spring01\\src\\main\\resources\\applicationContext.xml");

        User user = applicationContext.getBean("user", User.class);

        System.out.println(user);

    }
   /* @Test
    public void testUser03(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        User user = applicationContext.getBean(User.class);

        System.out.println(user);

    }
*/
    @Test
    public void testStaticFactoryBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = context.getBean("staticFactory", User.class);
        System.out.println(user);
    }
    @Test
    public void testFactoryBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = context.getBean("user02", User.class);
        System.out.println(user);
    }

    @Test
    public void testUser04(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = context.getBean("user03",User.class);
        User user1 = context.getBean("user03",User.class);
        User user2 = context.getBean("user03",User.class);
        User user3 = context.getBean("user03",User.class);
        System.out.println(user);
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);


        User user4 = context.getBean("user04",User.class);
        User user5 = context.getBean("user04",User.class);
        User user6 = context.getBean("user04",User.class);
        User user7 = context.getBean("user04",User.class);
        System.out.println(user4);
        System.out.println(user5);
        System.out.println(user6);
        System.out.println(user7);

    }

    @Test
    public void testStudent(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = context.getBean(Student.class);
        student.service();
        context.close();
        student.service();

        System.out.println("----------------------------------------");
        /*Student student1 = context.getBean(Student.class);
        student1.service();*/
    }

    @Test
    public void testPerson(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = context.getBean("person", Person.class);
        System.out.println(person);
        Person person1 = context.getBean("person1", Person.class);
        System.out.println(person1);
    }


    @Test
    public void testComplexBean(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        ComplexBean complexBean = context.getBean("complexBean", ComplexBean.class);
        String[] arr = complexBean.getArr();
        System.out.println(Arrays.toString(arr));
        System.out.println("---------------------");
        List<Person> list = complexBean.getList();
        for (Person person : list) {
            System.out.println(person);
        }

        System.out.println("---------------------");
        Set<String> set = complexBean.getSet();
        System.out.println(set);
        System.out.println("---------------------");

        Map<String, Person> map = complexBean.getMap();
        Set<Map.Entry<String, Person>> entrySet = map.entrySet();
        for (Map.Entry<String, Person> entry : entrySet) {
            System.out.println(entry.getKey()+ " "+ entry.getValue());
        }

        System.out.println("---------------------");
        Properties properties = complexBean.getProperties();
        System.out.println(properties);
    }

    @Test
    public void testDao(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserDaoImpl1 userDaoImpl1 = context.getBean(UserDaoImpl1.class);
        userDaoImpl1.findUsers();
    }
    @Test
    public void testService(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        UserServiceImpl userService = context.getBean(UserServiceImpl.class);
        userService.findUsers();
    }
}
