package Spring_Autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new
                ClassPathXmlApplicationContext("Auto.xml");
        Employee employee = context.getBean("employee", Employee.class);

        employee.displayInfo();
    }
}
