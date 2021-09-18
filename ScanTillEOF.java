package JavaRevisions;

import java.io.*;
import java.util.*;
import java.text.*;


public class ScanTillEOF {

    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        
        int i = 1;

        while(scanner.hasNext()){
            String s = scanner.nextLine();
            System.out.println(i + " " + s);
            i++;
        }
    }
}