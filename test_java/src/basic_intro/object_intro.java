package basic_intro;

public class object_intro {
    // simple one
    public static class human{
        int high = 198;

    }

//    public static void main(String[] agrs){
//        human jun = new human();
//        System.out.println(jun.high);
//    }

    public static class Car{

        String brand;
        boolean repair;
        Car(String brand,boolean repair){
            this.brand = brand;
            this.repair = repair;
        }

        void speeding(){
            System.out.println(this.brand+"is speeding");
        }

    }



    public static void main(String[] args){
        Car mycar1 = new Car("Nissan",false);
        System.out.println(mycar1.brand);

        Car mycar2 = new Car("Toyota",true);
        System.out.println(mycar2.repair);

        mycar2.speeding();
    }

}

