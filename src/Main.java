import Entities.Employee;
import Entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        Locale.setDefault(Locale.US);

        List<Employee> list = new ArrayList<>();


        System.out.print("Enther the numbers of Employees: ");
        int N = sc.nextInt();

        for (int i = 1; i <= N ; i++){
            System.out.println("EMPLOYEE #" + i + " DATA: ");
            System.out.print("Outsourced (Y/N)?  ");
            char employeType = sc.next().charAt(0);

                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Hour: ");
                int hours = sc.nextInt();
                System.out.print("Value per hour: ");
                double valueHour = sc.nextDouble();

                if (employeType == 'Y') {
                    System.out.print("Additional Charge: ");
                    double addCharge = sc.nextDouble();
                    Employee emp = new OutsourcedEmployee(name, hours, valueHour, addCharge);
                    list.add(emp);
                }
                else {
                    Employee emp = new Employee(name, hours, valueHour);
                    list.add(emp);
                }

        }

        System.out.println();
        System.out.println("PAYMENTS:");
        for ( Employee employee : list){
            System.out.println(employee.getName() + " - $" + employee.totalPayment());
        }

        sc.close();
    }
}