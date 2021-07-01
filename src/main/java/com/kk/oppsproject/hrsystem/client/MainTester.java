package com.kk.oppsproject.hrsystem.client;

import java.util.InputMismatchException;

public class MainTester {
	public static void main(String[] args) {
		try {
			TransactionPicker.pickTransaction();
		}catch (NullPointerException e) {
			e.getMessage();
			TransactionPicker.pickTransaction();
		}catch (InputMismatchException e){
			System.out.println("You Entered unwanted type of input!!\n Please enter carefully with this new transaction now!");
			TransactionPicker.pickTransaction();
		}
	}
}
