import java.util.ArrayList;
import java.util.List;

public class ListUtilities {
    private List<Integer> list = new ArrayList<>();

    public List<Integer> getUnique() {
        List<Integer> unique = new ArrayList<>();

        for(Integer number : list) {
            if(!(unique.contains(number))) {
                unique.add(number);
            }
        }

        return unique;
//        return new ArrayList<>(new HashSet<>(list));
    }

    public String join() {
        String removeAngleBrackets = list.toString();
        return removeAngleBrackets.substring(1,removeAngleBrackets.length()-1);

//        String result = "";
//
//        for(int i = 0; i < list.size(); i++) {
//            result += list.get(i);
//            if (i < list.size() - 1) {
//                result += ", ";
//            }
//        }
//
//        return result;
    }

//    public <T> int count(List<T> list, Integer valueToCount) {
//        int count = 0;
//
//        for(T number: list) {
//            if(number == valueToCount) {
//                count++;
//            }
//        }
//        return count;
//    }

    public Integer mostCommon() {
        Integer[] convertedList = list.toArray(new Integer[0]);
        IntegerArrayUtilities integerArrayUtil = new IntegerArrayUtilities();
        return integerArrayUtil.mostCommon(convertedList);
    }

    public static Integer findMissingNumber(Integer min, Integer max, List <Integer> list) {

        for(int i = min; i < max; i++) {
            if(!list.contains(i)) {
                return i;
            }
        }

        return 0;
    }

    private static <T> Integer indexOf(List<T> list , T elementToFind) {
        int index = -1;

        for (int i = 0; (i < list.size()) && (index == -1); i++) {
            if (list.get(i).equals(elementToFind)) {
                index = i;
            }
        }
        return index;
    }
}
