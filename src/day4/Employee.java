package day4;

abstract public class Employee {
    private String name;
    private int number;
    private MyDate birthday;
    public abstract double earnings();

    public Employee(String name, int number, MyDate birthday) {
        this.name = name;
        this.number = number;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", number=" + number +
                ", birthday=" + birthday.toDateString() ;
    }
}

class MyDate {
    private int year;
    private int month;
    private int day;
    public String toDateString() {
        return year + "年" + month + "月" + day + "日";
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}

class SalariedEmployee extends Employee {
    private double monthlySalary;

    public SalariedEmployee(String name, int number, MyDate birthday, double monthlySalary) {
        super(name, number, birthday);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double earnings() {
        return monthlySalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" + super.toString() + '}';
    }
}

class HourlyEmployee extends Employee {
    private double wage;
    private double hour;

    public HourlyEmployee(String name, int number, MyDate birthday, double wage, double hour) {
        super(name, number, birthday);
        this.wage = wage;
        this.hour = hour;
    }

    @Override
    public double earnings() {
        return wage*hour;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" + super.toString() + '}';
    }
}

class PayrollSystem {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
    }
}