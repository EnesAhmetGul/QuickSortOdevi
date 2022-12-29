
package quicksort;
import java.util.Random;

/**
 *
 * @author Lenovo
 */
public class QuickSort {
    public static void main(String[] args) { 
        int minislem = Integer.MAX_VALUE;
        int istenen = -1;
        int n = 100;
        int[] dizi = new int[n];
        
        Random r = new Random();
        
        for (int i = 0 ; i < dizi.length ; i++){
            dizi[i]=r.nextInt(100);
        }
        
        int[] Indexler = {0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95, 99};
        
        for (int Index : Indexler) {
        int pivot = dizi[Index];
        int i = 0;
        int j = n - 1;
        
        while (i <= j) {
            while (dizi[i] < pivot) {
                i++;
            }
            while (dizi[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = dizi[i];
                
                dizi[i] = dizi[j];
                dizi[j] = temp;
                
                i++;
                j--;
            }
        }
        
        int islemsayisi = i;

        if (islemsayisi < minislem) {
            minislem = islemsayisi;
            istenen = Index;    
        }
            Index = Index+1;
            System.out.println("Baslangic " + Index + " secildiginde islem sayisi:" + islemsayisi);
        }


        for (int Index : Indexler) {
            
          int pivot = dizi[Index];
          int i = 0;
          int j = n - 1;
          
          while (i <= j) {
            while (dizi[i] < pivot) {
                i++;
            }
            while (dizi[j] > pivot) {
              j--;
            }
                if (i <= j) {
                    int temp = dizi[i];
                    
                    dizi[i] = dizi[j];
                    dizi[j] = temp;
                    
                    i++;
                    j--;
                }
            }
        }
        
        System.out.println();
        System.out.println();

        istenen = istenen + 1;

        if(istenen == 1){
                System.out.println("Ilk eleman secildiginde islem sayisi en azdir");  
        }
        else if(istenen == 100){
                System.out.println("Son eleman secildiginde islem sayisi en azdir"); 
        }
        else{
            System.out.println("Baslangic "+ istenen +" secildiginde islem sayisi en azdir:" + minislem);
        }
    }
    
}
