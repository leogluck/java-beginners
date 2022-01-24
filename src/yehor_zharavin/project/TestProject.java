package yehor_zharavin.project;

import java.io.*;
import java.util.Scanner;

public class TestProject {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int.nextInt();
        try(FileWriter writer = new FileWriter("notes3.txt", false))
        {

            // запись всей строки
            String text = "Hello Gold!";
            writer.write(text);
            // запись по символам
            writer.append('\n');
            writer.append('E');

            writer.flush();
        }


        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
