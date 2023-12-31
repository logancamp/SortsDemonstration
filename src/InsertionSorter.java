import java.util.Arrays;

public class InsertionSorter implements Sorter {
    public InsertionSorter() {
        // nothing needs to be done at here
    }
    public void insertion(int[] array) {
        System.out.println("\n===INSERTION SORT===");
        System.out.println("TestArray1 (before): " + Arrays.toString(array));
        int swap;
        for(int i=1; i<array.length; i++){
            for(int j=i; j>0; j--) {
                if(array[j-1] > array[j]) {
                    swap = array[j-1];
                    array[j-1] = array[j];
                    array[j] = swap;
                }
            }
            System.out.println("(step " + i + "): " + Arrays.toString(array));
        }
        System.out.println("TestArray1 (after): " + Arrays.toString(array) + "\n");
    }

    @Override
    public void selection(int[] array) {}

    @Override
    public void bubble(int[] array) {}
}
