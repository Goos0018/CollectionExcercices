package be.vdab.excercice_201;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class DisplayAlphabetical {
    public static void main(String[] args) throws Exception {
        List<String> list = new ArrayList<>();

        Scanner sc2 = null;
        try {
            sc2 = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (sc2.hasNextLine()) {
            Scanner s2 = new Scanner(sc2.nextLine());
            while (s2.hasNext()) {
                String s = s2.next();
                list.add(s);
            }
        }
        // Arrays.sort(list, new MyComparator());
        // Je probeert een collection (arraylist) te sorteren met de statische sort methode van de Arrays utility-klasse. Collections hebben hun eigen sort-methode.

        list.sort(new MyComparator());
        // Dit zal beter werken normaal gezien.

        list.forEach(System.out::println); // Dit is een lambda-expression. Daar leer je volgende week meer over.

    }
    public static class MyComparator implements Comparator<String> {
        @Override
        public int compare(String s1, String s2){
            // return s1.length() - s2.length();
            // Je vergelijkt ze eigenlijk met hun lengte, niet alfabetisch.
            // De String klasse heeft een methode compareTo en CompareToIgnoreCase, kijk eens wat je hiermee kan?
            // https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#compareToIgnoreCase(java.lang.String)

            return ...

        }
    }
}