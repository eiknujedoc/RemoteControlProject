import java.util.Scanner;

public class RemoteControlApp {

	public static void main(String[] args) {
		
		boolean turnedOn = false;
		int buttonPressed = getButtonPressed();
		
	}

	public static int getButtonPressed() {
		Scanner kb = new Scanner(System.in);
		int buttonPressed = kb.nextInt();
		
	return buttonPressed;
	
	}	
}

