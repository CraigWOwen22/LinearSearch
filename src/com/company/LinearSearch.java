package com.company;

//Utility class to provide a linear search when given a small array and a target value.

public class LinearSearch {

    public static int linearSearch(int[] inputVal, int targetVal){

        for(int i=0; i<inputVal.length; i++){
            if(inputVal[i] == targetVal){
                return i;
            }
        }
        return -1;
    }
}
