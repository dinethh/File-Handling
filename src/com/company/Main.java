package com.company;
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        //Project folder eka athule hadanna
        File file = new File("Sales.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //wenama unic thenaka hadana vidiya
        File file1 = new File("D:\\WorkSpace\\GDSE\\Sales.txt");
        try {
            file1.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //Char base file write kirima
        FileWriter writer = null;
        try {
            writer = new FileWriter("sales1.txt");
            writer.write("yasindu-->35000\n");
            writer.write("dineth-->35000\n");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //uda ekatama continue karala aye data danna ona mn
        FileWriter writer2 = null;
        try {
            writer2 = new FileWriter("sales1.txt", true);
            writer2.write("Nimal-->15000\n");
            writer2.write("Kamal-->56000\n");
            writer2.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


       //console eke print karanna
        FileReader reader = null;
        try {
            reader = new FileReader("sales1.txt");
            int i = 0;

            while ((i = reader.read()) != -1) {
                System.out.print((char) i);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
