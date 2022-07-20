package com.jackson.headfirst.facade;

/*
* 퍼사드 패턴은 서브시스템에 있는 일련의 인터페이스를 통합 인터페이스로 묶어준다.
* 또한 고수준 인터페이스도 정의하므로 서브시스템을 편리하게 사용 가능
*
* 최소 지식 원칙
* : 진짜 절친에게만 이야기 해야 한다.
* : 어떤 객체든 그 객체와 상호작용을 하는 클래스의 개수와 상호작용 방식에 주의를 기울여야 한다.
* : 여러 클래스가 서로 복잡하게 의존하고 있으면 관리하기 힘들고 이해하기 어려운 불안정한 시스템이 만들어진다.
* */