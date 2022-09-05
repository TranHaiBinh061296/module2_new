package practice_activities.da_hinh;

public class Employee extends Person{
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void information() {
        System.out.println("Class child");
    }
}
