package com.zipcodewilmington;

import java.util.Arrays;
import java.util.Objects;
import java.util.ArrayList;



/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {

        //enhanced for loop
        for (String s : array) { // "For each element s in array"

            if (s.equalsIgnoreCase(value)) { //this line compares String s to value while ignoring case
                return true; //if strings are the same, returns true
            }

        }
        return false; //otherwise returns false
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] reversedArray = new String[array.length];

        for (int i = 0; i < array.length; i++) {
            reversedArray[array.length - 1 - i] = array[i];
        }

        return reversedArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {

        for (int i = 0; i < array.length; i++) {
            if (!array[i].equalsIgnoreCase(array[array.length - i - 1]))
                return false;
        }

        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {

        String s = Arrays.toString(array).toLowerCase();
        char l = 'a';

        for (int i = 1; i <= 26; i++) {
            if (!s.contains((String.valueOf(l)))) {
                return false;
            } else {
                l++;
            }

        }
        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int c = 0;
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i].equals(value)) {
                c++;
            }
         }
        return c;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {

        int c = 0;

        for (int i = 0; i <=array.length - 1; i++) {
            if (array[i].equals(valueToRemove)) {
                c++;
            }
        }

        String[] newArray = new String[array.length - c];

        for (int i1 = 0, i2 = 0; i1 < array.length; i1++) {
            if (Objects.equals(array[i1], valueToRemove)) {

            } else {
                newArray[i2] = array[i1];
                i2++;
            }
        }
        return newArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {

        String[] s;
        int c = 0;
        int b = 0;
        String duplicate = "";

        for (int i = 0; i < array.length; i++) {
            if (!array[i].equals(duplicate)) {
                duplicate = array[i];
            } else {
                c++;
            }
        }

        s = new String[array.length - c];

        for (int i = 0; i < array.length; i++) {
            if (!array[i].equals(duplicate)) {
                s[b] = array[i];
                duplicate = array[i];
                b++;
            }
        }
        return s;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {

        ArrayList<String> s = new ArrayList<>();
        int a = 0;
        int b = 0;

        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                s.add(array[i]);
                continue;

            }
            if (array[a].equals(array[i])) {
                s.set(b, s.get(b) + array[i]);
            } else {
                a = i;
                s.add(array[i]);
                b = s.size() - 1;
            }
        }

        return s.toArray(new String[s.size()]);
    }


}
