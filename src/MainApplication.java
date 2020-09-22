import java.util.Scanner;

public class MainApplication {

	public static void main(String[] args) {
		Menu menu = new Menu();
		Scanner scanner = new Scanner(System.in);
		menu.menu(scanner);
		scanner.close();
	}
}
