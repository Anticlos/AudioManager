public abstract class Media {
    private int id;
    private String filename;
    private int filetype;
    private String title;
    private String description;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFilename() {
        return filename;
    }



    public void setFilename(String filename) {
        this.filename = filename;
    }

    public int getFiletype() {
        return filetype;
    }

    public void setFiletype(int filetype) {
        this.filetype = filetype;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public Media(int id, String filename, int filetype, String title, String description) {
        this.id = id;
        this.filename = filename;
        this.filetype = filetype;
        this.title = title;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Files{" +
                "id=" + id +
                ", filename='" + filename + '\'' +
                ", filetype='" + filetype + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
