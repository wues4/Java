// Write a Java program to find the size of a specified file

import java.io.File;

public class FileSize
{
    public static void main(String[] args)
    {
        System.out.println(folderSize(new File()) + " bytes");
    }

    public static long folderSize (File directory)
    {
        long length=0;
        for (File file : directory.listFiles())
        {
            if (file.isFile()) {
                length += file.length();
            } else {
                length+=folderSize(directory);
            }
        }return length;
    }
}
