package Spring_Lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ClassThree implements InitializingBean, DisposableBean {
    public  ClassThree (){
        super();
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Car owener Fetch name And Cra number");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("after show number and car owner name stop the code");

    }
}
