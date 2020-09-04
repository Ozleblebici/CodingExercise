import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class QAcodingExerciseTest {



    //------------------wordsAppearMoreThanOne()--------------------------------------------------------------

    /**
     * Base Happy Test with basic test data
     * for wordsAppearMoreThanOne() method
     * "words that appear in more than one list"
     */
    @Test
    @DisplayName("wordsAppearMoreThanOne")
    @Order(1)
    void wordsAppearMoreThanOne()  {
        ArrayList<String> expectedData = new ArrayList<String>(Arrays.asList("a", "c", "d", "e", "k", "m"));
        assertEquals(expectedData,
                QAcodingExercise.wordsAppearMoreThanOne(TestData.basicData()));
    }


    /**
     * Boundary test / lower level test
     * for wordsAppearMoreThanOne() method
     * "words that appear in more than one list"
     */
    @Test
    @DisplayName("wordsAppearMoreThanOne / Boundary Test")
    @Order(2)
    void wordsAppearMoreThanOne_boundaryTest_min()  {
        ArrayList<String> expectedData = new ArrayList<>(); // empty list
        assertEquals(expectedData, QAcodingExercise.wordsAppearMoreThanOne(TestData.boundaryMinData()));
    }


    /**
     * Check duplicated that in same class
     * They should not be in expected list, they are multiple but
     * they are not appear in the other list.
     * for wordsAppearMoreThanOne() method
     * "words that appear in more than one list"
     */
    @Test
    @DisplayName("wordsAppearMoreThanOne / Boundary Test_Duplicate")
    @Order(3)
    void sameListDuplicateDataTest()  {
        ArrayList<String> expectedData = new ArrayList<>(); // empty list
        assertEquals(expectedData, QAcodingExercise.wordsAppearMoreThanOne(TestData.duplicateJustInSameList_Data()));
    }

    /**
     * Base Case Sensitivity Test
     * for wordsAppearMoreThanOne() method
     * "words that appear in more than one list"
     */
    @Test
    @DisplayName("wordsAppearMoreThanOne / Case Sensitivity Test")
    @Order(4)
    void wordsAppearMoreThanOne_caseSensitivity()  {
        ArrayList<String> expectedData = new ArrayList<String>(Arrays.asList("a", "c", "d", "e", "m"));
        assertEquals(expectedData, QAcodingExercise.wordsAppearMoreThanOne(TestData.caseSensitiveData()));
    }


    /**
     * Extreme Long test with Random Data
     * for wordsAppearMoreThanOne() method
     * "words that appear in more than one list"
     */
    @Test
    @DisplayName("wordsAppearMoreThanOne / Extreme Long Random Data Test")
    @Order(5)
    void wordsAppearMoreThanOne_extremeRandomData()  {
        try {
            QAcodingExercise.wordsAppearMoreThanOne(TestData.extremeRandomData(10, 10, 20));
        } catch (RuntimeException r){
            r.printStackTrace();
            Assertions.fail("Runtime Exception");
        } catch (Exception e) {
            e.printStackTrace();
            Assertions.fail("Exception");
        }

        // we can add timer and add limit for methods to done Performances test !!
    }


    //--------------------uniqueWordsTotalNumber()---------------------------------------------------


    /**
     * Base Happy Test with basic test data
     * for uniqueWordsTotalNumber() method
     * " The total number of unique words across all lists"
     */
    @Test
    @DisplayName("uniqueWordsTotalNumber")
    @Order(6)
    void uniqueWordsTotalNumber()  {
        int expectedData = 6;
        assertEquals(expectedData, QAcodingExercise.uniqueWordsTotalNumber(TestData.basicData()));
    }

    /**
     * Boundary test / zero level test
     * for uniqueWordsTotalNumber() method
     * " The total number of unique words across all lists"
     */
    @Test
    @DisplayName("uniqueWordsTotalNumber / Boundary Test_Zero")
    @Order(7)
    void uniqueWords_zeroTest()  {
        int expectedData = 0;
        assertEquals(expectedData, QAcodingExercise.uniqueWordsTotalNumber(TestData.noUnique_Data()));
    }


    /**
     * Boundary test / Upper Limit test
     * All words(test data) are unique!!
     * for uniqueWordsTotalNumber() method
     * " The total number of unique words across all lists"
     */
    @Test
    @DisplayName("uniqueWordsTotalNumber / Boundary Test_Upper Limit")
    @Order(8)
    void uniqueWords_upperLimitTest()  {
        int expectedData = 8;
        assertEquals(expectedData, QAcodingExercise.uniqueWordsTotalNumber(TestData.allUnique_Data()));
    }


    /**
     * Base Case Sensitivity Test
     * for uniqueWordsTotalNumber() method
     * "words that appear in more than one list"
     */
    @Test
    @DisplayName("uniqueWordsTotalNumber / Case Sensitivity Test")
    @Order(9)
    void uniqueWordsTotalNumber_caseSensitivity()  {
        int expectedData = 12;
        assertEquals(expectedData, QAcodingExercise.uniqueWordsTotalNumber(TestData.caseSensitiveData()));
    }


    /**
     * Extreme Long test with Random Data
     * for uniqueWordsTotalNumber() method
     * "words that appear in more than one list"
     */
    @Test
    @DisplayName("uniqueWordsTotalNumber / Extreme Long Random Data Test")
    @Order(10)
    void uniqueWordsTotalNumber_extremeRandomData()  {
        try {
            QAcodingExercise.uniqueWordsTotalNumber(TestData.extremeRandomData(10, 10, 20));
        } catch (RuntimeException r){
            r.printStackTrace();
            Assertions.fail("Runtime Exception");
        } catch (Exception e) {
            e.printStackTrace();
            Assertions.fail("Exception");
        }
        // we can add timer and add limit for methods to done Performances test !!
    }




    //-----------------topFiveFrequentWords()------------------------------------------------------


    /**
     * Base Happy Test with basic test data
     * for topFiveFrequentWords() method
     * " Top five frequent words in the all lists "
     */
    @Test
    @DisplayName("topFiveFrequentWords")
    @Order(11)
    void topFiveFrequentWords()  {
        ArrayList<String> expectedData = new ArrayList<String>(Arrays.asList("a", "c", "d", "e", "m"));
        assertEquals(expectedData, QAcodingExercise.topFiveFrequentWords(TestData.basicData()));
    }


    /**
     * Boundary test / lower level test
     * Test data has just one word
     * for topFiveFrequentWords() method
     * " Top five frequent words in the all lists "
     */
    @Test
    @DisplayName("topFiveFrequentWords / Boundary Test_MinValue")
    @Order(12)
    void topFiveFrequentWords_min()  {
        ArrayList<String> expectedData = new ArrayList<>(Arrays.asList("a"));
        assertEquals(expectedData, QAcodingExercise.topFiveFrequentWords(TestData.boundaryMinData()));
    }

    /**
     * Boundary test / zero level test
     * for topFiveFrequentWords() method
     * " Top five frequent words in the all lists "
     */
    @Test
    @DisplayName("topFiveFrequentWords / Boundary Test_Zero/Empty Value")
    @Order(13)
    void topFiveFrequentWords_zero()  {
        ArrayList<String> expectedData = new ArrayList<>();
        assertEquals(expectedData, QAcodingExercise.topFiveFrequentWords(new ArrayList<>())); // or  Collections.EMPTY_LIST  as a Data
    }


    /**
     * Boundary test / upper level test
     * (in Data, there are more than 6 same size words)
     * for topFiveFrequentWords() method
     * " Top five frequent words in the all lists "
     */
    @Test
    @DisplayName("topFiveFrequentWords / Boundary Test_Upper Value for criterion")
    @Order(14)
    void topFiveFrequentWords_Upper()  {
        ArrayList<String> expectedData = new ArrayList<>(Arrays.asList("a","b","c","d","e"));
        assertEquals(expectedData, QAcodingExercise.topFiveFrequentWords(TestData.boundary_upper()));
    }



    /**
     * Base Case Sensitivity Test
     * for topFiveFrequentWords() method
     * "words that appear in more than one list"
     */
    @Test
    @DisplayName("topFiveFrequentWords / Case Sensitivity Test")
    @Order(15)
    void topFiveFrequentWords_caseSensitivity()  {
        ArrayList<String> expectedData = new ArrayList<>(Arrays.asList("a","c","e","m","d"));
        assertEquals(expectedData, QAcodingExercise.topFiveFrequentWords(TestData.caseSensitiveData()));
    }


    /**
     * Extreme Long test with Random Data
     * for topFiveFrequentWords() method
     * "words that appear in more than one list"
     */
    @Test
    @DisplayName("topFiveFrequentWords / Extreme Long Random Data Test")
    @Order(16)
    void topFiveFrequentWords_extremeRandomData()  {
        try {
            QAcodingExercise.topFiveFrequentWords(TestData.extremeRandomData(10, 10, 20));
        } catch (RuntimeException r){
            r.printStackTrace();
            Assertions.fail("Runtime Exception");
        } catch (Exception e) {
            e.printStackTrace();
            Assertions.fail("Exception");
        }
        // we can add timer and add limit for methods to done Performances test !!
    }









    /**
     * 1- I start my tests with the pre-code review. Basically, I review codes and methods. By doing syntax, execution and logic errors checks, I have done the basic tests.
     *
     * 2- First, I run the program with the happy test method by selecting small, simple size test data. In this way, I can do a basic function test.
     *
     * 3- Afterwards, I try to test the upper and lower limits of the method parameters by selecting the test data at the limit values.
     * For example, I test all methods with a minimum (1) element parameter value. In addition, I do the parameter coverage tests with lower and upper limits.
     * For example, for the "The total number of unique words across all lists" method, I do tests with test data that does not contain any unique data.
     *
     * 4- I do separate tests using repeating duplicate data and null data.
     * For example, for the "words that appear in more than one list" method, I do tests using only the sample test data that is not in the other lists,
     * repeating more than once in its own list.
     *
     * 5- I do negative status tests with sample data below the output values required by the methods.
     * For example, for the "Top five frequent words in the all lists" method, I give data less than 5 words and test whether the method outputs according to the
     * data without any errors.
     * 6- Finally, I apply performance tests with extremely large test data.
     * For example; I try to prepare sample test data as the max int value for all methods and run them.
     */

}