package part_09;

//Demonstrate how to read file using BufferedReader - demonstrate both the read() and readLine() methods()
//        be sure to close all connections

import java.io.*;

class ReadFile {
    public static void main(String args[]) {
        int i;

        try (BufferedReader br = new BufferedReader(new FileReader("/Users/andreamkibler/Desktop/defaulttext/test.txt")))
        {
            while((i = br.read()) != -1) {
                System.out.println(i);
            }
        } catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        }

        String str;

        try (BufferedReader br = new BufferedReader(new FileReader("/Users/andreamkibler/Desktop/defaulttext/test.txt")))
        {
            while((str = br.readLine()) != null) {
                System.out.println(str);
            }
        } catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}
