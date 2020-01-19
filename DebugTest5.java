package debugeExample;

import java.util.Scanner;

public class DebugTest5 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("gaadi ka speed ");
		int speed = sc.nextInt();
		if (speed < 30) {
			System.out.println("speed  bahut kam hain");}
		 else if (speed <= 60) {
			System.out.println("speed kam hai");}
		 else if (speed >= 100) {
			System.out.println("speed bahut fast hain");
		}
	}

}
