package Entities;

public class Employee {

    private String name;
    private Integer hoursWorked;
    private double valueHour;

    public Employee() {
    }

    public Employee(String name, Integer hoursWorked, Double valueHour) {
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.valueHour = valueHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(Integer hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public Double getValueHour() {
        return valueHour;
    }

    public void setValueHour(Double valueHour) {
        this.valueHour = valueHour;
    }

    public double totalPayment(){

        return hoursWorked * valueHour;
    }


}
