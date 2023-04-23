package SoloJava.Chapter06;

public class CarExample {
    public static void main(String[] args) {

        // 객체 생성
        Car myCar = new Car();

        System.out.println(myCar.color);
        System.out.println(myCar.name);
        System.out.println(myCar.speed);


        myCar.speedUp();

        System.out.println(myCar.speed);



        MemberVO member = new MemberVO("answer","123","김대웅",31);

        System.out.println(member.toString());


    }
}
