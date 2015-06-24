
import java.util.Random;


public class Sorting {

    static Random rand = new Random();

    public static void main(String args[]){
        int[] list_to_sort = generateList(20);
        System.out.println("Bubble");
        printList(list_to_sort);
        bubbleSort(list_to_sort);
        printList(list_to_sort);
        list_to_sort = generateList(25);
        System.out.println("Selection");
        printList(list_to_sort);
        selectionSort(list_to_sort);
        printList(list_to_sort);
        list_to_sort = generateList(25);
        System.out.println("Insertion");
        printList(list_to_sort);
        insertionSort(list_to_sort);
        printList(list_to_sort);

    }

    public static void printList(int[] list){
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }

    public static int[] generateList(int size){
        int[] rand_list = new int[size];
        for (int i = 0; i < rand_list.length; i++) {
            rand_list[i] = rand.nextInt(50);
        }
        return rand_list;
    }

    public static void bubbleSort(int[] unsorted){
        for(int i = 1; i < unsorted.length; i++){
            for (int j = 0; j < unsorted.length - i; j++){
                if (unsorted[j] > unsorted[j+1]){
                    int tmp = unsorted[j];
                    unsorted[j] = unsorted[j+1];
                    unsorted[j+1] = tmp;
                }
            }
        }
    }

    public static void selectionSort(int[] unsorted){
        for (int fill = 0; fill <= unsorted.length - 2; fill++){
            int posMin = fill;
            for (int next = fill + 1; next <= unsorted.length - 1; next++){
                if(unsorted[next] < unsorted[posMin]){
                    posMin = next;
                }
            }
            if (posMin != fill) {
                int temp = unsorted[fill];
                unsorted[fill] = unsorted[posMin];
                unsorted[posMin] = temp;
            }
        }
    }

    public static void insertionSort(int [] unsorted){
        for (int i = 1; i < unsorted.length; i++){
            int temp = unsorted[i];
            int j;
            for (j = i - 1; j >= 0 && temp < unsorted[j]; j--){
                unsorted[j+1] = unsorted[j];
            }
            unsorted[j+1] = temp;
        }
    }

    

}
