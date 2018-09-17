/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author Owner
 * ‘******************************************************
‘***  Class Name: acceptFile
‘***  Class Author: Angelica
‘******************************************************
‘*** Purpose of the class:Accept the file and put the words in alphabetical order
* Also removes the punctuation.
‘***
‘******************************************************
‘*** Date: 10/3/17
‘******************************************************
‘*** List of changes with dates. 
‘*******************************************************


 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class acceptFile 
{
    //these are our private variables.
    private File textFile;
    private String strFile;
    private String fileName;
    private String Scan;
    
    //this is a constructor
    public acceptFile(File textFile)
    {
        this.textFile = textFile;
        this.strFile = "";
    } 
    
    //this is a getter
    public String getFileName()
    {
        return fileName;
    }
    
    //this is a getter
    public String getScan()
    {
        return Scan;
    }
  
        /* 
    Method Name: readFile()
    Method Input: none
    Parameters: none
    Purpose: adds a node to the Binary tree
    Return: none
    Date: 10/3/2017
    */     
    //this method will read the string
    public void readFile() throws IOException 
    {
        String fileName = textFile.getAbsolutePath(); //gets file's path
        
        this.fileName = textFile.getName(); // gets simple name of the File and stores it in private variable
        BufferedReader br = new BufferedReader(new FileReader(fileName));    //creates a string
        
        try 
        {
            StringBuilder sb = new StringBuilder(); // reads from ACII to Strings
            String line = br.readLine(); //Reads each line of text file

            //a while loop is used instead of a for/for each/do while loop because a file has multiple lines
            //and the while loop can read as many as lines as there are in the file
            while (line != null)  //while the line is not null it will add the line to the string builder
            {
                sb.append(line);
                sb.append(" "); 
                line = br.readLine(); 
            }
            
            strFile = sb.toString(); // the read text file is stored as a string in the private variable strFile

            cleanScan(strFile); // changes the string to alphabetical order
        }
        finally 
        {
            br.close(); // closes file
        }

    
       
    
    
}
     /* 
    Method Name: cleanScan()
    Method Input:
    Parameters: String sentence
    Purpose: puts the strings in alphabetical order
    Return: Scan
    Date: 10/3/2017
    */     
 //this method puts everything in alphabetical order
    
     private String cleanScan(String sentence)
    {
        Btree theTree = composer(sentence); //creates a binary Tree 
        
        Scan = theTree.printOut(); // reads binary tree and stores the text in private variable Scan
        
        return Scan;   
    }
     
      /* 
    Method Name: BTree composer
    Method Input:
    Parameters: String sentence
    Purpose: puts the strings in Binary tree
    Return: theTree
    Date: 10/3/2017
    */     
     
     //this will put the strings in the binary tree
     private Btree composer(String sentence) 
    {      
        String word =""; // compiler wanted this initialized... empty variable
        
        Btree theTree = new Btree();
        
        for(int i=0; i< sentence.length(); i++) // will read each character in the String sentence
        {
            if(!Character.toString(sentence.charAt(i)).equals(" ")) // if the character in a given element is not a blank space,then the code will run
            {
                if(specialCase(Character.toString(sentence.charAt(i)))) // if the character is a given element is not a special character, then the code will run
                {
                    word+=Character.toString(sentence.charAt(i)); //the character of a given element is concantenated 
                }
            }
            
            if((Character.toString(sentence.charAt(i)).equals(" ") || i==sentence.length()-1) && !word.isEmpty())
               
            {
                
                theTree.addNode(word); // word is stored a node
                word =""; // variable is cleared
            }
        }
        
        return theTree; // returns Binary tree
    
    }
     
 /* 
    Method Name: boolean specialCase
    Method Input: 
    Parameters: String characterInput
    Purpose: compare a single character and matches it with the special characters.
     Essentially this will not count the special characters as a string.
    Return: key
    Date: 10/3/2017
    */     
//this will delete the punctuation
     //compares a single character and matches it with the special characters.. if there's a match, returns false
     
     private boolean specialCase(String characterInput)
    {
        String compare = characterInput; //parameter is stored in this variable
        boolean key = false; // initialized as false
        
        switch(compare) //if the character stored in compare is a special character, then, key stays false
        {
            //special characters found on an American Englsih keyboard... there may be more in other languages
            //if the special character/punctuation is in the file then it will be considered false and not added in the tree.
            //case statement is easier to use than if/else statement because
            case"!": break;
            case"@": break;
            case"#": break;
            case"$": break;
            case"%": break;
            case"^": break;                    
            case"&": break;
            case"*": break;
            case"(": break;        
            case")": break;
            case"-": break;
            case"_": break;
            case"+": break;
            case"=": break;
            case"`": break;                    
            case"~": break;
            case"[": break;
            case"]": break;       
            case"{": break;
            case"}": break;
            case"\\":break; //escapes the special thing it does....  
            case"|": break;
            case";": break;
            case":": break;        
            case"\'":break; //escapes the second pair of quotation marks
            case"\"":break; //escapes the second pair of double quotation marks
            case"<": break;
            case">": break;
            case",": break;                    
            case".": break;
            case"?": break;
            case"/": break;  
            //case" ": break;
            default: key = true; //if compare was not a special character, then key is set to true
           
        }
        
        return key; // returns the boolean key
        
    }
     
}
