package CSC340.AssignmentTwo;

public class MusicTrack {
    private String title;
    private Artist artist;
    private Album album;
    private String link;

    public MusicTrack(String title, Artist artist, Album album, String link) {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.link = link;


    }


    public static class Album {
        private String title;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }


    }


    public static class Artist {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}


