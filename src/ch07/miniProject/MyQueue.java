package ch07.miniProject;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

interface Queue {
    int dequeue();
    void enqueue(int item);
    boolean isEmpty();
}

public class MyQueue implements Queue {
    private int[] array;
    private int front;
    private int rear;
    private int size;
    
    public MyQueue() {
        array = new int[5]; // 고정 크기 5
        front = 0;
        rear = -1;
        size = 0;
    }

    @Override
    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        int item = array[front];
        front = (front + 1) % array.length; // front를 한 칸 앞으로 이동
        size--;
        return item; // 삭제된 항목 반환
    }

    @Override
    public void enqueue(int item) {
        if (size == array.length) {
            throw new RuntimeException("Queue is full"); // 큐가 가득 찼을 때 예외 발생
        }
        rear = (rear + 1) % array.length; // rear를 한 칸 앞으로 이동
        array[rear] = item; // 새로운 아이템 추가
        size++;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        MyQueue q = new MyQueue();
        
        // 초기 값 추가
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);

        // 첫 번째 dequeue
        bw.write("Dequeue: " + q.dequeue() + "\n"); // 1 출력
        
        // 새로운 값 추가
        q.enqueue(6); // 1이 삭제된 후, 6을 추가
        
        // 현재 큐의 상태 출력
        bw.write("Dequeue: " + q.dequeue() + "\n"); // 2 출력
        bw.write("Dequeue: " + q.dequeue() + "\n"); // 3 출력
        bw.write("Dequeue: " + q.dequeue() + "\n"); // 4 출력
        bw.write("Dequeue: " + q.dequeue() + "\n"); // 5 출력
        
        // 마지막으로 6을 제거
        bw.write("Dequeue: " + q.dequeue() + "\n"); // 6 출력

        // 큐가 비어 있는지 확인
        bw.write("Is queue empty? " + q.isEmpty() + "\n"); // true 출력
        
        bw.flush();
        bw.close();
    }
}
