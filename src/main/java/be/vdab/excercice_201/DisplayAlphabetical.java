package be.vdab.excercice_201;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DisplayAlphabetical {
    public static void main(String[] args) {

        try (BufferedReader input = new BufferedReader(new FileReader("input.txt"))) {

            String read = null;
            while ((read = input.readLine()) != null) {
                String[] splited = read.split("\\s+");
                for (String part : splited) {
                    System.out.println(part);
                }
            }
        } catch (IOException e) {
            System.out.println("There was a problem: " + e);
            e.printStackTrace();
        }
    }
}