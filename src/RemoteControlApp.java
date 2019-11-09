
/*
User Story #1
When the user starts the program, it will print an initial message asking for input,

To begin, turn on the remote control:
and read the user's input.

User Story #2
If the user inputs anything other than ON, the initial message repeats until ON is entered.

User Story #3
Once the user types ON, output the message "TURNING ON...". (This output should be in a separate method.)

Write a method named pressButton() that prints the message "BOOP!" to the screen.

The program will now ask the user to enter the button number to press. Accept the input.

If the user enters a number 0 through 9, call the pressButton() method, and prompt for input again.

User Story #4
While the remote control is on, if the user enters anything other than 0 - 9 or OFF, 
output the message "Command not recognized" and prompt for input again.

User Story #5
If the user enters OFF, output the message "TURNING OFF..." 
(again, separate method), and the program ends.
*/

import java.util.Scanner;

public class RemoteControlApp {

	public static void main(String[] args) {
		
		powerOn();
		pressButton();
		powerOff();
		
	}
	
	public static void powerOn() {
		Scanner kb = new Scanner(System.in);
		boolean turnedOn = false;
		String powerStatus = "OFF";
		
		do {
			
		System.out.println("Enter [ON] to use your remote control.");
		powerStatus = kb.next();

		switch(powerStatus) {
		case "ON":
		case "on":
			turnedOn = true;
				System.out.println("TURNING ON...");
				break;
		default:
			turnedOn = false;
		}
		} while(turnedOn == false);
	}
		
	public static void pressButton() {
		Scanner kb = new Scanner(System.in);
		boolean turnedOn = true;
	do {
		System.out.println("Press a button [0-9/OFF]");
		String buttonPressed = kb.next();
		System.out.println(buttonPressed);
		
		switch(buttonPressed) {
		case "1":
			System.out.println("BOOP");
			break;
		case "2":
			System.out.println("BOOP");
			break;
		case "3":
			System.out.println("BOOP");
			break;
		case "4":
			System.out.println("BOOP");
			break;
		case "5":
			System.out.println("BOOP");
			break;
		case "6":
			System.out.println("BOOP");
			break;
		case "7":
			System.out.println("BOOP");
			break;
		case "8":
			System.out.println("BOOP");
			break;
		case "9":
			System.out.println("BOOP");
			break;
		case "0": 
			System.out.println("BOOP");
			break;
		case "OFF":
		case "off":
			turnedOn = false;
			kb.close();
			break;
		default:
			System.out.println("Command not recognized");
			buttonPressed = null;
		} 	
			
			
		} while(turnedOn == true);
	
	}
	public static void powerOff() {
		System.out.println("TURNING OFF...");
	}
}
