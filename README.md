# 자동차 경주 기능

## [기능 구현]

## 자동차 클래스 구현
params : 자동차 이름, 자동차 위치
1) 난수를 생성한다.
2) 난수에 따라 이동여부를 결정하는 로직을 만든다.
3) 이동여부에 따라 자동차의 위치를 갱신한다.

## 게임 클래스 구현
params: 자동차들, 진행 횟수
1) 자동차를 생성한다.
2) 진행 횟수만큼 라운드 진행 로직에 따라 자동차의 상태를 갱신한다.
3) 2)가 완료 되면 우승 결정 로직에 따라 우승 자동차를 결정한다.

## 입출력 구현
1) 사용자에게 입력 메시지를 출력한다.
2) 사용자가 입력한 값을 받는다.
3) 입력된 인자를 파싱하여 게임 클래스로 넘긴다.
4) 매 라운드마다 게임 클래스에서 받은 진행 상태를 출력한다.
5) 모든 라운드가 진행되면 게임 클래스에서 받은 우승 차량을 출력한다.


## [단위 테스트 구현]

1) 자동차의 최종 위치에 따라 우승 차량을 올바르게 결정하였는지 확인한다.
2) 사용자가 입력한 자동차 이름을 올바르게 파싱하였는지 확인한다.
3) 난수로 생성된 값에 따라 진행값이 0,1로 올바르게 분류되었는지 확인한다.
4) 진행값에 따라 자동차의 위치가 올바르게 갱신되었는지 확인한다.
