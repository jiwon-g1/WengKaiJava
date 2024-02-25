package dome;

public class CD extends Item {
    private String title;
    private String artist;
    private int numOfTracks;
    private int playingTime;
    private boolean gotIt;
    private String comment;

    public CD(String title, String artist,
              int numOfTacks, int playingTime,String comment) {
        super(title);
//        this.title = title;
        this.artist = artist;
        this.numOfTracks = numOfTacks;
        this.playingTime = playingTime;
        this.comment = comment;
    }
    public void print() {
        System.out.println("CD "+title+": "+artist);
    }

    public static void main(String [] args){

    }


}
