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
public class LinkListNode {
    public Apartment info;//Apartment Object reference
    public LinkListNode next;//Link List Node reference
    public LinkListNode(Apartment ap){//Linked List Node Constructor
        info=ap;
        next=null;
    }
    
}
