package Collect;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

    public static void main(String[] args) {
            // Load Spring configuration
            ApplicationContext context = new ClassPathXmlApplicationContext("Coll.xml");

            // Retrieve the bean
            CollOne collOne=(CollOne) context.getBean("collectionBean");

            // Display the collections
            System.out.println("Name List: " + CollOne.getNameList());
            System.out.println("Name Map: " + CollOne.getNameMap());
            System.out.println("App Properties: " + CollOne.getAppProperties());
        }
    }


