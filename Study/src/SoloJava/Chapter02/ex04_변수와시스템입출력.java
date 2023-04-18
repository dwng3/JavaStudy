package SoloJava.Chapter02;

import java.io.IOException;
import java.util.Scanner;

public class ex04_변수와시스템입출력 {
    public static void main(String[] args) throws IOException {
        // 1. 모니터로 변수값 출력하기
        // printf("형식문자열",값1, 값2, ....);    괄호 안의 첫 번째 문자열 형식대로 내용을 출력해라
        System.out.printf("이름: %s", "김자바");

        // 형식 문자열에 포함될 값이 2개 이상일 경우 순번을 알려줘야함
        System.out.printf("이름: %1s, 나이: %2d", "김자바", 25);

        // 정수 %d
        // 문자열 %s

        // 2. 키보드에서 입력된 내용을 변수에 저장하기

        int keyCode;
        keyCode = System.in.read();
        System.out.println(keyCode);

        // System.in.read()의 단점은 키코드를 하나씩 읽기 때문에 2개 이상의 키가 조합된 한글을 읽을 수 없음.
        // 단점을 보완하기위해 Scanner 클래스를 제공함.
        Scanner sc = new Scanner(System.in);
        String inputData = sc.nextLine(); // 엔터키 이전까지 입력된 문자열을 읽음
    }
}
