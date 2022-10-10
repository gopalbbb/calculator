package stadunt;

public class Ball {
   private String color;
    private int size ;
   private int weight;

    public Ball(String color, int size, int weight) {
        this.color = color;
        this.size = size;
        this.weight = weight;
    }

    void detailsofBall(){
        System.out.println("Ball Info ===============");
        System.out.println(this.color);
        System.out.println(this.size);
        System.out.println(this.weight);
    }

    public static void main(String[] args) {
        Ball B1=new Ball("red",10,2);
        B1.detailsofBall();
    }
}
