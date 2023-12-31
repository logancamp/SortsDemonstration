import java.util.Random;

public class SorterTester {
    private static int[] generateRandomIntArray() {
        int[] randomIntArray = new int[6];
        Random rand = new Random();

        for(int i = 0; i< 6; i++) {
            randomIntArray[i] = rand.nextInt(10);
        }
        return randomIntArray;
    }

    public static void main(String[] args){
        int[] array = generateRandomIntArray();
        int[] array2 = generateRandomIntArray();
        int[] array3 = generateRandomIntArray();

        InsertionSorter insertion = new InsertionSorter();
        SelectionSorter selection = new SelectionSorter();
        BubbleSorter bubble = new BubbleSorter();

        insertion.insertion(array);
        selection.selection(array2);
        bubble. bubble(array3);
    }
}
