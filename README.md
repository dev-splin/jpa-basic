# :page_with_curl: 자바 ORM 표준 JPA 프로그래밍 - 기본편

 **[자바 ORM 표준 JPA 프로그래밍 - 기본편](https://www.inflearn.com/course/ORM-JPA-Basic/dashboard)**을 보며 제작한 JPA 프로젝트입니다.





## :hammer: 설치

1. jdk 17 - [링크 클릭](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
2. h2(실습용 데이터베이스) - [링크 클릭](https://h2database.com/)





## :airplane: 라이브러리 설정

### JPA 하이버네이트

```xml
<!-- JPA 하이버네이트 -->
        <dependency>
            <groupId>org.hibernate</groupId>
            <artifactId>hibernate-entitymanager</artifactId>
            <version>5.3.10.Final</version>
        </dependency>
```

#### ※ 하이버네이트 실행이 안될 때

하이버네이트 실행이 안된다면 아래의 설정을 추가해줍니다.

```xml
<!-- 하이버네이트 실행이 안될 때 넣어줌 -->
        <dependency>
            <groupId>javax.xml.bind</groupId>
            <artifactId>jaxb-api</artifactId>
            <version>2.3.0</version>
        </dependency>
```



### H2 데이터베이스

```xml
<!-- H2 데이터베이스 -->
        <dependency>
            <groupId>com.h2database</groupId>
            <artifactId>h2</artifactId>
            <version>2.1.214</version>
        </dependency>
```

