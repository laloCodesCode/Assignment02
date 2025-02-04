package CSC340.AssignmentTwo;

public class MusicTrack {
    //Data Declerations
    private String title;
    private Artist artist;
    private Album album;
    private String link;

    //Argumeneted constructor
    public MusicTrack(String title, Artist artist, Album album, String link) {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.link = link;


    }


    //Getter method block
    public String getTitle(){
        return title;
    }
    public Artist getArtist(){
        return artist;
    }
    public Album getAlbum() {
        return album;
    }
    public String getLink(){
        return link;
    }

    //Setter method block
    public void setTitle(String title){
        this.title = title;
    }
    public void setArtist(Artist artist){
        this.artist = artist;
    }
    public void setAlbum(Album album){
        this.album = album;
    }
    public void setLink(String link){
        this.link = link;
    }

    //Objects for artist and album
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


