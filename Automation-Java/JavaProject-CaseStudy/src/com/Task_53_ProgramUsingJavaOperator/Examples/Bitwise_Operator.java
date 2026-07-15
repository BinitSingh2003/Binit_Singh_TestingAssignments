package com.Task_53_ProgramUsingJavaOperator.Examples;

public class Bitwise_Operator {

	public static void main(String[] args) {
		int a = 5;
		int b = 3;

		System.out.println("Bitwise AND (&): " + (a & b));
		System.out.println("Bitwise OR (|): " + (a | b));
		System.out.println("Bitwise XOR (^): " + (a ^ b));
		System.out.println("Bitwise Complement (~): " + (~a));
		System.out.println("Left Shift (<<): " + (a << 1));
		System.out.println("Right Shift (>>): " + (a >> 1));

	}

}
