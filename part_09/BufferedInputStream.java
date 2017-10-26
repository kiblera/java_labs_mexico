package part_09;



//Demonstrate how to read file using BufferedInputStream - print each byte - be sure to close all connections

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

class BufferedInput {
    public static void main(String args[]) {
        int i;

        try (BufferedInputStream br = new BufferedInputStream(new FileInputStream("/Users/andreamkibler/Desktop/defaulttext/test.txt")))
        {
            while((i = br.read()) != -1) {
                System.out.println(i);
            }
        } catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}


