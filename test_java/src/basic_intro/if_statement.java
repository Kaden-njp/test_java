package basic_intro;
import java.util.Scanner;
public class if_statement {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
		System.out.println("What is your age?");
		int age_get = scanner.nextInt();
		if (age_get < 18){
			System.out.println("You are not a adult");
		} else if (age_get >= 18) {
			System.out.println("Your are a adult");
		}
    }
}
