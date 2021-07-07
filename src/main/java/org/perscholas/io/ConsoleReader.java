package org.perscholas.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {

	public static void main(String[] args) throws IOException {
		BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input name:");
		String name = 	R.readLine();
		System.out.println(name);

	}

}
