package com.jackson.headfirst.adaptor;

public class TurkeyAdaptor implements Duck{
    // 적응 시킬 형식의 인터페이스 구현
    // 클라이언트에서 원하는 인터페이스 구현

    Turkey turkey;

    public TurkeyAdaptor(Turkey turkey) {
        // 기존 형식의 레퍼런스
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        // Turkey의 Fly는 기존 Fly에 비해 거리가 짧기 때문에 5번 실행
        // 이처럼 클라이언트에서 원하는 형식으로 로직을 바꿔서 구현해줄 수 있다.
        for(int i = 0; i < 5; i++){
            turkey.fly();
        }
    }
}
