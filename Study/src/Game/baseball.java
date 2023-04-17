package Game;

import java.util.Random;
import java.util.Scanner;

public class baseball {
    public static void main(String[] args) {

        // 랜덤으로 뽑힌 수를 담을 각 자리별 변수 설정
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        // 볼 , 스트라이크 변수 설정
        int ball = 0;
        int strike = 0;

        // 숫자 야구를 만들어보자
        System.out.println("-------숫자 야구 게임을 시작합니다!!!!-------");
        // 컴퓨터가 내주는 숫자야구 문제 (3자리)
        // 랜덤 메서드를 사용해서 번호 3개를 뽑자(중복 제거, 첫자리는 0 없음)
        Random rd = new Random();

        // num1의 범위는 1~9
        num1 = rd.nextInt(1,9);

        // num2가 num1과 다를때까지 새로 뽑기
        while(true){
            num2 = rd.nextInt(9);
            if(num2!=num1) {
                break;
            }
        }
        // num3이 num1,num2와 다를때까지 새로 뽑기
        while(true) {
            num3 = rd.nextInt(9);
            if (num3 != num2 && num3 != num1) {
                break;
            }
        }
        // 숫자가 맞으면 볼, 자리까지 맞으면 스트라이크, 전부 맞으면 아웃을 출력
        // 스캐너 생성
        Scanner sc = new Scanner(System.in);
        System.out.println("정답을 맞춰보세요!");

        // 숫자 입력하기
        int answer = 0;
        int a = 0;
        int b = 0;
        int c = 0;

        while(true){
            answer = sc.nextInt();
            a = answer/100;
            b = answer%100/10;
            c = answer%10;
            if(answer<1000){
                if(a!=b&&b!=c&&c!=a){
                    if (a == num1||b == num2||c ==num3 ) {
                        strike++;
                    }else if (a == num1&&b == num2) {
                        strike+=2;
                    }else if(b == num2&&c == num3){
                        strike+=2;
                    }else if(a == num1&&c == num3) {
                        strike+=2;
                    }else if(a==num1&&b==num2&&c==num3){
                        strike+=3;
                    }

                    if(strike<3){
                        System.out.println(strike+"스트라이크 "+ ball +"볼!");

                    }else{
                        System.out.println("정답입니다");
                        break;
                    }
                }else{
                    System.out.println("각자 다른 수 3개를 입력해주세요!");
                }
            }else{
                System.out.println("세자릿수를 입력하세요!");
            }
        }



    }
}
