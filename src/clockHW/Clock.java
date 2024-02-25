package clockHW;

import java.util.Scanner;

public class Clock {
    private Display hour = new Display(24);
    private Display minute = new Display(60);
    private Display second = new Display(60);

    Clock(int a, int b, int c){
        hour.setValue(a);
        minute.setValue(b);
        second.setValue(c);
    }

//    public void start(){
//        minute.increase();
//        if(minute.getValue()==0) hour.increase();
//        System.out.printf("/%02d:%02d\n",hour.getValue(),minute.getValue());
//    }
    public void tick(){
        second.increase();
        if(second.getValue()==0){
            minute.increase();}
       if (minute.getValue()==0 && minute.isTurnedOver()) {
            hour.increase();
        }
        System.out.printf("%02d:%02d:%02d\n",hour.getValue(),minute.getValue(),second.getValue());
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(true) {
            int[] set = new int[]{in.nextInt(), in.nextInt(), in.nextInt(),};
            Clock clock = new Clock(set[0], set[1], set[2]);
            clock.tick();
        }
    }
}

// Test inputs and outputs:
//0 0 0
//00:00:01
//0 0 1
//00:00:02
//0 0 59
//00:01:00
//0 1 59
//00:02:00
//0 59 59
//01:00:00
//23 59 59
//00:00:00