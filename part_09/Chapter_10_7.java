package part_09;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import java.io.*;

public class Chapter_10_7 {
//    Write a program that copies a text file. In the process, have it convert all spaces into hyphens.
//Use the byte stream file classes. Use the traditional approach to closing a file by explicitly calling close( ).

    public static void main(String args[])
    {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;

            // First, make sure that both files has been specified.
            if(args.length != 2) {
                System.out.println("Usage: CopyFile from to");
                return;
            }

            // Copy a File.
            try {
                // Attempt to open the files.
                fin = new FileInputStream(args[0]);
                fout = new FileOutputStream(args[1]);

                do {
                    i = fin.read();
                    System.out.println(i);

                    if((char)i == ' ') i = '-';

                    if(i != -1) fout.write(i);
                } while(i != -1);

            } catch(IOException exc) {
                System.out.println("I/O Error: " + exc);
            } finally {
                try {
                    if(fin != null) fin.close();
                } catch(IOException exc) {
                    System.out.println("Error Closing Input File");
                }
                try {
                    if(fout != null) fout.close();
                } catch(IOException exc) {
                    System.out.println("Error Closing Output File");
            }
        }
    }
}
