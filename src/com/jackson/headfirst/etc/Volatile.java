package com.jackson.headfirst.etc;

public class Volatile {

    // 가시성 : 값을 사용한 다음 동기화 블록을 빠져나가고 나면 다른 쓰레드가 변경 된 값을 즉시 사용할 수 있게 해야 함
    // Visibility

    private static boolean stopRequested;

    public static void main(String[] args) throws InterruptedException {
        Thread backgroundThread = new Thread(() -> {
            int i = 0;
            while (!stopRequested) {
                System.out.println(i);
                i++;
            }
        });
        backgroundThread.start();

        Thread.sleep(1000);
        stopRequested = true;
    }
}
