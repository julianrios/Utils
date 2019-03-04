import java.util.Arrays;

public class ArrayUtilities {

    public static <T> int getNumberOfOccurrences(T [] array, T valueToCount) {
        int count = 0;

        for(T letter : array) {
            if(letter.equals(valueToCount)) {
                count++;
            }
        }
        return count;
    }


    public static <T> T[] removeValue(T[] array, int indexToRemove) {
        T valToRemove = array[indexToRemove];
        for(int i = indexToRemove + 1; i < array.length; i++) {
            array[i-1] = array[i];
        }
        array[array.length -1] = valToRemove;

        return Arrays.copyOf(array, array.length-1);
    }

    public static <T> Integer indexOf(T[] array, T elementToFind) {
        int index = -1;

        for (int i = 0; (i < array.length) && (index == -1); i++) {
            if (array[i].equals(elementToFind)) {
                index = i;
            }
        }
        return index;
    }



    public static void main(String[] args) {
//         TODO Delete multiple occurrences
//        Integer[] numbers = {7,1,6,4,5,6,6,6,6,7,7,8};
//        Integer numberSixCount = ArrayUtilities.getNumberOfOccurrences(numbers, 7);
//        System.out.println(numberSixCount);
//        System.out.println(Arrays.toString(numbers));
//
//        Integer index = ArrayUtilities.indexOf(numbers, 7);
//        System.out.println(index);
//
//        Integer[] newNumbers = new Integer[numbers.length-5];
//
//        // Moves extras to the end
//        while(numberSixCount > 1) {
//
//            newNumbers = removeValue(numbers, index);
//            index = ArrayUtilities.indexOf(newNumbers, 7);
//
//            numberSixCount--;
//        }

//        newNumbers = Arrays.copyOf(newNumbers,newNumbers.length-4);
//
//        System.out.println(Arrays.toString(newNumbers));
//        return


//        String Demo
        String[] words = {"hello", "hello", "bye", "hello"};
        Integer helloCount = ArrayUtilities.getNumberOfOccurrences(words, "hello");
        System.out.println(helloCount);
        System.out.println(Arrays.toString(words));

        Integer index = ArrayUtilities.indexOf(words, "bye");
        System.out.println(index);

        String[] newWords = ArrayUtilities.removeValue(words, index);
        System.out.println(Arrays.toString(newWords));

        index = ArrayUtilities.indexOf(newWords, "bye");
        System.out.println(index);
    }
}
