package main;

import java.util.InputMismatchException;
import java.util.Scanner;

import clases.UserInterface;

public class TA10_04_App {

	public static void main(String[] args) {

		double number1;
		double number2;
		// Because we are dealing with doubles, we have to throw the exceptions manually

		Scanner scn = new Scanner(System.in);

		UserInterface user_interface = new UserInterface(scn);

		while (!user_interface.isHasEndSecuence()) {
			try {
				switch (user_interface.getOperation()) {
				case "+":
					user_interface.askForSum();
					number1 = user_interface.getDouble();
					number2 = user_interface.getDouble();
					user_interface.printResult(number1 + number2);
					break;

				case "-":
					user_interface.askForDif();
					number1 = user_interface.getDouble();
					number2 = user_interface.getDouble();
					user_interface.printResult(number1 - number2);
					break;

				case "*":
					user_interface.askForMult();
					number1 = user_interface.getDouble();
					number2 = user_interface.getDouble();
					user_interface.printResult(number1 * number2);
					break;

				case "p":
					user_interface.askForPower();
					number1 = user_interface.getDouble();
					number2 = user_interface.getDouble();
					if ((number1 == 0.0) && (number2 < 0.0)) { // Negative exponents can provoke n/0
						throw new ArithmeticException();
					}
					user_interface.printResult(Math.pow(number1, number2));
					break;

				case "sqrt":
					user_interface.askForSqrt();
					number1 = user_interface.getDouble();
					if (number1 < 0.0)
						throw new ArithmeticException();
					user_interface.printResult(Math.sqrt(number1));
					break;

				case "cbrt":
					user_interface.askForCbrt();
					number1 = user_interface.getDouble();

					user_interface.printResult(Math.cbrt(number1));
					break;

				case "/":
					user_interface.askForDivision();
					number1 = user_interface.getDouble();
					number2 = user_interface.getDouble();
					if (number2 == 0.0)
						throw new ArithmeticException();
					user_interface.printResult((number1 / number2));
					break;

				default:
					break;
				}

			} catch (InputMismatchException e) {
				System.out.println("El valor introducido no es un número");
				scn.nextLine(); // to clean the Scanner
			} catch (ArithmeticException e) {
				System.out.println("El valor introducido no permite un resultado válido");
				scn.nextLine();
			}

		}
		scn.close();
	}

}
