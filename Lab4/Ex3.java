package Lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Employees[] p = new Employees[n];
        add(p);
        display(p);
    }
    private static void add(Employees[] p){
        for(int i=0;i<p.length;i++) {
            p[i] = new Employees();
            p[i].setID();
            p[i].setName();
            p[i].setDepartment();
            p[i].setSalary();
            p[i].setExtra();
            p[i].setIncome();
        }
        // Create employees.txt
        try{
            File employeeData =new File("employees.txt");
            if(employeeData.createNewFile()){
                System.out.println("File created: " + employeeData.getName());
            }
            else{
                System.out.println("\nFile already created\n");
            }
        } catch (IOException e) {
            System.out.println("error");
            e.printStackTrace();
        }
        // write information to text
        try{
            FileWriter DataWriter = new FileWriter("employees.txt");
            for(int i=0;i<p.length;i++){
                DataWriter.write("----\nID: "+p[i].getID()+"\n" +
                        "Name: "+p[i].getName()+"\n" +
                        "Department: "+p[i].getDepartment()+"\n" +
                        "Basic salary: " + p[i].getSalary() +"\n"+
                        "Extra salary: " + p[i].getExtra() +"\n"+
                        "Salary: "+ p[i].getIncome()+"\n\n");
            }
            DataWriter.close();
        } catch (IOException e) {
            System.out.println("error");
            e.printStackTrace();
        }
    }
    private static void display(Employees[] p){ // display information
        try{
            File Data = new File("employees.txt");
            Scanner read = new Scanner(Data);
            while(read.hasNextLine()){
                String data = read.nextLine();
                System.out.println(data);
            }
            read.close();
        } catch (FileNotFoundException e) {
            System.out.println("ERROR");
            e.printStackTrace();
        }
    }
}
