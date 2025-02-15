class Song {
    private String title;
    private String artist;
    private double length;

    public Song(String title, String artist, double length) {
        this.title = title;
        this.artist = artist;
        this.length = length;
    }

    @Override
    public String toString() {
        return String.format("{ songName: %s, artist: %s, length: %.2f }", title, artist, length);
    }
}
