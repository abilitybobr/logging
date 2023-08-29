# logging
Spring Boot Logging 샘플 코드

사용 버전

JAVA 17

Spring Boot 3.1

Gradle 9.0

Spring Boot 기본구성에 로그를 출력 할수 있는
기본 코드만 작성 되어 있습니다.

logback-spring.xml파일을 이용하여 log가 출력 되는 과정을 알고 싶으면

해당 소스 코드를 참조 하시면 됩니다.

별도 서버 환경설정을 안하면 dev환경으로 세팅되어 로그가 출력 됩니다.

Active profiles에 "prod"로 세팅하게 되면
콘솔로그 와 파일 로그가 적재되는것을 확인 할 수 있습니다.