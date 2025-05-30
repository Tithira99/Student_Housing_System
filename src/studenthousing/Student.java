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
public class Student{
    int ID;
    String name;
    String SLocation;
    String Ayear;
    int maxAmountPay;
    int Qthreshold;
    
    public Student(){
        
    }
    
    public Student(int id){
        this.ID=id;
    }
    
    public Student(int id, String nm, String SL, String AY, int MAP, int QT ){
        this.ID=id;
        this.name=nm;
        this.SLocation=SL;
        this.Ayear=AY;
        this.maxAmountPay=MAP;
        this.Qthreshold=QT;
        
    }
    public void setid(int id){
        this.ID=id;
    }
    public void setname(String nm){
        this.name=nm;
    }
    public void setsloc(String sloc){
        this.SLocation=sloc;
    }
    public void setAY(String AY){
        this.Ayear=AY;
    }
    public void setMAP(int MAP){
        this.maxAmountPay=MAP;
    }
    public void setQT(int QT){
        this.Qthreshold=QT;
    }
    
    public int getid(){
        return this.ID;
    }
    public String getnm(){
        return this.name;
    }
    public String getsloc(){
        return this.SLocation;
    }
    
    public String getAY(){
        return this.Ayear;
    }
    public int getMAP(){
        return this.maxAmountPay;
    }
    public int getQT(){
        return this.Qthreshold;
    }
}
