package SoloJava.Chapter13;

public class LIFO_FIFO {

    // LIFO : Last In First Out

    // Stack

    E push(E item)      // 주어진 객체를 스택에 넣음
    E peek()            // 스택의 맨 위 객체를 가져옴. 객체를 스택에서 제거하지 않음.
    E pop()             // 스택의 맨 위 객체를 가져옴. 객체를 스택에서 제거함.

    // FIFO : First In First Out

    // Queue

    boolean offer(E e)  // 주어진 객체를 넣음
    E peek()            // 객체 하나를 가져옴. 객체를 큐에서 제거하지 않음
    E poll()            // 객체 하나를 가져옴. 객체를 큐에서 제거함

}
