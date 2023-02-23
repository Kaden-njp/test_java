package basic_intro;
import java.util.Scanner;
public class nest_loop {
    public static void main(String[] args){
        // nest loop // loop in a loop
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your row#: ");
		int row_number = scanner.nextInt();
		System.out.print("Enter your column#: ");
		int column_number = scanner.nextInt();
		System.out.print("Enter a symbol you want to illustrate with: ");
		String symbol_use = scanner.next();
//
//
//
		for (int init_row =1; init_row<= row_number;){

			String new_symbol_use = "";
			for (int symbol_cal = 1; symbol_cal<= column_number;){
				new_symbol_use = new_symbol_use + symbol_use;
				symbol_cal = symbol_cal + 1;
			}
			System.out.print(new_symbol_use);

			init_row = init_row+1;
			System.out.println();
		}

        // more easy to do it
		for (int init_row=1; init_row<=row_number; init_row++){

			for (int init_column =1; init_column<=column_number; init_column++){
				System.out.print(symbol_use);
			}
			System.out.println();

		}
    }
}
