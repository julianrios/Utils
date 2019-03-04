import org.junit.Assert;

import org.junit.Test;

public class StringUtilsTest {

    @Test
    public void camelCaseTest() {
        // Given
        String input = "the quick brown fox";
        String expected = "The quick brown fox";

        // When
        String actual = StringUtils.camelCase(input);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reverseTest() {
        // Given
        String input = "the quick brown fox";
        String expected = "xof nworb kciuq eht";

        // When
        String actual = StringUtils.reverse(input);

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void reverseThenCamelCaseTest() {
        // Given
        String input = "the quick brown fox";
        String expected = "Xof nworb kciuq eht";

        // When
        String actual = StringUtils.reverseThenCamelCase(input);

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void removeFirstAndLastCharacterTest() {
        // Given
        String input = "The quick brown";
        String expected = "he quick brow";

        // When
        String actual = StringUtils.removeFirstAndLastCharacter(input);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void invertCasingTest1() {
        // Given
        String input = "tHE quiCK brOwN";
        String expected = "The QUIck BRoWn";

        // When
        String actual = StringUtils.invertCasing(input);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void invertCasingTest2() {
        // Given
        String expected = "tHE quiCK brOwN";

        // When
        String actual = StringUtils.invertCasing(StringUtils.invertCasing(expected));

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testEncryptWithTheFirstAlphabet(){
        //Given
        String word = "apple";
        String expected = "dssoh";

        //When
        String actual = StringUtils.encrypt(word);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testEncryptWithTheLastLetters() {
        //Given
        String word = "wxyz";
        String expected = "zabc";

        //When
        String actual = StringUtils.encrypt(word);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeCharacterTest1(){
        // Given
        String word = "melatonin";
        String expected = "melatnin";
        char charToRemove = 'o';

        //When
        String actual = StringUtils.removeCharacter(word, charToRemove);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeCharacterTest2(){
        // Given
        String word = "tryptophan";
        String expected = "rypophan";
        char charToRemove = 't';

        //When
        String actual = StringUtils.removeCharacter(word, charToRemove);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeCharacterTest3(){
        // Given
        String word = "hydroxytryptamine";
        String expected = "hydroytryptamine";
        char charToRemove = 'x';

        //When
        String actual = StringUtils.removeCharacter(word, charToRemove);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getMiddleCharacterTest1(){
        //Given
        String word = "Aggadah";
        char expected = 'a';

        //When
        char actual = StringUtils.getMiddleCharacter(word);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getMiddleCharacterTest2(){
        //Given
        String word = "information";
        char expected = 'm';

        //When
        char actual = StringUtils.getMiddleCharacter(word);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getMiddleCharacterTest3(){
        //Given
        String word = "reification";
        char expected = 'c';

        //When
        char actual = StringUtils.getMiddleCharacter(word);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getLastWordTest1(){
        // Given
        String sentence = "We assume chemical evolution is a sufficient explanation.";
        String expected = "explanation.";

        // When
        String actual = StringUtils.getLastWord(sentence);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getLastWordTest2(){
        // Given
        String sentence = "What is meant by 'irreducible complexity'?";
        String expected = "complexity'?";

        // When
        String actual = StringUtils.getLastWord(sentence);

        // Then
        Assert.assertEquals(expected, actual);
    }

}
