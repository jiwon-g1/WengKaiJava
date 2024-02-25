package dome;

public class DVD extends Item{
    private String title;
    private String director;
    private int playingTime;
    private boolean gotIt;
    private String comment;

    public DVD(String title, String director, int playingTime,String  comment) {
        super(title);
        //this.title = title;
        this.director = director;
        this.playingTime = playingTime;
        this.comment = comment;
    }

    public void print() {
        System.out.println("DVD "+title+": "+director);
    }
}
