package com.alphacoder.array.util;

import java.util.Stack;

public class ArrayUtil {
    public static char[] reverseArray(char[] inputArray){
        char[] reverseArr= new char[inputArray.length];
        Stack<Character> stack1= new Stack<>();
        Stack<Character> stack2= new Stack<>();
        for(int i=0; i< inputArray.length; i++){
            if(!(inputArray[i]==' ')) {
                stack1.push(inputArray[i]);
                if(i!=inputArray.length-1) {
                    continue;
                }
            }
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
            if(inputArray[i]==' ') {
                stack2.push(inputArray[i]);
            }

        }

        int i=0;
        while(!stack2.isEmpty()){
            reverseArr[i]= stack2.pop();
            i++;
        }
        System.out.println(reverseArr);
        return reverseArr;
    }
}
