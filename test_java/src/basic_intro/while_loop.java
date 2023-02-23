package basic_intro;
import java.util.Scanner;
public class while_loop {
    public static void main(String[] args){
//        while (1==1){
//			System.out.println("Hello Java");
//		} // as long as the condition is true, the function will keep running

		String ask_name = "";
		while (ask_name.isBlank()){
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter your name: ");
			ask_name = scanner.nextLine();
		}
		System.out.println("Hello "+ask_name);


		// do while loop
//		Scanner scanner = new Scanner(System.in);
//		String ask_name = "";
//
//		do {
//			System.out.print("Enter your name: ");
//			ask_name = scanner.nextLine();
//		}while (ask_name.isBlank());
//
//		System.out.println("Hello "+ask_name);
    }
}
