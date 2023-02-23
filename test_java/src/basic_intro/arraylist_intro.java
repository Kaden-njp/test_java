package basic_intro;
import java.util.ArrayList;
public class arraylist_intro {
    public static void main(String[] args){
        // arraylist
		ArrayList<String> food1 = new ArrayList<String>();

		food1.add("pizza");
		food1.add("hamburger");
		food1.add("HotDog");

//		food1.remove(0);
//		food1.set(0,"sushi");
//		food1.clear();

		for (int i = 0; i<food1.size(); i++){
			System.out.println(food1.get(i));
		}



		// 2d
		// 2D arraylist
		ArrayList<ArrayList<String>> restaurantList = new ArrayList<ArrayList<String>>();

		ArrayList<String> food = new ArrayList<String>();
		ArrayList<String> drink = new ArrayList<String>();

		food.add("pizza");
		food.add("hamburger");

		drink.add("fanda");
		drink.add("pessi");

		restaurantList.add(food);
		restaurantList.add(drink);

		for (int i = 0; i<restaurantList.size();i++){
			for (int j = 0; j<restaurantList.get(i).size(); j++){
				System.out.println(restaurantList.get(i).get(j));
			}
		}
    }
}
