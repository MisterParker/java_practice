import java.io.*;
import java.util.Scanner;

import javafx.scene.effect.MotionBlur;

interface CreditCardAPP{
    public void getpersonaldetails(String name, String mob, String add, String nominee, int age, String email);
    public void calculatePerYearIncome(double grossSalary);
    public void PrintEligibility(double EMI);
}

class ICICI implements CreditCardAPP{
    String name;
    String mob;
    String add;
    String nominee;
    int age;
    String email;
    double netSalary;
    double perYearIncome;
    int eligibilityScore;

    public void getpersonaldetails(String name, String mob, String add, String nominee, int age, String email){
        this.name = name;
        this.mob = mob;
        this.add = add;
        this.nominee = nominee;
        this.age = age;
        this.email = email;
    }

    public void calculatePerYearIncome(double grossSalary) {
        netSalary = grossSalary - (grossSalary*0.2);
        perYearIncome = netSalary*12;
        System.out.println("The annual income is "+perYearIncome);
        // return perYearIncome;
    }

    public void PrintEligibility(double EMI){
        EMI = EMI*12;
        if(EMI==0)
            eligibilityScore = 3;
        else if(EMI>0 && EMI<=0.2*perYearIncome)
            eligibilityScore = 2;
        else if(EMI>0.2*perYearIncome && EMI <=0.4*perYearIncome)
            eligibilityScore = 1;
        else
            eligibilityScore = 0;

        System.out.println("##### ICICI BANK #####");
        System.out.println("Name    :"+name);
        System.out.println("Mobile  :"+mob);
        System.out.println("Address :"+add);
        System.out.println("Nominee :"+nominee);
        System.out.println("Age     :"+age);
        System.out.println("E-mail  :"+email);

        System.out.println();
        System.out.println("Eligibility Score = "+eligibilityScore);
        System.out.println();
    }
   
}

class HDFC implements CreditCardAPP{
    String name;
    String mob;
    String add;
    String nominee;
    int age;
    String email;
    double netSalary;
    double perYearIncome;
    int eligibilityScore;

    public void getpersonaldetails(String name, String mob, String add, String nominee, int age, String email){
        this.name = name;
        this.mob = mob;
        this.add = add;
        this.nominee = nominee;
        this.age = age;
        this.email = email;
    }

    public void calculatePerYearIncome(double grossSalary) {
        netSalary = grossSalary - (grossSalary*0.2);
        perYearIncome = netSalary*12;
        System.out.println("The annual income is "+perYearIncome);
        // return perYearIncome;
    }

    public void PrintEligibility(double EMI){
        EMI = EMI*12;
        if(EMI==0)
            eligibilityScore = 3;
        else if(EMI>0 && EMI<=0.2*perYearIncome)
            eligibilityScore = 2;
        else if(EMI>0.2*perYearIncome && EMI <=0.4*perYearIncome)
            eligibilityScore = 1;
        else
            eligibilityScore = 0;

        System.out.println("##### HDFC BANK #####");
        System.out.println("Name    :"+name);
        System.out.println("Mobile  :"+mob);
        System.out.println("Address :"+add);
        System.out.println("Nominee :"+nominee);
        System.out.println("Age     :"+age);
        System.out.println("E-mail  :"+email);

        System.out.println();
        System.out.println("Eligibility Score = "+eligibilityScore);
        System.out.println();
    }
}

class AXIS implements CreditCardAPP{
    String name;
    String mob;
    String add;
    String nominee;
    int age;
    String email;
    double netSalary;
    double perYearIncome;
    int eligibilityScore;

    public void getpersonaldetails(String name, String mob, String add, String nominee, int age, String email){
        this.name = name;
        this.mob = mob;
        this.add = add;
        this.nominee = nominee;
        this.age = age;
        this.email = email;
    }

    public void calculatePerYearIncome(double grossSalary) {
        netSalary = grossSalary - (grossSalary*0.2);
        perYearIncome = netSalary*12;
        // System.out.println("The annual income is "+perYearIncome);
        // return perYearIncome;
    }

    public void PrintEligibility(double EMI){
        EMI = EMI*12;
        if(EMI==0)
            eligibilityScore = 3;
        else if(EMI>0 && EMI<=0.2*perYearIncome)
            eligibilityScore = 2;
        else if(EMI>0.2*perYearIncome && EMI <=0.4*perYearIncome)
            eligibilityScore = 1;
        else
            eligibilityScore = 0;

        System.out.println("##### AXIS BANK #####");
        System.out.println("Name    :"+name);
        System.out.println("Mobile  :"+mob);
        System.out.println("Address :"+add);
        System.out.println("Nominee :"+nominee);
        System.out.println("Age     :"+age);
        System.out.println("E-mail  :"+email);

        System.out.println();
        System.out.println("The annual income is "+perYearIncome);
        System.out.println();
        System.out.println("Eligibility Score = "+eligibilityScore);
        System.out.println();
    }
}

class Bank{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Mobile No: ");
        String mob = sc.nextLine();
        System.out.println("Enter Address: ");
        String add = sc.nextLine();
        System.out.println("Enter Nominee: ");
        String nominee = sc.nextLine();
        System.out.println("Enter Age ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Email: ");
        String email = sc.nextLine();
        System.out.println("Enter Gross Salary: ");
        double grossSalary = sc.nextDouble();
        System.out.println("Enter EMI: ");
        double EMI = sc.nextDouble();

        ICICI i = new ICICI();
        HDFC h = new HDFC();
        AXIS a = new AXIS();

        i.getpersonaldetails(name, mob, add, nominee, age, email);
        h.getpersonaldetails(name, mob, add, nominee, age, email);
        a.getpersonaldetails(name, mob, add, nominee, age, email);

        i.calculatePerYearIncome(grossSalary);
        h.calculatePerYearIncome(grossSalary);
        a.calculatePerYearIncome(grossSalary);


        i.PrintEligibility(EMI);
        h.PrintEligibility(EMI);
        a.PrintEligibility(EMI);

    }
}