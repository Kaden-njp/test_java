package basic_intro;
import java.util.Random;

public class random {
    public static void main(String[] args){
        Random random = new Random();
        boolean x = random.nextBoolean();
		System.out.println(x);
		int y = random.nextInt(11);
		System.out.println(y);
    }
}
