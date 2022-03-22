

import java.util.Scanner;

class Addition extends Thread{
    int a,b;
    public Addition(int a, int b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public void run() {
        try {
            System.out.println("Addition :");
            System.out.println(a+b);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
class Subtraction extends Thread
{
    int a,b;

    public Subtraction(int a, int b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public void run() {
        try{
            System.out.println("Subtraction :");
            System.out.println(a-b);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
class Multiplication extends Thread
{
    int a,b;
    public Multiplication(int a, int b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public void run() {
        try{
            System.out.println("Multiplication :");
            System.out.println(a*b);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
class Division extends Thread
{
    float a,b;
    public Division(int a, int b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public void run() {
        try{
            System.out.println("Division :");
            System.out.println(a/b);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x,y;
        System.out.println("Enter num1 :");
        x = input.nextInt();
        System.out.println("Enter num2 :");
        y = input.nextInt();
        Addition add = new Addition(x,y);
        Subtraction sub = new Subtraction(x,y);
        Multiplication mul = new Multiplication(x,y);
        Division div = new Division(x,y);
        add.start();
        sub.start();
        mul.start();
        div.start();
    }
}
