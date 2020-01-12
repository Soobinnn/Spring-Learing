# Eat Go Project
패스트캠퍼스 온라인 강의 아샬님 예제 따라 하기

# 요구사항 작성방법

## 무엇이 문제인가? - 불편함
분야 - Domain
올바른 문제 찾기

##사용자 스토리
- 사용자 입장에서 기능을 서술
(사용자)는 (가치)를 위해 (기능)을 할 수 있다.

### 사용자는 누구인가?
고객, 가게, 관리자

### 사용자 스토리 예제
ex) 고객은 뭘 먹고 싶은지 발견할 수 있도록 가게 목록을 볼 수 있다.

고객은 정확히 먹고 싶은 게 뭔지 확인하기 위해 가게의 메뉴를 볼 수 있다.

고객은 좋은 가게인지 알 수 있도록 평점을 확인할 수 있다.

고객은 선택의 폭을 좁히기 위해 가게 목록을 분류에 따라 볼 수 있다.

고객은 나와 남을 위해 가게에 평점과 리뷰를 남길 수 있다.

고객은 나중에 찾아보기 쉽도록 가게를 즐겨찾기에 추가할 수 있다.

고객은 가게에서 기다리지 않기 위해 가게에 인원, 메뉴를 예약할 수 있다.

가게는 관심 있는 고개을 받기 위해 예약 요청을 볼 수 있다.

가게는 더 나은 서비스를 위해 예약 요청에 응답할 수 있다.

관리자는 고객이 서비스를 쓸 수 있도록 가게 정보를 등록할 수 있다.

## 요구사항 변경은 반복된다.
## 계획을 세우자

## 어떻게 만들것 인가? 
### 도메인 모델링
Restaurant
Menu Item
Food&Beverages
User
Favorite
Review
Reservation

### 시스템 아키텍처
-제약조건
다른 부분
공통 부분

#### 3-tier rchitecture
Presentation - Business - Data Source

#### Backend Architecture 
Layered Architecture 
- UI Layer (Controller)
- Application Layer
- Domain Layer (Repository)
- Infrastructure Layer

## 기술 스택
Java
Spring Boot
REST API


------
# 프로젝트 생성
boot 시작하기
start.spring.io

__dependency__
- Spring Web
- Spring Boot DevTools
- Lombok

## Multi Part Project 생성방법
1. 폴더 생성 - src, build.gradle 넣음. 
2. settings.gradle 에 include '폴더명' 추가

# 테스트 주도개발
- 목표 주도 개발, 사용자 중심 개발, 인터페이스 중심 개발

올바르게 작동 - 깔끔한 코드

## TDD Cycle
1. Red - Test
2. Green - Success
3. Refactoring


## Rest API (REpresentational State Transfer)

-
URI (Uniform Resource Identifier)
URL (Uniform Resource Location)

Collection : Read, Create
Member : Read(Detail), update, delete


## 의존성 (Dependency)
A는 B를 사용 -> A는 B에 의존

B의 변화가 A에 영향

ex) Controller는 Repository에 의존
1. Repository 생성
2. Controller에 Repository를 연결

### Spirng IoC Container
의존관계를 자동으로 연결해줌
- @Component
- @Autowired

\* 의존관계를 사용할 때는 Test Case에 __@SpyBean__ 을 추가해줘야함 
