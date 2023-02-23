package basic_intro;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class scanner_input {
    public static void main(String[] args){
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("What is your name?");
//		String name = scanner.nextLine();
//		System.out.println("Your name is "+name);

		// choose one
		//gui
		String ask_name_box = JOptionPane.showInputDialog("Enter you name");
		JOptionPane.showMessageDialog(null,"Your name is "+ask_name_box);

		int ask_age_box = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		JOptionPane.showMessageDialog(null,"Your age is "+ask_age_box);

    }
}
