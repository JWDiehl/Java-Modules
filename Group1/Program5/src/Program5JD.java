public class Program5JD {

    //Employee Class
    public class Employee {
        private String name;
        private String type;
        private int hours;
        private double wage;
        private double salary;

        //Constructor
        public Employee(String name, String type, int hours, double wage, double salary) {
            this.name = name;
            this.type = type;
            this.hours = hours;
            this.wage = wage;
            this.salary = salary;
        }

        //New method to create an employee object
        public Employee factory(String name, String type, int hours, double wage, double salary) {
            return new Employee(name, type, hours, wage, salary);
        }

        //Getter methods
        public String getName() {
            return name;
        }

        public String getType() {
            return type;
        }

        public int getHours() {
            return hours;
        }

        //Method to calc total pay
        public double totalPay() {
            return (type.equalsIgnoreCase("hourly")) ? hours * wage : salary;
        }
    }
}
