/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author alexb
 */
public class FileInputExample {
    public static void main(String[] args) throws IOException {
         ArrayList<String> lineList = new ArrayList<String>();
         Files.lines(Paths.get("src/examples/test.txt")).forEach(System.out::println);
         //String[] lineArray = (String[]) lineList.toArray();
//        Scanner scan = new Scanner(new File("src/examples/test.txt"));
//        System.out.println(scan.nextLine());
    }
}
