package comparable.application.entities;

public class Funcionario implements Comparable<Funcionario>{
    private String name;
    private Double salary;

    public Funcionario(){

    }

    public Funcionario(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Funcionario: " +
                "name = " + name  +
                ", salary =" + salary;
    }

    @Override
    public int compareTo(Funcionario o) {
        return -salary.compareTo(o.getSalary());
    }
}
