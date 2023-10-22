
    public class Person {
        private String name;
        private int age;
        private String address;
        private String phoneNumber;
    
        public Person(String name, int age, String address, String phoneNumber) {
            this.name = name;
            this.age = age;
            this.address = address;
            this.phoneNumber = phoneNumber;
        }
    
        public String getName() {
            return name;
        }
    
        public int getAge() {
            return age;
        }
    
        public String getAddress() {
            return address;
        }
    
        public String getPhoneNumber() {
            return phoneNumber;
        }
    
        // Setter methods
        public void setName(String name) {
            this.name = name;
        }
    
        public void setAge(int age) {
            this.age = age;
        }
    
        public void setAddress(String address) {
            this.address = address;
        }
    
        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }
    
        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", address='" + address + '\'' +
                    ", phoneNumber='" + phoneNumber + '\'' +
                    '}';
        }
    
        public static void main(String[] args) {
            // Creating an instance of the Person class
            Person person = new Person("John Doe", 30, "123 Main St", "555-1234");
    
            // Accessing attributes and printing the person's information
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
            System.out.println("Address: " + person.getAddress());
            System.out.println("Phone Number: " + person.getPhoneNumber());
    
            // Modifying attributes
            person.setAge(31);
            person.setPhoneNumber("555-5678");
    
            // Printing updated information
            System.out.println("Updated Age: " + person.getAge());
            System.out.println("Updated Phone Number: " + person.getPhoneNumber());
        }
    }
    
    

