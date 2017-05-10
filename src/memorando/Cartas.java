
package memorando;

import java.util.Random;


public class Cartas {
    
    
    public int[] getCartasN(){
        int num[] = new int[12];
        int cont=0;
        while(cont < 12){
            Random r = new Random();
            int n = r.nextInt(6)+1;
            int n1=0;
            
            for(int i = 0; i<12; i++){
            if (num[i]== n ){
                n1++;
            }
        }
            if (n1<2) {
                num[cont]= n;
                cont++;
            }
        }
        return num;
    }
}
