package Spring_Lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ClassFour {
    public ClassFour(){
        super();
    }
    private  String subjectname;

    public ClassFour(String subjectname) {
        this.subjectname = subjectname;
    }

    @Override
    public String toString() {
        return "ClassFour{" +
                "subjectname='" + subjectname + '\'' +
                '}';
    }

    public String getSubjectname() {
        return subjectname;
    }

    public void setSubjectname(String subjectname) {
          this.subjectname = subjectname;
    }
    @PostConstruct
        public  void  start(){
            System.out.println("started method");
        }
        @PreDestroy
        public void  end(){
            System.out.println("end method ");
        }
}
