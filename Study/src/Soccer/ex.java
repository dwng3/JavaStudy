package Soccer;

public class ex {
    public static void main(String[] args) {

        // 객체 생성
        player player = new player("left",30,"CM");

        // 출필드
        System.out.println(player.leg);
        System.out.println(player.age);
        System.out.println(player.position);

        // 메소드 호출
        player.myleg();
        player.myage();
        player.myposition();
    }
}
