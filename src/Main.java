
import Drive.Drive;
import Drive.HDDDrive;
import Drive.SSDDrive;
import file.File;
import file.imageFile.GIFImageFIle;
import file.imageFile.JPGImageFile;
import file.musicfile.MP3MusicFile;


public class Main {
    public static void main(String[] args) {
        GIFImageFIle gif1 = new GIFImageFIle("nazwa1.gif", 100);
        JPGImageFile jpg1 = new JPGImageFile("nazwa1.jpg", 200, 80);

        MP3MusicFile mp3file = new MP3MusicFile("plik.mp3",
                4000, "Marilyn Manson", "Brooken needle", 100);
        Drive drive = new HDDDrive();
        drive.addFile(gif1);
        drive.addFile(jpg1);
        drive.addFile(mp3file);
        File file = drive.findFile("plik.mp3");
        System.out.println(file.getSize());
    }
}