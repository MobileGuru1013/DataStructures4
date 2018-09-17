/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package angelicads4;

/**
 *
 * @author Owner
 */
import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class AngelicaDS4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        int num; 
        int square;   
        //created integer variables 

    // Scanner for user input
    //this will receive the file from the user
    Scanner user = new Scanner( System.in ); 
    String  inputFileName;

    // prompt theuser for the file
    System.out.print("Input File Name: ");
    //read it line by line and trim it
    inputFileName = user.nextLine().trim();
    File input = new File( inputFileName );
    //replaces the filename with what the user picks
    Scanner scan = new Scanner( input );      

//    // prepare the output file
//    System.out.print("Output File Name: ");
//    outputFileName = user.nextLine().trim();
//    PrintWriter output = new PrintWriter( outputFileName );      

//    // processing loop
//    while( scan.hasNextInt() )    
//    {
//      num = scan.nextInt();
//      square = num * num ;      
//      output.println("The square of " + num + " is " + square);
//    }
//
//    // close the output file
//    output.close();






//// Location of file to read
//        Scanner x = new Scanner(System.in);
//        System.out.println("Enter a filename: ");
//        String fileName = x.nextLine();
//        File file = new File(fileName);
//
//        //putting the file in an array is not my idea. I give full credit to Edward Sullen on stackOverflow.com
//        String [] arrayList = null;
//        List<String> files  = new arrayList <String>();
//
//        try { 
//            //continues to read the file until it is over
//
//            Scanner scanner = new Scanner(file);
//
//            while (scanner.hasNextLine()) 
//            {
//                String line = scanner.nextLine();
//                lines.add(line);
//                System.out.println(line);
//            }
//            scanner.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//
//    }
//}
//    }
    }
}
