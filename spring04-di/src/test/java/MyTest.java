import com.kuang.pojo.Student;
import com.kuang.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");

        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());

    }

    @Test
    public void test(){
        ApplicationContext contex =
                new ClassPathXmlApplicationContext("userbean.xml");

        User user = contex.getBean("user",User.class);
        System.out.println(user);

    }

    @Test
    public void test2(){
        ApplicationContext contex =
                new ClassPathXmlApplicationContext("userbean.xml");

        User user = contex.getBean("user2",User.class);
        System.out.println(user);

    }

    @Test
    public void test3(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("userbean.xml");

        User user1 = context.getBean("user2",User.class);
        User user2 = context.getBean("user2",User.class);

        System.out.println(user1 == user2);
    }
}
