
public class Main {

    public static void main(String[] args){
        char[] array = {'e', 'b', 'd', 'a', 'c'};
        System.out.println("Orginal array");
        printArray(array);
        printArray(insertionSort(array));
    }

    public static void printArray(char[] array){
        
        for(int x = 0; x < array.length; x++){
            System.out.print(array[x]+ " ");

        }System.out.println("");

    }

    public static char[] insertionSort(char[] array){
         
        for(int i = 1; i < array.length; i++){
           char j = array[i];
           int k = i -1;
           while (k>=0&& array[k]> j){

            array[k+1] = array[k];
            k--;
            
           }
           array[k+1] = j;



        }
        return array;
    }
  }