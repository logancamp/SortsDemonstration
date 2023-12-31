import java.util.Arrays;

public class SelectionSorter implements Sorter{
    public SelectionSorter() {
        // nothing needs to be done at here
    }

    @Override
    public void insertion(int[] array) {}

    public void selection(int[] array) {
        System.out.println("===SELECTION SORT===");
        System.out.println("TestArray2 (before): " + Arrays.toString(array));
        for(int i=0; i<array.length; i++) {
            int swap = array[i];
            int hold = i;
            for(int j=i; j< array.length; j++) {
                if(array[j]<swap) {
                    swap = array[j];
                    hold = j;
                }
            }
            array[hold] = array[i];
            array[i] = swap;
            System.out.println("(step " + (i+1) + "): " + Arrays.toString(array));
        }
        System.out.println("TestArray2 (after): " + Arrays.toString(array) + "\n");
    }

    @Override
    public void bubble(int[] array) {}
}
