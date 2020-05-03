public class Audio extends  Media{
    private int size;
    public Audio(int id, String filename, int filetype, String title, String description,int size) {
        super(id, filename, filetype, title, description);
        this.size= size;
    }
}
