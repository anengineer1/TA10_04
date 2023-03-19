package clases;

import java.util.Scanner;

public class UserInterface {

	final private boolean DEFAULT_END_SEQUENCE = false;

	private Scanner scn;
	private boolean end_sequence;

	public UserInterface(Scanner scn) {
		this.scn = scn;
		this.end_sequence = this.DEFAULT_END_SEQUENCE;
	}

	public boolean isHasEndSecuence() {
		return this.end_sequence;
	}

	public String getOperation() {
		System.out.println("Introduzca qué desea hacer ('e' para finalizar):");
		System.out.println("Sumar: +");
		System.out.println("Restar: -");
		System.out.println("Multiplicar: *");
		System.out.println("Potencia: p");
		System.out.println("Raíz cuadrada: sqrt");
		System.out.println("Raíz cúbica: cqrt");
		System.out.println("División: /");
		
		String operation_to_do = this.scn.nextLine();
		if (operation_to_do.contains("e")) {
			this.end_sequence = true;
		}

		return operation_to_do;
	}

	public void askForSum() {
		System.out.println("Introduzca 2 sumandos:");
	}

	public double getDouble() {
		System.out.print("Introduzca valor: ");
		return scn.nextDouble();
	}

	public void printResult(double d) {
		System.out.println("El resultado es: " + d);

	}

	public void askForDif() {
		System.out.println("Introduzca minuendo - sustraendo:");
	}

	public void askForMult() {
		System.out.println("Introduzca 2 números a multiplicar entre sí:");

	}

	public void askForPower() {
		System.out.println("Introduzca num1^num2:");		
	}

	public void askForSqrt() {
		System.out.println("Introduzca número sobre el cual hacer raíz cuadrada:");	
		
	}

	public void askForCbrt() {
		System.out.println("Introduzca número sobre el cual hacer raíz cúbica:");	
		
	}

	public void askForDivision() {
		System.out.println("Introduzca num1 / num2:");
		
	}

}
