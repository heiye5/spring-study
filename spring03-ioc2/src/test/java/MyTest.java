import com.kuang.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) context.getBean("user");
//        User user2 = (User) context.getBean("user");

//        System.out.println(user == user2);              //同一个对象
        System.out.println(user.toString());
    }
}
