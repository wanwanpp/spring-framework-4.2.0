import com.wp.debugSpring.Foo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

    public static void main(String[] args) {
        ApplicationContext factory = new ClassPathXmlApplicationContext("com\\wp\\debugSpring\\testbean.xml");

        Foo bean = (Foo) factory.getBean("wanwanpp");
        bean.execute();
    }
}  