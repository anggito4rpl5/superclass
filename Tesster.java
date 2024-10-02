package teacher;

import java.util.Scanner;

public class Tesster {

    public static void main(String[] args) {
        Scanner ito = new Scanner(System.in);
        System.out.println("      Selamat Datang      ");
        System.out.println("(-------Choose One-------)");
        System.out.println("1.Student\t2.Teacher");
        String choose = ito.nextLine();
        if (choose.equals("1")) {
            System.out.print("Nama : ");
            String name = ito.nextLine();
            System.out.print("Major : ");
            String major = ito.nextLine();
            System.out.print("Age : ");
            int age = ito.nextInt();
            ito.nextLine();
            System.out.print("Student Number : ");
            int studentnumber = ito.nextInt(); 
            ito.nextLine();
            System.out.print("Score : ");
            int score = ito.nextInt();
            ito.nextLine();
            System.out.println("      (berikut hasilnya)");
            Student student = new Student(name, age, studentnumber, score, major);
            System.out.println("---------");
            student.print();
        } else if (choose.equals("2")) {
            System.out.println("1.PartTime  atau  2.FullTime");
            int choose2 = ito.nextInt();
            ito.nextLine();
            if (choose2 == 1) {
                System.out.println();
                System.out.println("-- Part Time --");
                System.out.print("name : ");
                String name = ito.nextLine();
                System.out.print("subject : ");
                String subject = ito.nextLine();
                System.out.print("age : ");
                int age = ito.nextInt();
                System.out.print("hours worked = ");
                int hoursworked = ito.nextInt();
                int salary = hoursworked * 150000;
                ito.nextLine();
                Parttime parttime = new Parttime(name, subject, age, hoursworked);
                System.out.println("---------");
                parttime.print();
                System.out.println("Salary : " + salary);

            } else if (choose2 == 2) {
                System.out.println();
                System.out.println("-- Full Time --");
                System.out.print("name :   ");
                String name = ito.next();
                System.out.print("subject : ");
                String subject = ito.next();
                System.out.print("age : ");
                int age = ito.nextInt();
                System.out.print("anual salary = ");
                int anualsalary = ito.nextInt();
                ito.nextLine();
                System.out.print("unit = ");
                String unit = ito.nextLine();
                Fulltime fulltime = new Fulltime(name, age, subject, anualsalary, unit);
                System.out.println("---------");
                fulltime.print();

            }
        }ito.close();
    }
}
