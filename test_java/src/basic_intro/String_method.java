package basic_intro;

public class String_method {
    public static void main(String[] args){
        // string method
        // compare len find_char indexof check_blank_empty upper lower strip_trim replace
		String my_name = "JJUN";

//		boolean result = my_name.equals("Jun");
//		boolean result = my_name.equalsIgnoreCase("JUN");
//		int result = my_name.length();
//		char result = my_name.charAt(0);
//		int result = my_name.indexOf("J");
//		boolean result = my_name.isEmpty();
//		boolean result2 = my_name.isBlank();
//		String result = my_name.toLowerCase();
//		String result = my_name.toUpperCase();
//		String result = my_name.trim();
//		String result = my_name.replace('J','F');
		String result = my_name.replaceAll("J","F");

		System.out.println(result);
    }
}
