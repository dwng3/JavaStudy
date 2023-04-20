package SoloJava.Chapter05;

public class ex01 {
    public static void main(String[] args) {

        int[] oldIntArray = {1,2,3};
        int[] newIntArray = new int[5];

        System.arraycopy(oldIntArray,0,newIntArray,0,oldIntArray.length); // 배열 복제
        //              복제할 배열      시작인덱스  복제된배열      시작인덱스     길이

        for(int i=0;i< newIntArray.length;i++){
            System.out.println(newIntArray[i]);
        }

    }
}
