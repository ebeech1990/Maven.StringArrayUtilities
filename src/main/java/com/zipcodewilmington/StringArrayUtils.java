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
        String[] reverse = new String[array.length];

        int count = 0;

        for(int i = array.length -1; i >= 0; i--){
            String temp = array[i];
            reverse[count] = temp;
            count ++;
        }
        return reverse;



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


        int arrLen = array.length -1;
        String[] newArray = new String[arrLen];

        int current = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] == valueToRemove){

            }
            else{
                newArray[current] = array[i];
                current++;
            }
        }

        return newArray;

//


    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        String placeHolder = "qwerty";
        String[] dummy = new String[array.length];
        dummy[0] = array[0];
        int foundGroups = 1;

        for (int i = 1; i <= array.length -1; i++){

            String actual = array[i];
            if(array[i].equals(array[i-1])){
                dummy[i] = placeHolder;
            }
            else{
                foundGroups++;
                dummy[i] = actual;
            }
        }
        String[] result = new String[foundGroups];
        int counter = 0;

        for(int x = 0; x <= array.length -1; x++) {
            if(dummy[x].equals(placeHolder)){

            }
            else if(!dummy[x].equals(placeHolder)){
                result[counter] = dummy[x];
                counter++;
            }
        }
        return result;


    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        String placeHolder = "qwerty";
        String[] dummy = new String[array.length];
        int foundGroups = 0;

        for (int i = 0; i <= array.length - 1; i++) {

            String actual = array[i];
            if (i == 0) {
                dummy[i] = array[i];
                foundGroups++;
            }
            else if (array[i].equals(array[i - 1])) {
                dummy[i] = placeHolder;
            }
            else {
                dummy[i] = actual;
                foundGroups++;
            }
        }

        String[] result = new String[foundGroups];
        boolean isFirstLoop = true;
        int counter = 0;

        String current = "";

        for (int i = 0; i <= array.length - 1; i++) {

            if (isFirstLoop) {
                result[0] = dummy[0];
                isFirstLoop = false;
                current = result[0];

            }
            else if (dummy[i].equals(placeHolder)) {
                result[counter] += current;

            }
            else if (!dummy[i].equals(placeHolder)) {
                counter++;
                result[counter] = dummy[i];
                current = dummy[i];
            }


        }
        return result;
    }


}
