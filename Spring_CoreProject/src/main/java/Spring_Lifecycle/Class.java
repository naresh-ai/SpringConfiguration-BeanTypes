package Spring_Lifecycle;

public class Class {
    public Class(String clgowner) {
        this.clgowner = clgowner;
    }

    @Override
    public String toString() {
        return "Class{" +
                "clgowner='" + clgowner + '\'' +
                '}';
    }

    public String getClgowner() {
        return clgowner;
    }

    public void setClgowner(String clgowner) {
        this.clgowner = clgowner;
    }

    public Class (){
        super();
    }
    private  String clgowner;

}
