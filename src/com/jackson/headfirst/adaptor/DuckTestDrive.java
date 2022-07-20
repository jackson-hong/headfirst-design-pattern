package com.jackson.headfirst.adaptor;

public class DuckTestDrive {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();

        Turkey turkey = new WildTurkey();
        Duck turkeyAdaptor = new TurkeyAdaptor(turkey);

        turkey.gobble();
        turkey.fly();

        testDuck(duck);

        testDuck(turkeyAdaptor);
    }

    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
