package Spring_Autowired;

public class Address{

        private String city;
        private String Area;

        public Address() {
        }

        public Address(String city, String Area) {
            this.city = city;
            this.Area = Area;
        }

        // Getters and setters
        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getArea() {
            return Area;
        }

        public void setArea(String Area) {
            this.Area= Area;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "city='" + city + '\'' +
                    ", Area='" + Area + '\'' +
                    '}';
        }
    }


