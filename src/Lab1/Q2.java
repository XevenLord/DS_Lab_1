package Lab1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        int cnt = 0;
        /*try {
            Scanner input = new Scanner(new FileInputStream("text1.txt"));
            while(input.hasNextLine()){
                String str = input.nextLine();
                String[] character = str.split(",");
                for(int i=0; i<character.length;i++) {
                    System.out.print(character[i]);
                }
                cnt+=character.length;
                System.out.println();
            }
            input.close();
        } catch (FileNotFoundException e) {
            System.out.println("File was not found!");
        }

        try {
            Scanner input = new Scanner(new FileInputStream("text2.txt"));
            while(input.hasNextLine()){
                String str = input.nextLine();
                String[] character = str.split(", ");
                for(int i=0; i<character.length;i++) {
                    System.out.print(character[i] + " ");
                    cnt+=character[i].length();
                }
                System.out.println();
            }
            input.close();
        } catch (FileNotFoundException e) {
            System.out.println("File was not found!");
        }

        try {
            Scanner input = new Scanner(new FileInputStream("text3.txt"));
            while(input.hasNextLine()){
                String str = input.nextLine();
                String[] character = str.split("; ");
                for(int i=0; i<character.length;i++) {
                    System.out.print(character[i] + " ");
                    cnt+=character[i].length();
                }
                System.out.println();
            }
            input.close();
        } catch (FileNotFoundException e) {
            System.out.println("File was not found!");
        }*/

        try {
            Scanner input = new Scanner(new FileInputStream("text4.txt"));
            while(input.hasNextLine()){
                String str = input.nextLine();
                String line = "";
                for(int i=0; i<str.length(); i++){
                    char letter = str.charAt(i);
                    if(Character.isAlphabetic(letter)){
                        line += letter;
                        cnt ++;
                    }
                    else{
                        if(!line.equals("")) {
                            System.out.print(line + " ");
                            line = "";
                        }
                        continue;
                    }
                }
                if(!line.equals("")){
                    System.out.print(line);
                }
                System.out.println();
            }
            input.close();
        } catch (FileNotFoundException e) {
            System.out.println("File was not found!");
        }

        System.out.println("Total number of characters : " + cnt);
    }
}
