# 멀티스레드 동기화
## 요구 사항
- 하나의 공유 변수 count를 사용하여 숫자를 저장합니다.

- 3개의 스레드가 동시에 count++ 연산을 1000번씩 수행합니다.

- 각 스레드는 자신이 작업을 시작하고 끝냈을 때 메시지를 출력합니다.

- 모든 스레드가 작업을 마친 후, 최종 count 값을 출력합니다.

- 동기화 처리 전/후 두 가지 버전으로 만들어보고, 값의 차이를 확인하세요.

## 🔧 구현 조건
- Thread 클래스를 상속하거나 Runnable 인터페이스를 구현하세요.

- synchronized 키워드를 사용하여 공유 자원 보호를 구현해 보세요.

- 동기화 처리를 하지 않으면 race condition(경쟁 상태)가 발생합니다.

## 🧪 추가 확장 아이디어 (선택)
- ReentrantLock을 사용해서 synchronized 없이 동기화를 해보세요.

- 각 스레드의 이름을 설정해서 로그를 더 보기 쉽게 만들어보세요.

- ExecutorService를 사용해 스레드를 풀에서 관리하게 확장해도 좋습니다.

## 📌 예상 출력 (예시)
```
[Thread-A] started
[Thread-B] started
[Thread-C] started
[Thread-B] finished
[Thread-A] finished
[Thread-C] finished
Final count: 3000
```
- 동기화를 하지 않았다면 Final count가 3000보다 작을 수도 있습니다!