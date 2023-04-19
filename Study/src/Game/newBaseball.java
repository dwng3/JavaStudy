package Game;

import java.util.Random;
import java.util.Scanner;

public class newBaseball {
    public static void main(String[] args) {

        int[] answer = new int[3];
        int[] input = new int[3];
        int strike = 0;
        int ball = 0;

        Random rd = new Random();
        for(int i=0;i<answer.length;i++){
            answer[i] = rd.nextInt(0,9);
            for(int j=0;j<i;j++){
                if(answer[i]==answer[j]){
                    // 배열에 중복값이 있으면 다시 뽑기
                    i--;
                    break;
                }
            }
        }

        // 랜덤으로 뽑혔는지 확인
        for(int x : answer){
            System.out.println("뽑힌 숫자 : " + x);
        }

        // 게임 시작.
        System.out.println("야구 게임을 시작합니다!!");

        // 스캐너
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("답을 맞춰보세요");
            // 입력된 숫자를 input배열에 담음
            int dap = sc.nextInt();
            input[0] = dap / 100;
            input[1] = dap % 100 / 10;
            input[2] = dap % 10;

            for(int i=0;i<answer.length;i++){
                for(int j=0;j<input.length;j++){
                    if(answer[i]==input[j]&&i!=j){
                        ball++;
                    } else if(answer[i]==input[j]&&i==j) {
                        strike++;
                    }
                }
            }
            if(strike==3){
                System.out.println("정답입니다");
                break;
            }else{
                System.out.println(strike+"스트라이크 "+ball+"볼");
                strike = 0;
                ball = 0;
            }

        }



    }
}
