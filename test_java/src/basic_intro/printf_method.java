package basic_intro;

public class printf_method {
    public static void main(String[] args){
        int year = 2002;
        String name = "Junpeng";
        boolean merry = false;
        double salary = 10000.0;

        System.out.printf("Hello %s, you were born in %d, now earn salary per year is %.2f, and your merry statue is %b",name,year,salary,merry);

    }
}
