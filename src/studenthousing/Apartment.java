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
public class Apartment {
   String ID;
   String Location;
   int MaxNoRooms;
   boolean Availability;
   int RentAmt;
   int QualityScore;
   
   public Apartment(){
       
   }
   public Apartment(String id){
       this.ID=id;
       
   }
   public Apartment(String id,String loc, int MaxR, 
       boolean Avbty, int Rent, int Qsc){
       this.ID=id;
       this.Location=loc;
       this.MaxNoRooms=MaxR;
       this.Availability=Avbty;
       this.RentAmt=Rent;
       this.QualityScore=Qsc;
       
   }
   
   public void setid(String id){
       this.ID=id;
   }
   
   public void setloc(String loc){
       this.Location=loc;
   }
   
   public void setMaxR(int MaxR){
       this.MaxNoRooms=MaxR;
   }
   
   public void setAvbty(boolean Avbty){
       this.Availability=Avbty;
   }
   
   public void setRent(int Rent){
       this.RentAmt=Rent;
   }
   public void setQsc(int Qsc){
       this.QualityScore=Qsc;
   }
   public String getid(){
       return this.ID;
   }
   public String getloc(){
       return this.Location;
   }
   public int getMaxR(){
       return this.MaxNoRooms;
   }
   public boolean getAvbty(){
       return this.Availability;
   }
   public int getRent(){
       return this.RentAmt;
   }
   public int getQsc(){
       return this.QualityScore;
   }
   
}
