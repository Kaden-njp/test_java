package basic_intro;

public class switch_statement {
    public static void main(String[] args){
        String password = "123456789";
		switch (password){
			case "123": System.out.println("Your password is 123");
			break;
			case "123456789": System.out.println("Your password is 123456789");
			break;
		}
    }
}
