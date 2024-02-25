package Notebook;

import java.util.ArrayList;

class Value {
    private int i;
    public void set(int i){this.i=i;}
    public int get(){return i;}
}
public class Notebook {
    private ArrayList<String> notes = new ArrayList<>();

    public void add(String s){
        notes.add(s);
    }
    public void add(String s, int location){
        notes.add(location, s);
    }
    public int getSize(){
        return notes.size();
    }
    public String getNote(int index){
        return notes.get(index);
    }

    public void removeNote(int index){
         notes.remove(index);
    }

    public String[] list() {
        String[] a = new String[notes.size()];
//        for (int i=0; i<notes.size();i++){
//            a[i]=notes.get(i);
//        }
        notes.toArray(a); //帮填数组
        return a;
    }
    public static void main(String[] args){
        ArrayList<String> c = new ArrayList<>();
        c.add("first");
        c.add("second");
        for(String s: c){
            System.out.println(s);
        }
        Value[] b = new Value[10];
        for(int i=0; i<b.length; i++){
            b[i]=new Value();
            b[i].set(i);
        }
        for(Value v: b){
            System.out.println(v.get());
            v.set(0);
        }
        for(Value v: b){
            System.out.println(v.get());
        }
        Notebook nb = new Notebook();
        nb.add("first");
        nb.add("second");
        nb.add("third",1);
        System.out.println(nb.getNote(0));
        nb.removeNote(1);
        String [] a = nb.list();
        for (String s : a){
            System.out.println(s);
        }
    }

}
