package basic_intro;

public class math_method {
    public static void main(String[] args){
		int compare_x = 10;
		int compare_y = 20;
		int z = Math.max(compare_x,compare_y);
		int compare_small = Math.min(compare_x,compare_y);
		System.out.println("The max number is "+z);
		System.out.println("The min number is "+compare_small);
		double pi = 3.14;
		System.out.println(Math.floor(pi));
//      you can do max min abs sqrt round ceil floor and ...

		// find the hypotenus of a triangle
		// scanner version
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter the triangle base number");
//		int ask_base = Integer.parseInt(scanner.nextLine());
//		System.out.println("Enter the triangle height number");
//		int ask_height = Integer.parseInt(scanner.nextLine());
//		double result_hypotenus = Math.sqrt(Math.pow(ask_base,2)+Math.pow(ask_height,2));
//		System.out.println("The number of the triangle's hypotenus is "+result_hypotenus);

		// the message box version
//		int ask_base = Integer.parseInt(JOptionPane.showInputDialog("Enter the triangle base number"));
//		int ask_height = Integer.parseInt(JOptionPane.showInputDialog("Enter the triangle height number"));
//		double result_hypotenus = Math.sqrt(Math.pow(ask_base,2)+Math.pow(ask_height,2));
//		JOptionPane.showMessageDialog(null,"The number of the triangle's hypotenus is "+result_hypotenus);
    }
}
