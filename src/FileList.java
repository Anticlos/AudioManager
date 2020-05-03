import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileList {
    private ArrayList<Media> medias = new ArrayList<>();

    public void addMedia(Media media){
        medias.add(media);
    }
    public void  displayMedias (){


        medias.forEach(System.out::println);
    }

    public void removeMedia(int index){
        if (index>=0 && index <  medias.size()){
            medias.remove(index);
        }
    }

    public void clearMedias() {medias.clear();}

    public void saveBasket(String filename)   {

        try {
            PrintWriter printWriter = new PrintWriter(new File(filename));
            for (Media p : medias) {
                printWriter.println(p.getId() + "," + p.getFilename() + "," + p.getFiletype()
                        + "," + p.getTitle() + ","+p.getDescription());
            }
            printWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("The file cannot be saved");
        }

    }


    public void loadBasket(String filename){
        medias.clear();
        try {
            Scanner scanner = new Scanner(new File(filename));
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] words = line.split(",");
                Media media= new Video(
                        Integer.parseInt(words[0]),
                        words[1],
                        Integer.parseInt(words[2]) ,
                        words[3],
                        words[4],
                        Integer.parseInt(words[5]));
                medias.add(media);
            }
        } catch (Exception e) {
        }
    }

//    public void searchMedia(){
//         Scanner scanner = new Scanner(System.in);
//         String input= scanner.next();
//    }
}

