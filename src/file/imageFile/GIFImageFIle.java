package file.imageFile;

import file.File;
import file.FileType;

public class GIFImageFIle extends AbstractImageFile {

    public GIFImageFIle(String name, int size) {
        super(name, size);
}
    public void showAnimation(){
        System.out.println("showing funny gif");
    }

}
