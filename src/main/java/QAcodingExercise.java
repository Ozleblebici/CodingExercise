import java.util.*;


public class QAcodingExercise {



    /**
     * Write a program in python or java which accepts a single list as a parameter. This list consists of any number of lists (1..n),
     * and you can assume each list only contains words (e..g. [‘apple’, ‘mango’, ‘cherry’…]). The program should print out the following:
     * The program should print out the following:
     * - words that appear in more than one list
     * - The total number of unique words across all lists
     * - Top five frequent words in the all lists
     */

    public static void main(String[] args) {

        // TODO To check and see print outs program on console, pls remove '//' commends for line 27,28 and 29
        System.out.println("Words that appear in more than one list = " + wordsAppearMoreThanOne(TestData.basicData()));
        System.out.println("The total number of unique words across all lists = " + uniqueWordsTotalNumber(TestData.basicData()));
        System.out.println("Top five frequent words in the all lists = " + topFiveFrequentWords(TestData.basicData()));
    }


    public static ArrayList<String> wordsAppearMoreThanOne(List<List<String>> allLists) {

        Set<String> printList = new TreeSet<String>();

        for (int i = 0; i < allLists.size() - 1; i++) {
            for (String str : allLists.get(i)) {
                for (int j = i + 1; j < allLists.size(); j++) {
                    if (allLists.get(j).contains(str)) {
                        printList.add(str);
                    }
                }
            }
        }
        //   System.out.println("words that appear in more than one list: " + printList);
        return new ArrayList<>(printList);
    }


    public static int uniqueWordsTotalNumber(List<List<String>> allLists) {

        Set<String> oneUniqueList = new TreeSet<String>();
        for (List<String> list : allLists) {
            oneUniqueList.addAll(list);
        }

        int nonUniqueItemNumbers = wordsAppearMoreThanOne(allLists).size();

        //       System.out.println("The total number of unique words across all lists: " + (oneUniqueList.size() - nonUniqueItemNumbers) );
        return oneUniqueList.size() - nonUniqueItemNumbers;

    }

    public static List<String> topFiveFrequentWords(List<List<String>> allLists) {

        Map<String, Integer> countWords = new HashMap<String, Integer>();

        // Create 1 list and put all words in it
        List<String> oneList = new ArrayList<String>(); // all words
        for (List<String> list : allLists) {
            oneList.addAll(list);
        }

        // Put all words in Map one by one  and add frequencies
        for (String str : oneList) {
            countWords.put(str, Collections.frequency(oneList, str));
        }

        // First Way - with Map stream

        // System.out.print("Top five frequent words in the all lists: ");
        countWords.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).limit(5);
        //   .forEach(words -> System.out.print(words.getKey() + " "));
        //  System.out.println();


        //Second Way - with Collections & Map entry

        List<String> top5List = new ArrayList<String>(5);

        Set<Integer> maxNumberSet = new TreeSet<Integer>(countWords.values());

        List<Integer> maxNumberList = new ArrayList<Integer>(maxNumberSet);
        Collections.reverse(maxNumberList);

        for (Integer frequency : maxNumberList) {
            for (Map.Entry<String, Integer> entry : countWords.entrySet()) {
                if (top5List.size() < 5) {
                    if (entry.getValue().equals(frequency)) {
                        top5List.add(entry.getKey());
                    }
                } else {
                    break;
                }
            }
        }

        //  System.out.println("top5List = " + top5List);
        return top5List;
    }


}

