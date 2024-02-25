package dome;

public class CD extends Item {
    private String title;
    private String artist;
    private int numOfTracks;


    public CD(String title, String artist,
              int numOfTacks, int playingTime,String comment) {
        super(title,playingTime,false,comment); //调用Item的构造器来吧这个title参数传递给它
//        this.title = title;
        this.artist = artist;
        this.numOfTracks = numOfTacks;
    }
    public void print() {
        System.out.println("CD "+title+": "+artist);
    }

    public static void main(String [] args){

    }


}
