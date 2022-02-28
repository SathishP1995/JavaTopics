public class Employee {
    public int age;
    public double salary;

    public Employee(int age, double salary) {
        this.age = age;
        this.salary = salary;
    }

    public Employee() {

    }


    public void toPrint() {
        System.out.println("Employee{" +"age=" + age +", salary=" + salary +'}');
    }                                    
}
