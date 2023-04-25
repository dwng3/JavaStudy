package SoloJava.Chapter13;

import java.util.Iterator;

public class SetCollection {

    // Set 컬렉션 메소드

    // List 컬렉션과 비슷하다

    boolean isEmpty()                   // 컬렉션이 비어 있는지 조사함
    Iterator<E> iterator()              // 저장된 객체를 한 번씩 가져오는 반복자를 리턴함.


    // Set 컬렉션은 인덱스로 객체를 검색해서 가져오는 메소드가 없음
    // 대신, 전체 객체를 대상으로 한 번씩 반복해서 가져오는 반복자를 제공함.

    // Iterator 인터페이스에 선언된 메소드

    boolean hasNext()                   // 가져올 객체가 있으면 true를 리턴하고 없으면 false를 리턴함
    E Next()                            // 컬렉션에서 하하늬 객체를 가져옴
    void remove()                       // Set 컬렉션에서 하나의 객체를 제거함


    // HashSet

    Set<E> set = new HashSet<>();

    // HashSet은 객체들을 순서 없이 저장하고 동일한 객체는 중복 저장하지 않음.
    // 동일한 객체란 꼭 같은 인스턴스는 뜻하지 않음.

}
