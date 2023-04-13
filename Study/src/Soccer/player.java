package Soccer;

public class player extends member{
    // 필드
    String position;

    // 생성자
    player(String leg, int age, String position){
        this.leg = leg;
        this.age = age;
        this.position = position;
    }

    // 메소드
    void myposition(){
        System.out.println("제 포지션은"+position+"입니다");
    }


}
