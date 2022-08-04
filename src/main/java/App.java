import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());

        boolean df = bean == bean2;
        System.out.println(df);

        Cat beancat = (Cat) applicationContext.getBean("cat");
        System.out.println(beancat.getCat());

        Cat beancat2 = (Cat) applicationContext.getBean("cat");
        System.out.println(beancat2.getCat());

        boolean cat = beancat == beancat2;
        System.out.println(cat);
    }
}