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

			switch (powerStatus) {
			case "ON":
			case "on":
				turnedOn = true;
				System.out.println("TURNING ON...");
				break;
			default:
				turnedOn = false;
			}
		} while (turnedOn == false);
	}

	public static void pressButton() {
		Scanner kb = new Scanner(System.in);
		boolean turnedOn = true;
		do {
			System.out.println("Press a button [0-9/OFF]");
			String buttonPressed = kb.next();

			switch (buttonPressed) {
			case "1":
			case "2":
			case "3":
			case "4":
			case "5":
			case "6":
			case "7":
			case "8":
			case "9":
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

		} while (turnedOn == true);

	}

	public static void powerOff() {
		System.out.println("TURNING OFF...");
	}
}
