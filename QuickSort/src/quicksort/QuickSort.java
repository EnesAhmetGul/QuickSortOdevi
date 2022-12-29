
package quicksort;
import java.util.Random;

/**
 *
 * @author Lenovo
 */
public class QuickSort {
    public static void main(String[] args) { 
        int minislem = Integer.MAX_VALUE;
        int istenenPivotIndex = -1;
        int n = 100; // Dizinin boyutu
        int[] array = new int[n];
        Random r = new Random();
        for (int i=0;i<array.length;i++){
            array[i]=r.nextInt(100);
        }
        // Pivot olarak dizinin yüzde 10, yüzde 20, yüzde 30, yüzde 40, yüzde 50, yüzde 60, yüzde 70, yüzde 80 ve yüzde 90 ve indekslerini seçin
        int[] pivotIndexleri = {0, 9, 19, 29, 39, 49, 59, 69, 79, 89, 99};
        for (int pivotIndex : pivotIndexleri) {
          // Diziyi bölün ve pivot elemanının yerine oturtun
        int pivot = array[pivotIndex];
        int i = 0;
        int j = n - 1;
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        int islemsayisi = i;

            //en az işlem sayısını bulun ve istenen pivot degeri bulun 
        if (islemsayisi < minislem) {
            minislem = islemsayisi;
            istenenPivotIndex = pivotIndex;    
        }
            pivotIndex=pivotIndex+1;
            System.out.println("Pivot %"+ pivotIndex+" secildiginde islem sayisi:" + islemsayisi);
        }

        // En az işlem sayısını bulun ve yazdırın

        for (int pivotIndex : pivotIndexleri) {
          // Diziyi bölün ve pivot elemanının yerine oturtun
          int pivot = array[pivotIndex];
          int i = 0;
          int j = n - 1;
          while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
              j--;
            }
                if (i <= j) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    i++;
                    j--;
                }
            }
            }
            System.out.println();
            System.out.println();
            istenenPivotIndex=istenenPivotIndex+1;
            if(istenenPivotIndex==1){
                System.out.println("Pivot ilk eleman secildiginde islem sayisi en azdir:" + minislem);  
            }
            else if(istenenPivotIndex==100){
                System.out.println("Pivot son eleman secildiginde islem sayisi en azdir:" + minislem); 
            }
            else{
            System.out.println("Pivot % "+ istenenPivotIndex+" secildiginde islem sayisi en azdir:" + minislem);
        }
    }
    
}