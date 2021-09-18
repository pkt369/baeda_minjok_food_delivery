### 배달의 민족 클론 프로젝트

------

배달의 민족 앱을 웹으로 클론 코딩하는 프로젝트입니다. 



### 사용 기술

------

- 스프링 (Spring)
- Mysql
- hibernate (JPA)
- AWS (서버)
- Jenkins



### git-flow 브랜치 전략

------

git-flow 브랜치 전략으로 브랜치를 나누어 관리를 하고 있습니다.

![gitflow](https://user-images.githubusercontent.com/66049273/133890936-f61d02ef-37ac-4fa4-bd0d-bb54293d98e2.png)

##### 실제 쓰는 브랜치

- develop : 다음 버전 출시를 위해 개발한 브랜치들을 모으는 브랜치입니다.
- feature : 기능을 개발하는 브랜치입니다.
- release : 개발한 브랜치들을 출시 전에 한번 더 확인하는 브랜치입니다.
- master : 개발한 브랜치를 제품으로 출시한 브랜치입니다.
- hotfix : 제품으로 출시한 버전에서 버그 발생시 바로 대처할 수 있는 브랜치입니다.

Reference) [우아한 형제들 git-flow](https://techblog.woowahan.com/2553/)







### 데이터 베이스 설계

------

![baedal_minjok](https://user-images.githubusercontent.com/66049273/133890415-39f19842-b626-42fc-95cd-911caaa78c26.png)





### Jenkins CI/CD

------

빌드와 테스트 자동화를 위해 젠킨스를 이용하고 있으며, http://18.116.103.93:9090 에서 젠킨스를 관리하고 있습니다.
