package car;

public class Car {

    private String name;
    private int modelNumber;
    private String type ;


    void createCar(){
        System.out.println("****Car details***");
        System.out.println(this.name);
        System.out.println(this.modelNumber);
        System.out.println(this.type);
    }
    public static void main(String[]args){
        Car cr1 = new Car();
        cr1.name ="Honda";
        cr1.modelNumber=2021;
        cr1.type="Hybrid";
        System.out.println(cr1.getClass().getName());
        cr1.createCar();

        Car cr2 = new Car();
        cr2.name ="Tesla";
        cr2.modelNumber=2022;
        cr2.type="Electric";

        cr2.createCar();

    }
}
