public class Video extends Media{
    private int duration;
    public Video(int id, String filename, int filetype, String title, String description, int duration) {
        super(id, filename, filetype, title, description);
        this.duration= duration;
    }
}
