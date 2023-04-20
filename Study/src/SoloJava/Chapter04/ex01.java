package SoloJava.Chapter04;

public class ex01 {
    public static void main(String[] args) {

        Outter: for (int i=0;i<5;i++){  // for문에 라벨을 붙임 Outter라는 라벨
        for(int j=0;j<5;j++){}
            System.out.println(i+j);

            if(i+j==9){
                break Outter;           // 조건문이 맞다면 Outter라벨이 붙은 반복문까지 break
            }
        }

    }
}
