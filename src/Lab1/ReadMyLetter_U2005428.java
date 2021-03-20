package Lab1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadMyLetter_U2005428 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try{
            PrintWriter out = new PrintWriter(new FileOutputStream("ChuaZongHong_U2005428.txt", true));
            out.println();
            out.println("\n\nThursday, 18 June 2021\n\n");
            System.out.println("Please enter your letter info : ");
            String line = s.nextLine();
            out.println(line);
            out.close();
        } catch (FileNotFoundException e) {
            System.out.println("File Is Not Found!");
        }

        try{
            Scanner in = new Scanner(new FileInputStream("ChuaZongHong_U2005428.txt"));
            while(in.hasNextLine()){
                String words = in.nextLine();
                System.out.println(words);
            }
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("File Is Not Found!");
        }


    }
}
