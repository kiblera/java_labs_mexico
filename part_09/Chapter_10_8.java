package part_09;

// Rewrite the program described in question 7 so that it uses the character stream classes. This time, use the try-with
// resources statement to automatically close the file.

import java.io.*;

public class Chapter_10_8 {
    public static void main(String args[])
            throws IOException {
        int i;

        // First, make sure that both files has been specified.
        if (args.length != 2) {
            System.out.println("Usage: CopyFile from to");
            return;
        }

        // Copy a File.
        try {
            // Attempt to open the files.
            FileReader fin = new FileReader(args[0]);
            FileWriter fout = new FileWriter(args[1]);

            do {
                i = fin.read();

                if ((char) i == ' ') i = '-';

                if (i != -1) fout.write(i);
            } while (i != -1);

        } catch (IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}