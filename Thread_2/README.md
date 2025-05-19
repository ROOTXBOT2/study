# 두 개의 스레드 동시 실행 (Runnable 사용)
## 🎯 목표
- Runnable을 구현한 두 개의 클래스 생성

- 하나는 "apple"를, 하나는 "banana"를 0.7초 간격으로 각각 5번 출력

- 두 스레드가 동시에 실행되도록 Thread 객체 2개 생성 및 시작

## 요구 조건
- ApplePrinter, BananaPrinter 클래스는 Runnable 구현

- Thread.sleep(700) 사용

- 두 스레드가 번갈아 가며 실행되는 것처럼 출력될 수 있음


```
<출력 (순서는 다를 수 있음)>

apple
banana
apple
banana
...
```