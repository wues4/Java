// Write a Java program to list the available character sets in charset objects.

import java.nio.charset.Charset;
import java.util.Map;

public class AvailableCharSets
{
    public static void main(String[] args)
    {
        System.out.println("Available charsets in java:");
        Map<String, Charset> map = Charset.availableCharsets();
        for (String name : map.keySet())
        {
            System.out.println(name);
        }
    }
}
