package FractionHW;

import java.util.Scanner;
import static java.lang.Math.max;
public class Fraction{
    private int a; private int b;
    public Fraction(int a, int b){
        this.a = a; this.b = b;}
    public double toDouble(){
        return a / b;}
    public Fraction plus(Fraction r){
        return new Fraction(a * r.b + b * r.a, b * r.b);}
    public Fraction multiply(Fraction r){
        return new Fraction(a * r.a,b * r.b);}
    public Fraction simply(){
        for(int i = 2; i < max(a,b);i++){
            if(a % i == 0 && b % i == 0){
                a /= i; b /= i; i--;}}
        return this;}
    public void print(){
        simply();
        if(a==b)System.out.print(1+" ");
        else System.out.print(a+"/"+b+" ");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Fraction a = new Fraction(in.nextInt(), in.nextInt());
        Fraction b = new Fraction(in.nextInt(), in.nextInt());
        a.print();
        b.print();
        a.plus(b).print();
        a.multiply(b).plus(new Fraction(5, 6)).print();
        a.print();
        b.print();
        in.close();
    }
}
// INPUT:
//2 4 1 3
// OUTPUT:
//1/2 1/3 5/6 1 1/2 1/3
//Process finished with exit code 0

