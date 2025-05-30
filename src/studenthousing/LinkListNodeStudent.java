/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studenthousing;

/**
 *
 * @author Tithira
 */
public class LinkListNodeStudent {//Link List Node Class for Student
    public Student info;//Student Object Reference
    public LinkListNodeStudent next;//Libked List Node Reference
    public LinkListNodeStudent(Student st){//Linked List Node Constructor
        info=st;
        next=null;
    }
    
}
