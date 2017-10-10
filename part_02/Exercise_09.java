package part_02;


import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * Part 2 Exercise 9:
 *
 *      Use a do-while loop to print out the letters of the alphabet in reverse order.
 *
 */
public class Exercise_09 {
    public static void main(String args[])
            throws java.io.IOException {

        char ch;
        ch = 'Z';

        do {
            System.out.println(ch);
            ch--;
        } while(ch != 'A' - 1);
    }
}
