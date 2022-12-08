package Metotlar;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours; //weekly
        this.hireYear = hireYear;
    }

    double tax() {
        if (this.salary < 1000)
            return 0;
        else
            return (this.salary * 0.03);
    }

    double bonus() {
        if (this.workHours > 40)
            return ((this.workHours - 40) * 30.0);
        else
            return 0.0;
    }

    double raiseSalary() {
        if ((2021 - this.hireYear) < 10)
            return 0.05;
        else if ((2021 - this.hireYear) >= 10 && (2021 - this.hireYear) < 20)
            return 0.1;
        else
            return 0.15;
    }


    void String() {
        System.out.println("Name:\t" + this.name);
        System.out.println("Salary:\t" + this.salary);
        System.out.println("Work Hours:\t" + this.workHours);
        System.out.println("Hiring Year:\t" + this.hireYear);
        System.out.println("Tax:\t"+tax());
        System.out.println("Bonus:\t"+bonus());
        System.out.println("Salary Raise:\t"+raiseSalary()*this.salary);
        System.out.println("Current salary after raise and bonuses:\t" + (this.salary + bonus() - tax()));
        System.out.println("New salary after raise (without tax and bonuses):\t" + (this.salary * (1 + this.raiseSalary())));
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Kemal", 2000, 45, 1985);
        e1.String();
    }
}
