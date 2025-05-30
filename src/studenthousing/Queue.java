/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studenthousing;

/**
 *
 @author Tithira
 */
import java.io.*;

public class Queue {
    private int maxSize;
    private Student[]queArray;
    private int front;
    private int rear;
    private int nStudents;
  
    public Queue(int s){//Que Constructor
        maxSize=s;
        queArray=new Student[maxSize];
        front=0;
        rear=-1;
        nStudents=0;
        
    }
    public boolean enque(Student st){//Method for entering to the back
      if(isFull()!=true){
       if(rear==maxSize-1)
       rear=-1;
       queArray[++rear]=st;//adding student to the back
       nStudents++;
       return true;
      }
      else{
          return false;
      }
    }
    public Student deque(){//Method for dleleting from the front
        if(isEmpty()!=true){
        Student temp=queArray[front++];//removing student from the front
        if(front==maxSize)
            front=0;
        nStudents--;
        return temp;
        }
        else 
            return null;
    }
    public Student peekFront(){// Method for searching the front element
        return queArray[front];
    }
    
   public boolean isFull(){//Method for checking weather the que is full
       return(nStudents==maxSize);
   }
    public boolean isEmpty(){ //Method for checking weather the que isEmpty
       return(nStudents==0);
   }
    
   public int getnstud(){
       return this.nStudents;
   }
    
   public Student getque(int i){
       return this.queArray[i];
   }
}
