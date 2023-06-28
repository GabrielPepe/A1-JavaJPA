package principal.control;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Prompt {
	
	public static int lerInteiro() {
		Scanner lerInt = new Scanner(System.in);
		int num = lerInt.nextInt();
		return num;
	}
	
	public static String lerLinha() {
		while (true) {
			try {
				InputStreamReader isr = new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(isr);
				return br.readLine();
			} catch (IOException e) {
				System.out.println("Texto inválido, digite novamente...");
			}
		}
	}
}
