package com.zipcodewilmington;


import com.sun.tools.javac.util.ArrayUtils;

import java.lang.reflect.Array;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {

        String firstEl = array[0];
        return firstEl;
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {

        String secondEl = array[1];
        return secondEl;
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {

        String lastEl = array[array.length-1];
        return lastEl;
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {

        String secToLastEl = array[array.length-2];
        return secToLastEl;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        boolean result = false;
        for(String s : array) {
            if(s.equals(value)) {
                result = true;
            }
        }
        return result;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
       List<String> revList = Arrays.asList(array);
       Collections.reverse(revList);
       array = (String[]) revList.toArray();
       return array;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
//
        for(int i = 0; i <= array.length/2 && array.length !=0; i++) {
            if(array[i] != array[array.length-i-1]){
                break;
            }
            return true;
        }
        return false;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        boolean result = true;
        int zCount = 0;
        for(int i  = 0; i < array.length; i++) {
            if(array[i].contains("z") || array[i].contains("Z")) {
                zCount++;
            }

        }
        if(zCount == 0) {
            result = false;
        }
        return result;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int counter = 0;

        for(String s : array) {
            if(s.contains(value)) {
                counter++;
            }
        }


        return counter;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        valueToRemove = valueToRemove.toLowerCase();
        int counter = 0;

        for(int i  = 0; i < array.length; i++) {
            array[i] = array[i].toLowerCase();

        }
        for(String s : array) {
            if(s.contains(valueToRemove)) {
                counter++;
            }

        }

        String[] newArr = new String[array.length - counter];

        for (int i = 0, k = 0; i < array.length; i++) {

            if (array[i].equals(valueToRemove)) {
                continue;
            }

            newArr[k++] = array[i];
        }

//
        return newArr;


    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        int counter = 0;

        for(int i  = 0; i < array.length; i++) {
            array[i] = array[i].toLowerCase();

        }


        String[] newArr = new String[array.length - counter];

        for (int i = 0, k = 0; i < array.length; i++) {

            if (array[i].equals("valueToRemove")) {
                continue;
            }

            newArr[k++] = array[i];
        }
        return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        return null;
    }


}
