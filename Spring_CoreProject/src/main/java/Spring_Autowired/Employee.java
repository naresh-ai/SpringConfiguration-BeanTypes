package Spring_Autowired;
import org.springframework.beans.factory.annotation.Autowired;
public class Employee {

       private String name;

        @Autowired
        private Address address;

        public Employee() {
           this.name = "Naresh";
        }


        public Address getAddress() {
            return address;
        }

        public void setAddress(Address address) {
            this.address = address;
        }

        public void displayInfo() {
           System.out.println("Employee Name  " + name);
            System.out.println("Address  " + address);
        }
    }


