package stadunt;

public class Pen {
private String color;
private  String type;
 private int leadSize;

    void infoofPen(){
        System.out.println("Design of Pen");
        System.out.println(this.color);
        System.out.println(this.type);
        System.out.println(this.leadSize);
    }

    public static void main(String[] args) {
        Pen pen1=new Pen();

        pen1.color="Blue";
        pen1.type="Gel";
        pen1.leadSize=10;


        pen1.infoofPen();
    }
}
