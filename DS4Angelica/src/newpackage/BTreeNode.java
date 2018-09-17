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
‘***  Class Name: BTreeNode
‘***  Class Author: Angelica
‘******************************************************
‘*** Purpose of the class: This creates the node for the binary tree
‘***
‘******************************************************
‘*** Date: 10/1/17
‘******************************************************
‘*** List of changes with dates: 10/13/17 Created getters and setters for the public variables 
‘******************************************************
 */
public class BTreeNode 
{
    //first create the left and the right values
    //this is the structure of our tree
    private String value;
    private int counter;
    private BTreeNode left;//eft node
    private BTreeNode right;//right node
    
    //the following below are getters and setters
    
    public String getValue()
    {
        return value;
    }
    public void setValue(String value)
    {
        this.value = value;
    }
    
    public int getCounter()
    {
        return counter;
    }
    public void setCounter(int counter)
    {
        this.counter=counter;
    }
    
    public BTreeNode getLeft()
    {
        return left;
    }
    public void setLeft(BTreeNode left)
    {
        this.left = left;
    }
    
    public BTreeNode getRight()
    {
        return right;
    }
    public void setRight(BTreeNode right)
    {
        this.right = right;
    }

}
