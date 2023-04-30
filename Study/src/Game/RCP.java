package Game;

import java.util.Random;
import java.util.Scanner;

public class RCP {
    public static void main(String[] args) {

        // 가위 바위 보 게임
        // 랜덤으로 상대 편의 가위 바위 보가 나옴
        // 3초 안에 승리할 수 있는 답을 적지 않으면 게임 종료
        // 계속 이기면 점수 누적

        // 준비물
        // 랜덤함수가 필요 : 3가지 확률
        Random rd = new Random();
        // 상대의 가위 바위 보
        int rcp = rd.nextInt(3);
        String com = "";
        if(rcp==0) com = "가위";
        else if(rcp==1) com = "바위";
        else com = "보";
        // 정답 입력용 스캐너
        Scanner sc = new Scanner(System.in);
        // DB 연결은 하지 않으므로 2인용으로 만들어서 점수 비교
        // 정답 입력 타이머 : 3초가 넘어가면 게임 종료
        double start_player1 = 0;
        double strat_player2 = 0;
        double end_player1 = 0;
        double end_player2 = 0;

        double time_player2 = (end_player2 - strat_player2)*0.001;
        // 점수
        int score1 = 0;
        int score2 = 0;


        // 게임 시작
        System.out.println("게임을 시작합니다");
        System.out.print("Player1님의 이름을 적어주세요 : ");
        String player1 = sc.next();

        while(true) {
            sc.nextLine();
            System.out.println(com);
            start_player1 = System.currentTimeMillis();
            String answer = sc.next();
            end_player1 = System.currentTimeMillis();
            double time_plyaer1 = (end_player1 - start_player1)*0.001;
            if(time_plyaer1>3){
                System.out.println("시간이 초과되었습니다!!!");
                break;
            }


        }
    }
}
