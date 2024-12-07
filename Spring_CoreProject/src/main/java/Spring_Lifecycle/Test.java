package Spring_Lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context= new ClassPathXmlApplicationContext("Configuration.xml");
        Student student=(Student)context.getBean("studentone");

       /* System.out.println("++++++++++++++++++++");
        System.out.println(student);
*/
      /* Class sc=(Class) context.getBean("classy");
        System.out.println(sc);
        context.registerShutdownHook();


        System.out.println("++++++++++++++++++++++++++");

        ClassTwo c2=(ClassTwo)context.getBean("c2");


        System.out.println(c2);

        System.out.println("+++++++++++++++++++++");
*/
        ClassFour classFour= (ClassFour) context.getBean("c3");
        System.out.println(classFour);



    }

}
