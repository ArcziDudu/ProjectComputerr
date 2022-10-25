package Drive;

import file.File;

public interface Drive {
    void addFile(File file);
    void listFiles();
    file.File findFile(String name);
}
