package basic_intro;

public class for_loop {
    public static void main(String[] args){
        // for loop
		for (int i = 0; i<=10; i++){
			System.out.println(i);
		}

//        count down happy new year
		for (int init_num = 10; init_num>=0; init_num--){
			System.out.println(init_num);
		}
		System.out.println("HAPPY NEW YEAR");

//        SAME count down but decreate by two
		for (int init_num = 10; init_num>=0; init_num=init_num-2){
			System.out.println(init_num);
		}
		System.out.println("HAPPY NEW YEAR");

		for (int init_num = 10; init_num>=0; init_num-=2){
			System.out.println(init_num);
		}
		System.out.println("HAPPY NEW YEAR");

         //the 3rd args can be write down in the for loop just like python
		for (int init_num = 10; init_num>=0; ){
			System.out.println(init_num);
			init_num-=2;
		}
		System.out.println("HAPPY NEW YEAR");
    }
}
