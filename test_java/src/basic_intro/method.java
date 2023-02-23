package basic_intro;

public class method {

    public static void main(String[] args){

        hello("Junpeng");

        int num1 = 12;
        int num2 = 12;
        int result = sum(num2,num1);
        System.out.println("The result of "+ num1+" and "+num2+" is "+result);
    }

    static void hello(String name){
        System.out.println("Hello "+ name);
    }

    static int sum(int x, int y ){
        int z = x+y;
        return z;
    }
}
