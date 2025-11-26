package com.cjc.bms.serviceImp;

import com.cjc.bms.model.Account;
import java.util.Scanner;
import com.cjc.bms.service.Rbi;

public class Sbi implements Rbi {
	Account a = new Account();
	Scanner sc = new Scanner(System.in);

	public void createAccount() {

	        // Account Number
	        System.out.println("Enter Account Number (8–12 digits):");
	        long accno = sc.nextLong();
	        int accLen = String.valueOf(accno).length();

	        if (accLen >= 8 && accLen <= 12) {
	            a.setAccNo(accno);
	        } else {
	            System.out.println("Invalid Account Number");
	            return;
	        }

	        // Name
	        System.out.println("Enter Name:");
	        String name = sc.next();
	        if (name.matches("[a-zA-Z]+")) {
	            a.setName(name);
	        } else {
	            System.out.println("Invalid Name");
	            return;
	        }

	        // Mobile Number
	        System.out.println("Enter Mobile Number (10 digits):");
	        long mobNo = sc.nextLong();
	        if (String.valueOf(mobNo).length() == 10) {
	            a.setMobNo(mobNo);
	        } else {
	            System.out.println("Invalid Mobile Number");
	            return;
	        }

	        // Aadhaar
	        System.out.println("Enter Aadhaar Number (12 digits):");
	        long adharno = sc.nextLong();
	        if (String.valueOf(adharno).length() == 12) {
	            a.setAdharNo(adharno);
	        } else {
	            System.out.println("Invalid Aadhaar Number");
	            return;
	        }

	        // Gender
	        System.out.println("Enter Gender:");
	        a.setGender(sc.next());

	        // Age
	        System.out.println("Enter Age:");
	        int age = sc.nextInt();
	        if (age >= 18) {
	            a.setAge(age);
	        } else {
	            System.out.println("Age must be 18+");
	            return;
	        }

	        // Balance
	        System.out.println("Enter Initial Balance:");
	        a.setBalance(sc.nextDouble());

	        System.out.println("Account Created Successfully!");
	    }

	    public void displayAllDetails() {
	        System.out.println("Account No = " + a.getAccNo());
	        System.out.println("Name = " + a.getName());
	        System.out.println("Mobile = " + a.getMobNo());
	        System.out.println("Aadhar = " + a.getAdharNo());
	        System.out.println("Gender = " + a.getGender());
	        System.out.println("Age = " + a.getAge());
	        System.out.println("Balance = " + a.getBalance());
	    }

	    public void depositMoney() {
	        System.out.println("Enter Account Number:");
	        long accno = sc.nextLong();

	        if (accno == a.getAccNo()) {
	            System.out.println("Enter Deposit Amount:");
	            double amount = sc.nextDouble();

	            a.setBalance(a.getBalance() + amount);
	            System.out.println("Amount Deposited Successfully!");
	            System.out.println("Updated Balance = " + a.getBalance());
	        } else {
	            System.out.println("Invalid Account Number");
	        }
	    }

	    public void withdrawal() {
	        System.out.println("Enter Account Number:");
	        long accno = sc.nextLong();

	        if (accno == a.getAccNo()) {
	            System.out.println("Enter Withdrawal Amount:");
	            double amount = sc.nextDouble();

	            if (a.getBalance() >= amount) {
	                a.setBalance(a.getBalance() - amount);
	                System.out.println("Withdrawal Successful!");
	                System.out.println("Updated Balance = " + a.getBalance());
	            } else {
	                System.out.println("Insufficient Balance");
	            }
	        } else {
	            System.out.println("Invalid Account Number");
	        }
	    }

	    public void balancecheck() {
	        System.out.println("Enter Account Number:");
	        long accno = sc.nextLong();

	        if (accno == a.getAccNo()) {
	            System.out.println("Current Balance = " + a.getBalance());
	        } else {
	            System.out.println("Invalid Account Number");
	        }
	    }
	
	
	
	
	
	
	
}
