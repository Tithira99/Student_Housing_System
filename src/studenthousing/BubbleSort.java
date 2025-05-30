/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studenthousing;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author Tithira
 */
public class BubbleSort {
    
    public  static void bubbleSort(ArrayList<Apartment> arr){
        int n= arr.size();
        for(int i=0;i<n;i++){
            for(int j=1;j<(n-i);j++){
                if(arr.get(j-1).getRent()>arr.get(j).getRent()){
                    //swapping the elements
                    Collections.swap(arr, j-1, j);
                   
                }
            }
        }
    }
}
