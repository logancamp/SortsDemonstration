import java.util.Arrays;

public class BubbleSorter implements Sorter{
    public BubbleSorter() {
        // nothing needs to be done at here
    }

    @Override
    public void insertion(int[] array) {}

    @Override
    public void selection(int[] array) {}

    public void bubble(int[] array) {
        System.out.println("===BUBBLE SORT===");
        System.out.println("TestArray3 (before): " + Arrays.toString(array));
        for(int i=0; i<array.length-1; i++) {
            int swap;
            for(int j=0; j<array.length-1; j++) {
                if(array[j]>array[j+1]) {
                    swap = array[j+1];
                    array[j+1]=array[j];
                    array[j]=swap;
                }
            }
            System.out.println("(step " + (i+1) + "): " + Arrays.toString(array));
        }
        System.out.println("TestArray3 (after): " + Arrays.toString(array) + "\n");
    }
}
