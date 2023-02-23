package basic_intro;

public class swap_variables {
    public static void main(String[] args){
		String x = "10";
		String y = "20";
		String temp_for_swap;

		System.out.println(x+y);

		temp_for_swap = x; // temp is 10
		x = y; // x is 20
		y = temp_for_swap; //  y is 10
		System.out.println(x+y); // 2010
    }
}
