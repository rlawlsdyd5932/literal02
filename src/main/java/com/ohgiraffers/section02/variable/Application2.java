package com.ohgiraffers.section02.variable;

public class Application2 {

    public static void main(String[] args) {

        /* 수업목표. 변수를 선언하고 값을 할당하여 사용할 수 있다. */
        /* 필기. 변수를 사용하는 방법
        *   1. 변수를 준비한다.(선언)
        *   2. 변수에 값을 대입한다.(값 대입 및 초기화)
        *   3. 변수를 사용한다.
        * */

        // 1. 변수를 준비한다.(선언)
        // 자료형 변수명;

        /* 필기
        *  자료형이란?
        *  다양한 값의 형태별로 어느 정도의 크기를 하나의 값으로 취급할 것인지 미리 Compiler와 약속한 키워드이다.
        *  예) 앞에서 사용한 int 자료형은 정수를 4byte만큼을 읽어서 하나의 값으로 취급하겠다는 약속이다.
        *      이러한 자료형은 기본자료형(Primary type)과 참조자료형(Reference type)으로 나누어진다.
        *  그 중 기본자료형 8가지부터 살펴보기로 한다.
        * */

        // 숫자를 취급하는 자료형
        // 정수를 취급하는 자료형 4가지가 있다.
        byte bnum;  //1byte
        short snum; //2byte
        int inum;   //4byte
        long lnum;  //8byte

        // 실수를 취급하는 자료형 2가지가 있다.
        float fnum ;    //4byte
        double dnum;    //8byte

        // 문자를 취급하는 자료형
        // 문자를 취급하는 자료형은 1가지가 있다.
        char ch;    //2byte

        // 논리값을 취급하는 자료형
        boolean isTrue; //1byte

        // 문자열을 취급하는 자료형
        String str;     //4byte


        /* 대입 연산자의 실행 방향은 오른쪽에서 왼쪽이다.
        *  즉, 오른쪽에 있는 값을 왼쪽의 공간에 대입한다는 의미이며, 왼쪽에는 항상 공간, 오른쪽에는 항상 값이 온다.
        *  변수를 대입연산자 왼쪽에 사용하면 공간의 의미이고, 대입연산자 오른쪽에 사용하면 변수가 가진 값을 의미한다.
        * */





    }
}
