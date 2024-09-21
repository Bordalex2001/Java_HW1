package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Program {

	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		
		stdinAndStdout(scan);
		System.out.println();
		ifAndElse(scan);
		System.out.println();
		Loops();
		
		scan.close();
	}
	
	public static void stdinAndStdout(Scanner scan) {
		System.out.println("Enter number a:");
		int a = scan.nextInt();
		System.out.println("Enter number b:");
		int b = scan.nextInt();
		System.out.println("Enter number c:");
		int c = scan.nextInt();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

	public static void ifAndElse(Scanner scan) {
		System.out.println("Enter number:");
		int N = scan.nextInt();
		scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		if (N % 2 != 0 || N >= 6 && N <= 20){
			System.out.println("Weird");
		}
		else{
			System.out.println("Not Weird");
		}
	}
	
	public static void Loops() throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter number:");
		int N = Integer.parseInt(bufferedReader.readLine().trim());
		int i = 1;
       
		while(i <= 10){
			int result = N * i;
			System.out.println(N + " x " + i + " = " + result);
			i++;
		}
		
		bufferedReader.close();
	}
}