import com.github.javafaker.Faker;

import java.util.*;

public class TestData {


    public static List<List<String>> testData= new ArrayList<>();

    /**
     * @return basic test data for happy test
     */
    public static List<List<String>> basicData() {
        List<String> list1 = Arrays.asList("a", "b", "c", "m");
        List<String> list2 = Arrays.asList("a", "d", "e", "f");
        List<String> list3 = Arrays.asList("d", "g", "c");
        List<String> list4 = Arrays.asList("a", "e", "k", "m");
        List<String> list5 = Arrays.asList("h", "e", "j", "a", "c");
        List<String> list6 = Arrays.asList("d", "a", "l", "k", "m", "c");

        testData = new ArrayList<List<String>>(Arrays.asList(list1, list2, list3, list4, list5, list6));

        return testData;
    }

    /**
     * @return single list, single value / boundary Min Data
     */
    public static List<List<String>> boundaryMinData() {
        List<String> list1 = Arrays.asList("a");
        testData = new ArrayList<>(Arrays.asList(list1));

        return testData;
    }


    /**
     * @return words dublicate just in the same list
     */
    public static List<List<String>> duplicateJustInSameList_Data() {
        List<String> list1 = Arrays.asList("a", "a");
        List<String> list2 = Arrays.asList("b", "b");
        List<String> list3 = Arrays.asList("c", "c");
        List<String> list4 = Arrays.asList("d", "d");
        testData = new ArrayList<>(Arrays.asList(list1, list2, list3, list4));

        return testData;
    }

    /**
     * @return use for zero unique data
     */
    public static List<List<String>> noUnique_Data() {
        List<String> list1 = Arrays.asList("a", "b");
        List<String> list2 = Arrays.asList("a", "b");
        List<String> list3 = Arrays.asList("a", "b");
        List<String> list4 = Arrays.asList("a", "b");
        testData = new ArrayList<>(Arrays.asList(list1, list2, list3, list4));

        return testData;
    }

    /**
     * @return  use for All unique data
     */
    public static List<List<String>> allUnique_Data() {
        List<String> list1 = Arrays.asList("a", "b");
        List<String> list2 = Arrays.asList("c", "d");
        List<String> list3 = Arrays.asList("e", "f");
        List<String> list4 = Arrays.asList("g", "h");
        testData = new ArrayList<>(Arrays.asList(list1, list2, list3, list4));

        return testData;
    }


    /**
     * @return boundary test data for upper test
     */
    public static List<List<String>> boundary_upper() {
        List<String> list1 = Arrays.asList("a", "b", "c", "d", "e", "f");
        List<String> list2 = Arrays.asList("a", "b", "c", "d", "e", "f");
        List<String> list3 = Arrays.asList("a", "b", "c", "d", "e", "f");
        List<String> list4 = Arrays.asList("a", "b", "c", "d", "e", "f");
        List<String> list5 = Arrays.asList("a", "b", "c", "d", "e", "f");
        List<String> list6 = Arrays.asList("a", "b", "c", "d", "e", "f");

        testData = new ArrayList<List<String>>(Arrays.asList(list1, list2, list3, list4, list5, list6));

        return testData;
    }

    /**
     * @param numberOfList     how many list will add in test data
     * @param minWordNumber    minimum word limit for a list (min size of list)
     * @param maxWordNumber    maximum word limit for a list (max size of list)
     * @return to Extreme large Random data
     */
    public static List<List<String>> extremeRandomData(int numberOfList, int minWordNumber, int maxWordNumber) {
        Random random = new Random();
        int sizeOfList = random.nextInt(maxWordNumber-minWordNumber+1) + minWordNumber;

        Faker faker = new Faker();

        for (int j = 0; j < numberOfList; j++) {
            List<String> tempList = new ArrayList<>();
            for (int k = 0; k < sizeOfList; k++) {
                tempList.add(faker.name().firstName());
            }
            testData.add(tempList);
        }

        return testData;
    }



    /**
     * @return basic test data for case sensitivity
     */
    public static List<List<String>> caseSensitiveData() {
        List<String> list1 = Arrays.asList("a", "b", "c", "m");
        List<String> list2 = Arrays.asList("A", "d", "e", "f");
        List<String> list3 = Arrays.asList("d", "G", "C","g");
        List<String> list4 = Arrays.asList("a", "e", "k", "m");
        List<String> list5 = Arrays.asList("h", "e", "j", "a", "c");
        List<String> list6 = Arrays.asList("D", "a", "l", "K", "m", "c");

        testData = new ArrayList<List<String>>(Arrays.asList(list1, list2, list3, list4, list5, list6));

        return testData;
    }


}
