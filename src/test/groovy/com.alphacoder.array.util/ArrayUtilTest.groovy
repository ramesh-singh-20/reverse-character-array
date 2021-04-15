package com.alphacoder.array.util

import spock.lang.Specification

class ArrayUtilTest extends Specification{

    def 'Test ArrayUtil | reverseArray() | success case'(){
        given:
        def inputArr= new char[] {'p', 'e', 'r', 'f', 'e', 'c', 't', ' ', 'm', 'a', 'k', 'e', 's', ' ', 'p', 'r', 'a', 'c', 't', 'i', 'c', 'e' }

        when:
        def result= ArrayUtil.reverseArray(inputArr)

        then:
        result.length== inputArr.length

    }

    def 'Test ArrayUtil | reverseArray() | empty array'(){
        given:
        def inputArr= new char[] {}

        when:
        def result= ArrayUtil.reverseArray(inputArr)

        then:
        result.length== inputArr.length

    }

    def 'Test ArrayUtil | reverseArrayImplicitly() | success case'(){
        given:
        def inputArr= new char[] {'p', 'e', 'r', 'f', 'e', 'c', 't', ' ', 'm', 'a', 'k', 'e', 's', ' ', 'p', 'r', 'a', 'c', 't', 'i', 'c', 'e' }

        when:
        def result= ArrayUtil.reverseArrayImplicitly(inputArr)

        then:
        result.length== inputArr.length

    }

    def 'Test ArrayUtil | reverseArrayImplicitly() | empty array'(){
        given:
        def inputArr= new char[] {}

        when:
        def result= ArrayUtil.reverseArrayImplicitly(inputArr)

        then:
        result.length== inputArr.length

    }

    def 'Test ArrayUtil | reverseArray() | success case 1'(){
        given:
        def inputArr= new char[] {'I', ' ', 'L', 'O', 'V', 'E', ' ', 'C', 'O', 'D', 'I', 'N', 'G'}

        when:
        def result= ArrayUtil.reverseArray(inputArr)

        then:
        result.length== inputArr.length

    }

    def 'Test ArrayUtil | reverseArrayImplicitly() | success case 1'(){
        given:
        def inputArr= new char[] {'I', ' ', 'L', 'O', 'V', 'E', ' ', 'C', 'O', 'D', 'I', 'N', 'G'}

        when:
        def result= ArrayUtil.reverseArrayImplicitly(inputArr)

        then:
        result.length== inputArr.length

    }
}
