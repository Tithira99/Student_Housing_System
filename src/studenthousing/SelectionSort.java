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
public class SelectionSort {
    
    public static void selectionSort(ArrayList<Apartment> arr){
        for(int i=0;i<arr.size()-1;i++){
            int min=i;
            for(int j=i+1;j<arr.size();j++){
                if(arr.get(j).getRent()<arr.get(min).getRent()){
                    min=j;
                }
                
            }
             Collections.swap(arr, min, i);
        }
    }
}
