package basic_intro;

public class array {
    public static void main(String[] args){
        // array
//		String[] cars = {"camero","BMW","tesla"}; // one way to do it

		String[] cars = new String[3]; // another way to do it

		cars[0] = "camero";
		cars[1] = "BMW";
		cars[2] = "tesla";

		for (int i = 0; i<cars.length; i++){
			System.out.println(cars[i]);
		}




		// 2D array which is array in a array

		String[][] cars_2d = {
				{"crown","corolla","camry"},
				{"HR-V","CR-V","civic"},
				{"models","modely","modelx"}
		};
//		 other way to make a 2d array

//		String[][] cars_2d = new String[3][3];
//		cars[0][0] = "crown".....

		for (int i = 0;i<cars.length;i++){
			System.out.println();
			for (int j = 0;j<cars_2d[i].length;j++){
				System.out.print(cars_2d[i][j]+" ");
			}
		}
    }
}
