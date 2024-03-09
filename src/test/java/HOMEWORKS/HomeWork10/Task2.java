package HOMEWORKS.HomeWork10;

import org.junit.Assert;
import org.junit.Test;
import utilities.TestBase;

import java.io.File;
import java.io.IOException;

public class Task2 extends TestBase  {

    @Test
    public void test() throws IOException {
//        Create a File on Desktop
//        Verify that the file exists
//-----------------------------------
        // Get the path for the desktop directory
        // String separater = System.getProperty("file.separator");
        // String pathOfFile = System.getProperty("user.home")+ separater+"Downloads"+separater+"selenium-snapshot.png";
        // Create a new file
        // File file = new File(filePath);

        // Get the path for the desktop directory
        String desktopPath = System.getProperty("user.home") + "/Desktop/";
        String filePath = desktopPath + "test_file.txt";
        // Create a new file
        File file = new File(filePath);

            // Create the file on the desktop
            boolean isFileCreated = file.createNewFile();

            // Verify that the file is created successfully
            Assert.assertTrue(isFileCreated);

            // Check if the file exists
            boolean isFileExists = file.exists();

            // Verify that the file exists
            Assert.assertTrue(isFileExists);

    }

}
