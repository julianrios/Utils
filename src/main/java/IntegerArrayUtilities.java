import java.util.Arrays;

public class IntegerArrayUtilities {
    public Integer[] range(int start, int stop) {
//        int[] range = IntStream.rangeClosed(start, stop).toArray();
//        Integer[] integerArray = Arrays.stream( range ).boxed().toArray( Integer[]::new );
//        return integerArray;

        int length = stop - start + 1;

        Integer[] numbers = new Integer[length];
        int count = start;

        for (int i = 0; i < length ; i++) {
            numbers[i] = count;
            count++;
        }

        return numbers;
    }

    public Integer[] merge(Integer[] array1, Integer[] array2) {

        int newLength = array1.length + array2.length;
        Integer[] numbers = Arrays.copyOf(array1, newLength);

        int insertPosition = array1.length;

        for(Integer numberFromSecondArray : array2) {
            numbers[insertPosition] = numberFromSecondArray;
            insertPosition++;
        }

//        Shorter Way to copy array
//        Integer[] merged = Arrays.copyOf(array1, array1.length + array2.length);
//        System.arraycopy(array2, 0, merged, array1.length, array2.length);
        return numbers;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        Integer[] rotated = new Integer[array.length];
        int rotatedIndex = 0;

        //copy from the index to the end of the array
        for(int i = index; i < array.length; i++) {
            rotated[rotatedIndex] = array[i];
            rotatedIndex++;
        }

        //copy the beginning up to the index
        for (int i = 0; i < index; i++) {
            rotated[rotatedIndex] = array[i];
            rotatedIndex++;
        }

        return rotated;

//        return merge(Arrays.copyOfRange(array, index, array.length),
//                Arrays.copyOfRange(array, 0, index));
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
//        Integer totalCountOccurrence = getNumberOfOccurrences(array1, valueToEvaluate)
//                + getNumberOfOccurrences(array2, valueToEvaluate);
//        return totalCountOccurrence;
        return count(array1, valueToEvaluate) + count(array2, valueToEvaluate);
    }

    public Integer countOccurrence(Integer[] array1, Integer valueToEvaluate) {
        return count(array1, valueToEvaluate);
    }

    public int count(Integer[] array, Integer valueToCount) {
        int count = 0;

        for(Integer number: array) {
            if(number == valueToCount) {
                count++;
            }
        }
        return count;
    }

    public Integer mostCommon(Integer[] array) {
//        int common = array[0];
//        int commonCount = count(array, common);
//
//        for(Integer currentNumber : array) {
//            int currentCount = count(array, currentNumber);
//
//            if(currentCount > commonCount) {
//                common = currentNumber;
//                commonCount = currentCount;
//            }
//        }
//        return common;

        Integer mostCommon = array[0];
        Integer mostCommonCount = 0;
        for(Integer number : array) {
            int occurrences = countOccurrence(array, number);
            if(occurrences > mostCommonCount) {
                mostCommon = number;
                mostCommonCount = occurrences;
            }
        }
        return mostCommon;
    }

    public static Integer findMissingNumber(Integer min, Integer max, Integer[] array) {
        int expectedSum = 0;

        for(int i = min; i < max; i++) {
            expectedSum += i;
        }

        for(Integer number : array) {
            expectedSum -= number;
        }

        return expectedSum;
    }
}
