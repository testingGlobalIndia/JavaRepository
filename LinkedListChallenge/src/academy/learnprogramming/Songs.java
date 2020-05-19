package academy.learnprogramming;

public class Songs {

    private String songTitle;
    private double duration;

    public Songs(String songTitle, double duration) {
        this.songTitle = songTitle;
        this.duration = duration;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public double getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return   songTitle + " -> "+ duration;
    }
}
