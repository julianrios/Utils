/**
 * Created by Julian Rios
 * Version 3/2/18
 */
public class StringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        str = str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
        return str;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        StringBuilder reverseStr = new StringBuilder(str);
        reverseStr.reverse();
        return reverseStr.toString();

//        Without StringBuilder
/*
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
*/
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        String reverseThenCamelCaseStr = StringUtils.reverse(str);
        reverseThenCamelCaseStr = StringUtils.camelCase(reverseThenCamelCaseStr);
        return reverseThenCamelCaseStr;
    }

    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        str = str.substring(1,str.length()-1);
        return str;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        String result = "";

        for(Character letter : str.toCharArray()) {
            if(Character.isLowerCase(letter)) {
                result += Character.toUpperCase(letter);
            } else if(Character.isUpperCase(letter)) {
                result += Character.toLowerCase(letter);
            } else {
                result += letter;
            }
        }

//       For Loop
        /*for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isLowerCase(c)) {
                result += Character.toUpperCase(c);
            } else {
                result += Character.toLowerCase(c);
            }
        }*/
        return result;
    }



    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     *
     * example : removeString("Hello there", "llo") // Should return "He there"
     *           removeString("Hello there", "e") //  Should return "Hllo thr"
     *           removeString("Hello there", "x") // Should return "Hello there"
     */
    public static String removeString(String base, String remove){
        return base.replace(remove, "");
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public static String removeCharacter(String value, Character charToRemove) {
        String str = "";

        for(Character letter : value.toCharArray()) {
            if(!(letter.equals(charToRemove))) {
                str += letter;
            }
        }

        /*for(int i = 0; i < value.length(); i++) {
            if(value.charAt(i) != charToRemove){
                str += value.charAt(i);
            }
        }*/
        return str;
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public static Character getMiddleCharacter(String word) {
        char middleChar;
        if(word.length()/2 ==0) {
            middleChar = word.charAt((word.length()/2));
        } else {
            middleChar = word.charAt((word.length()-1)/2);
        }
        return middleChar;
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public static String getLastWord(String sentence) {
//        lastIndexOf counts the entire string up to the last index of " " and adds 1
//        substring is inclusive so the plus one is needed to get the remaining chars for the last word

//        String lastWord = sentence.substring(sentence.lastIndexOf(" ")+1);

        String[] words = sentence.split(" ");
        return words[words.length-1];
    }

    /**
     * To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
     * intended audience. This method encrypt the message by shifting the letter by 3 characters. If the character is
     * at the end of the alphabet, it will wraps around.
     * For example:
     *  'a' => 'd'
     *  'w' => 'z'
     *  'x' => 'a'
     *  'y' => 'b'
     * @param word
     * @return the encrypted string by shifting each character by three character
     */
    public static String encrypt(String word) {
        String encryptedWord = "";
        char[] charArray = word.toCharArray();
        for(char letter: charArray){
            if(letter == 'x') {
                letter = 'a';
            }else if (letter == 'y') {
                letter = 'b';
            }else if (letter == 'z') {
                letter = 'c';
            } else {
                letter = (char)(letter + 3);
            }
            encryptedWord += String.valueOf(letter);
        }
        return encryptedWord;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String sentence = "";
        for (String s : array) {
            sentence += s;
        }
        sentence = sentence.replaceAll("\\s+","").toLowerCase();

        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        for(char letter : alphabet) {
            if(!sentence.contains(String.valueOf(letter))) {
                return false;
            }
        }
        return true;
    }

    public Boolean startsWith(String string, Character character) {
        Character firstLetter = string.charAt(0);
        if(firstLetter.toString().equalsIgnoreCase(character.toString())) {
            return true;
        }
        return false;

//        String lowerCaseString = string.toLowerCase();
//        String charLowerCase = character.toString().toLowerCase();
//
//        return lowerCaseString.startsWith(charLowerCase);
    }

}
