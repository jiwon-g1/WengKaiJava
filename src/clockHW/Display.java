package clockHW;

public class Display {
    private int value = 0;
    private int limit = 0;
    private boolean turnedOver = false;

    public Display(int limit){
        this.limit = limit;

    }
    public void increase(){
        turnedOver =false;
        value++;
        if (value == limit) {
            value =0;
            turnedOver = true;
        }
    }
    public int getValue(){
        return value;
    }
    public void setValue(int val){
        value = val;
    }
    public boolean isTurnedOver(){
        return turnedOver;
    }

//    public static void main(String[] args){
//        Display d = new Display (24);
//        for (;;){
//            d.increase();
//            System.out.println(d.getValue());
//        }
//    }
}
