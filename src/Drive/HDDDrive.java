package Drive;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class HDDDrive implements Drive{
    List<File> files = new ArrayList<>();
    @Override
    public void addFile(File file) {
        file.add(file);
    }

    @Override
    public void listFiles() {
        files.forEach(System.out::println);
    }

    @Override
    public File findFile(String name) {
        return null;
    }
}
