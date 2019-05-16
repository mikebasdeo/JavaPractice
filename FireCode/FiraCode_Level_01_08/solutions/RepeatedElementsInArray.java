/**
 * Insert Something at the end of a Linked List
 * */

package FireCode.FiraCode_Level_01_08.solutions;

import java.util.*;



public class RepeatedElementsInArray {

    public static void main (String[] args){
        //test input
        int[] testArray = {1,2,3, 4, 5, 6, 7, 8, 9, 10, 1, 8, 1, 1};
        System.out.println(duplicate(testArray));

    }

    public static String duplicate(int[] numbers){

        // list needs to be returned as a string at the end
        List answer = new ArrayList();

        // make dictionary
        Map<Integer, Integer> myDict = new HashMap<Integer, Integer>();


        //populate dictionary
        for(int number : numbers){
            if(myDict.containsKey(number)){
                myDict.put(number, myDict.get(number) + 1);
            } else{
                myDict.put(number, 1);
            }
        }


        //System.out.println(myDict);


        //How to iterate and remove things from a dictionary

        // Step 1 Create a set out of the dictionary for iteration
        Set<Map.Entry<Integer, Integer>> setOfEntries = myDict.entrySet();
        //System.out.println(setOfEntries);

        // Create Iterator form teh new set
        Iterator<Map.Entry<Integer, Integer>> myIterator = setOfEntries.iterator();




        // now try to iterate over the map
        while(myIterator.hasNext()){

            //keep an iterator going inside the while loop
            Map.Entry<Integer, Integer> entry = myIterator.next();

            int value = entry.getValue();

            //do stuff here
            if(value ==1 ){
                myIterator.remove();
            }
        }

        // now lets make a List out of the keys of the dictionary
        List answerList = new ArrayList();
        //regular dictionary traversal
        for(int key: myDict.keySet()){
            answerList.add(key);
        }

        Collections.sort(answerList);


        //System.out.println(answerList);


        return answerList.toString();
    }


}
