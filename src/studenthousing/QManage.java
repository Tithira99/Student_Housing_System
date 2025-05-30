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
public class QManage {
    public static class QQ{
        private static Queue instance;


        public static void  CQueue(int sz){
            instance=new Queue(sz);

        }

        public static Queue getQue(){
            return instance;
        }
    }
     public QManage(){
        
    }
}
