package Spring_Lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ClassTwo implements InitializingBean, DisposableBean {
     public ClassTwo(){
          super();
     }
     private  String  carname;

     @Override
     public String toString() {
          return "ClassTwo{" +
                  "carname='" + carname + '\'' +
                  ", ownername='" + ownername + '\'' +
                  '}';
     }

     public ClassTwo(String carname, String ownername) {
          this.carname = carname;
          this.ownername = ownername;
     }

     public String getCarname() {
          return carname;
     }

     public void setCarname(String carname) {
          this.carname = carname;
     }

     public String getOwnername() {
          return ownername;
     }

     public void setOwnername(String ownername) {
          this.ownername = ownername;
     }

     private  String  ownername;


     @Override
     public void afterPropertiesSet() throws Exception {
          System.out.println(" ok carownername show`");
     }

     @Override
     public void destroy() throws Exception {
          System.out.println(" back to work after show carowner name");
     }
}
