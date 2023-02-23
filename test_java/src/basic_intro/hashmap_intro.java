package basic_intro;
import java.util.HashMap;
public class hashmap_intro {
    public static void main(String[] args){
        // hashmap
		HashMap<String,String> coutry_capital = new HashMap<String,String>();

		coutry_capital.put("England", "London");
		coutry_capital.put("China", "Beiging");
		coutry_capital.put("Japan", "Tokyo");
		coutry_capital.put("Korea", "Seoul");

//		coutry_capital.clear();
		int size = coutry_capital.size();
		String get_China = coutry_capital.get("China");


		for (String i : coutry_capital.keySet()) {
			System.out.println(i);
		} // get keys

		for (String i : coutry_capital.keySet()) {
			System.out.println(coutry_capital.get(i));
		} // one way to get value through key

		for (String i : coutry_capital.values()) {
			System.out.println(i);
		}
    }
}
