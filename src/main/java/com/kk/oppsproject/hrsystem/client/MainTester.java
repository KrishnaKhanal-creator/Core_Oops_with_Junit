package com.kk.oppsproject.hrsystem.client;

import java.util.InputMismatchException;

public class MainTester {
	public static void main(String[] args) {
		try {
			TransactionPicker.pickTransaction();
		}catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("No data found of your entry");
			TransactionPicker.pickTransaction();
		}catch (InputMismatchException e){
			e.printStackTrace();
			System.out.println("You Entered unwanted type of input!!\n Please enter carefully with this new transaction now!");
			TransactionPicker.pickTransaction();
		}
	}
}
