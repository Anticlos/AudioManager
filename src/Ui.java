import java.util.Scanner;

public class Ui {

    public Choice menu() {
        Choice returnChoice;
        System.out.println("Select 1.For Adding  2.For Removing  3.For Displaying  4.To Clear   5.Exit");

        int choice;
        Scanner scanner = new Scanner(System.in);

        try {
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    return Choice.ADD;
                case 2:
                    return Choice.REMOVE;
                case 3:
                    return Choice.DISPLAY;
                case 4:
                    return Choice.CLEAR;
                case 5:
                    return Choice.EXIT;
                default:return Choice.ERROR;

            }

        }
        catch(Exception e){
            return Choice.ERROR;
        }


    }

    //factory method design pattern
    public Media createMedia() {
        int id;
        String filename;
        int filetype;
        String title;
        String description;
        int size;
        int duration;

        Scanner scanner = new Scanner(System.in);
        System.out.println("1. for Audio 2. for Video 3. for Picture ");
        filetype= scanner.nextInt();



        System.out.println("Give the ID");
        id = scanner.nextInt();
        System.out.println("Give the Filename ");
        filename = scanner.next();
        System.out.println("Give the Title ");
        title = scanner.next();
        System.out.println("Give the File description ");
        description = scanner.next();

        Media media;

        switch (filetype){
            case 1:
                System.out.println("Give size of the audio");
                size = scanner.nextInt();
                media = new Audio(id,filename, filetype, title, description,size);
                return media;
            case 2:
                System.out.println("Give the duration of Video");
                duration = scanner.nextInt();
                media = new Video(id,filename,filetype,title,description,duration);
                return media;
            case 3:

                media= new Picture(id,filename,filetype,title,description);
                return media;
            default:
                return null;

        }




    }
    public void manageFilelist(FileList fileList){
        Choice choice;
        do {
            choice =  menu();

            switch (choice) {
                case ADD:
                    Media media =  createMedia();
                    fileList.addMedia(media);
                    break;
                case REMOVE:
                    System.out.println("Give an index to remove");
                    Scanner scanner = new Scanner(System.in);
                    int index= scanner.nextInt();
                    fileList.removeMedia(index);
                    break;
                case DISPLAY:
                    fileList.displayMedias();
                    break;
                case EXIT:
                    break;
                case ERROR:
                    System.out.println("You gave erroneous input");
                    break;



            }
        }while(choice!=Choice.EXIT);

    }

}
