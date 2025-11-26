package com.cjc.bms.client;

import com.cjc.bms.service.*;
import com.cjc.bms.serviceImp.*;
import java.util.Scanner;

public class Test {
	public static void main(String args[]) {
		Rbi bank = new Sbi();
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to our bank");
	
		while (true){
			System.out.println("Please check on option");
			System.out.println("1.Create account");
			System.out.println("2.display all ditals");
			System.out.println("3.Deposite amount");
			System.out.println("4.Withdrawal amount");
			System.out.println("5.check balance");
			System.out.println("6.Exit");
			System.out.println("Enter your Choice");
			int ch = sc.nextInt();
			if (ch == 1) {
				bank.createAccount();
			}else if (ch == 2) {
				bank.displayAllDetails();
			}else if (ch == 3) {
				bank.depositMoney();
			}else if (ch == 4) {
				bank.withdrawal();
			}else if (ch == 5) {
				bank.balancecheck();
			}else if (ch == 6)
				break;
			else
				System.out.println("wrong Choice");
		}
	}
}
