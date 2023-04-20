package Game;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TimeGame {
    public static void main(String[] args) {

        // 첫번째 유저의 값
        long start_user1 = 0;
        long end_user1 = 0;
        double result_user1 = 0;

        // 두번째 유저의 값
        long start_user2 = 0;
        long end_user2 = 0;
        double result_user2 = 0;

        // 입력 받을 스캐너
        Scanner sc = new Scanner(System.in);

        // 첫번쨰 유저
        System.out.print("첫번째 유저의 닉네임을 입력해주세요 >>");
        String name_user1 = sc.next();
        System.out.println(name_user1 + "님 시작하려면 <Enter>를 눌러 주세요");
        sc.nextLine();
        sc.nextLine();
        start_user1 = System.currentTimeMillis();

        System.out.println("10초가 된 것 같으면 <Enter>키를 눌러주세요");
        sc.nextLine();
        end_user1 = System.currentTimeMillis();

        result_user1 = (double) (end_user1 - start_user1)*0.001;

        System.out.println(name_user1+"님의 시간은 "+result_user1+"초 입니다");

        // 두번째 유저
        System.out.print("두번째 유저의 닉네임을 입력해주세요 >>");
        String name_user2 = sc.next();
        System.out.println(name_user2 + "님 시작하려면 <Enter>를 눌러 주세요");
        sc.nextLine();
        sc.nextLine();
        start_user2 = System.currentTimeMillis();

        System.out.println("10초가 된 것 같으면 <Enter>키를 눌러주세요");
        sc.nextLine();
        end_user2 = System.currentTimeMillis();

        result_user2 = (double) (end_user2 - start_user2)*0.001;

        System.out.println(name_user2+"님의 시간은 "+result_user2+"초 입니다");

        sc.nextLine();

        System.out.println("==========점수판===========");
        System.out.println(name_user1+" : " +result_user1);
        System.out.println(name_user2+" : " +result_user2);

        double abs_user1 = Math.abs(10-result_user1);
        double abs_user2 = Math.abs(10-result_user2);

        if(abs_user1<abs_user2){
            System.out.println("승자는 "+name_user1+"님 입니다.");
        }else if(abs_user1==abs_user2){
            System.out.println("비겼습니다");
        }else{
            System.out.println("승자는 "+name_user2+"님 입니다.");
        }



    }
}
