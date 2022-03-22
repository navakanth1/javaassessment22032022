
import java.util.Scanner;

class Sine_value extends Thread {
    double a;

    public Sine_value(double a) {
        this.a = a;
    }

    @Override
    public void run() {
        try {double b,c;
            b = Math.toRadians(a);
            c = Math.sin(b);
            System.out.println("The sine value is : " + c);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
class Cosine_value extends Thread{
    double a;
    public Cosine_value(double a) {
        this.a = a;
    }

    @Override
    public void run() {
        try{
            double b,c;
            b = Math.toRadians(a);
            c = Math.cos(b);
            System.out.println("The cosine value is : "+c);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
class Tangent_value extends Thread{
    double a;
    public Tangent_value(double a) {
        this.a = a;
    }
    @Override
    public void run() {
        try{double b,c;
            b = Math.toRadians(a);
            c = Math.tan(b);
            System.out.println("The tangent value is : "+c);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
public class Trignometry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x;
        System.out.println("Enter the degree");
        x = input.nextInt();
        Sine_value sin = new Sine_value(x);
        Cosine_value cos = new Cosine_value(x);
        Tangent_value tan = new Tangent_value(x);
        sin.start();
        cos.start();
        tan.start();

    }
}
