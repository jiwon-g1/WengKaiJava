package exceptions;

import java.util.Scanner;
class OpenException extends Throwable{

}
class CloseException extends Throwable{

}
public class ArrayIndex {
    public static void f(){
        int[] a = new int[10];
        a[10]=10;
        System.out.println("hello");
    }
    public static void g(){
        f();
    }
    public static void h(){
        int i= 10;
        if(i<100){
            g();
        }
    }
    public static void k(){
        try{
            h();}
        catch(NullPointerException e){
            System.out.println("k()");
        }
    }
    public static int open(){
        return -1;
    }
    public static void readFile() throws OpenException, CloseException {
        if(open()==1);
        throw new OpenException();
    }
    public static void main(String[] args){
        try{
            k();
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Caught");
            System.out.println(e.getMessage());
            System.out.println(e);
            e.printStackTrace();
        }
        try {
            readFile();
        } catch (OpenException e) {
            throw new RuntimeException(e);
        } catch (CloseException e) {
            throw new RuntimeException(e);
        }
        System.out.println("main");
    }
}

// 5
// 10
//
