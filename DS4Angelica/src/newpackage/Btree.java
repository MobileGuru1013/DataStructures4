/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author Owner
 */
public class Btree 
{
    //these are private variables
    private BTreeNode root;
    private BTreeNode temp;
    //we need a root
    
    //this is a method to add the root
    
    /* 
    Method Name: addNode()
    Method Input: recAdd()
    Parameters: String newScript
    Purpose: adds a node to the Binary tree
    Return: none
    Date: 10/3/2017
    */     

    //this method will add a node to the binary tree
    public void addNode(String newScript)
    {
        temp = new BTreeNode();
        temp.setValue(newScript.toLowerCase());
        temp.setCounter(0);
        
        if(root == null)
        {
            root = temp;
            //assigning the first value of the tree to the root
        }
        //call the recursive function
        else
        {
            recAdd(root);
            //root must have a value. nothing happens if null is the same as root.
        }
    }
    
    /* 
    Method Name: redAdd()
    Method Input: 
    Parameters: BTreeNode recNode
    Purpose: adds a node to the Binary tree
    Return: none, void method
    Date: 10/3/2017
    */  
    //let's create a recursive node
    //this is used to put the words on the tree when
    //putting the words in alphabetical order
    private void recAdd(BTreeNode recNode)
    {
        String a = recNode.getValue();
        String b = temp.getValue();//the new node gets added
      
        int compare = a.compareTo(b);
        //this will compare the two strings
        
        if(compare<0)
        {
            //this sets the curNode on the right of the correct Node
            if(recNode.getRight() == null)
            {
                recNode.setRight(temp);
            }
            else
            {
                recAdd(recNode.getRight());
            }
        }    
        
        //we are going to the left, if tge value is smaller than the current node
        else if (compare > 0)
        {
            //first we have to check if it is empty
            if(recNode.getLeft() == null)
            {
                recNode.setLeft(temp);
                //if it is then we add the value aka temp
            }
            
            else
            {
                recAdd(recNode.getLeft());
                
            }
        }
        else
        {
            recNode.setCounter(recNode.getCounter() + 1);
        }
        
    }

/* 
    Method Name: printOut()
    Method Input:
    Parameters: none
    Purpose: print out the words found in the nodes in the binary tree
    Return: recPrintOut(root)
    Date: 10/3/2017
    */      
    //this method will print out the words found in the nodes in the Binary Tree
    public String printOut()
    {
        //reutrn the string and will come from the recursive print out of the root.
        return recPrintOut(root);
        
    }
    
    /* 
    Method Name: recPrintOut()
    Method Input: BTreeNode
    Parameters: BTreeNode node
    Purpose: left and right nodes will be printed and counted.
    Return: leftTerms or rightTerms
    Date: 10/3/2017
    */  
    private String recPrintOut(BTreeNode node)
    {
        String leftTerms = ""; //this initializes strings!
        String rightTerms = "";
        
//if he not node we will print out the left node by calling it
        if(node.getLeft() !=null)
        {
            //calls every node on the left side
            leftTerms = recPrintOut(node.getLeft()) + "\n";
        }
        
        if(node.getRight() != null)
        {
            rightTerms = "\n" +recPrintOut(node.getRight());
           
        }
        return leftTerms + node.getValue() +": " + node.getCounter() + rightTerms;
    }
    

    
}
