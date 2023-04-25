package SoloJava.Chapter13;

import java.util.Collection;

public class MapCollection {

    // Map 컬렉션은 키와 값으로 구성된 객체를 저장하는 구조를 가지고 있음

    V put(K key,V value)                // 주어진 키로 값을 저장함. 새로운 키일 경우 null을 리턴하고 동일한 키가 있을 경우 값을 대체하고 이전 값을 리턴함
    boolean containsKey(Object key)     // 주어진 키가 있는지 여부를 확인함
    boolean containsValue(Object value) // 주어진 값이 있는지 여부를 확인함

    Set<Map.Entry<K,V>>entrySet()       // 키와 값의 쌍으로 구성된 모든 Map.Entry 객체를 Set에 담아서 리턴합니다
    V get(Object key)                   // 주어진 키가 있는 값을 리턴함
    boolean isEmpty()                   // 컬렉션이 비어 있는지 여부를 확인함

    Set<K> keySet()                     // 모든 키를 Set 객체에 담아서 리턴함
    Collection<V> values()              // 저장된 모든 값을 Collection에 담아서 리턴함



}
