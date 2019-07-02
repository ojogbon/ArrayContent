/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraycontent;

/**
 *
 * @author ig
 */
public class ArrayContent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // 
       
        ArrayContent ck = new ArrayContent();
        int g [] = {101,102,104,105,107,108,110};
        ck.doContent(g);
        
    }
    
    void doContent (int con []) {
        int count = con[0];
        
        for (int i = 0; i < con.length; i++) {
                if (count == con[i]) {
                
                }else{
                if (count < con[i] && ((con[i] - count) == 1) ) {
                    count = con[i];
                }else if(count < con[i] && ((con[i] - count) > 1)){
                    count = con[i];
                    System.out.println(con[i] -1);
                }else{
                    count = con[i];
                    System.out.println(con[i] + 1);
                }
                }
        }
        
    }
    
}
