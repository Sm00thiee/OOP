package Lab4;

import java.util.Scanner;

public class Employees {
    private static Scanner scan = new Scanner(System.in);
    private int ID;
    private String name, Department;
    private double salary,extra,income;
    public Employees(){}
    public int getID(){return ID;}
    public String getName(){return name;}
    public String getDepartment(){return Department;}
    public double getSalary() { return salary; }
    public double getExtra() {return extra; }
    public double getIncome(){return income;}
    public void setID(){
        System.out.print("Ener ID: ");
        ID = scan.nextInt();
    }
    public void setName(){
        scan.nextLine();
        System.out.print("Enter name: ");
        name = scan.nextLine();
    }
    public void setDepartment(){
        System.out.print("Enter department: ");
        Department =scan.nextLine();
    }
    public void setSalary(){
        System.out.print("Enter salary and extra: ");
        salary = scan.nextDouble();
    }
    public void setExtra(){
        extra = scan.nextDouble();
    }
    public void setIncome(){
        income = salary+ 2.5*extra;
    }
}
