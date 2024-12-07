package Spring_Lifecycle;
public class Student {
    public  Student(){
        super();
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                '}';
    }

    private  int id;

    public Student(int id, String fname, String lname) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    private  String fname;
    private  String lname;
    public void init() {
        System.out.println(" ok Done");
    }
        public void destroy(){
            System.out.println(" Ok Work and clean up the code");
        }

}
