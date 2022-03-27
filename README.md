# algorithm-study
JAVA algorithm study 
## 알고리즘 공부법
* [박트리님의 공부법](https://baactree.tistory.com/52)

## 스터디 진행방식
### 온라인 스터디 
1. 수요일마다 공통유형 선정 및 문제 결정
  * EX) DP문제, 동적 프로그래밍 문제 
  
2. Github를 통한 코드 공유 및 피드백
    * [Feature Branch Workflow](https://gmlwjd9405.github.io/2017/10/27/how-to-collaborate-on-GitHub-1.html) 방식을 이용한다
    * 
* 개인이 할 일 (시험 실전 대비를 위해 시간 정해두고 문제풀기(최대 2시간))
    * 이론 정리
        * 동작 방식 / 시간 복잡도 / 장단점 / 비슷한 알고리즘 유형 / 대표적인 문제 소개 
    * 문제 풀이
        * 각자가 해당 범위에 대한 알고리즘 문제를 푼다.
        * 문제를 풀 때 발생한 **[issue]** 를 남긴 후 Readme에 기록한다.
            * issue: 추가로 공부하고 싶은 개념, 어려웠던 부분, 오류가 난 부분 등
            * 해당하는 문제에 대한 링크도 첨부한다.
        * 각자가 해당 코드의 좋은 예제를 찾아서 분석한다.
    * 공유 및 피드백
        1. 각자가 푼 문제에 대한 코드를 feature branch를 따서 github에 push한 후 pull request를 날린다.
        2. 상대방의 코드를 확인한 후 **[review]** 를 통해 피드백을 적는다.
        3. 피드백을 적은 후 해당하는 feature branch를 GUI(Github page)를 이용하여 merge한다.
    * 회고
        * 자신의 코드에 대한 피드백( **[review]** )을 확인한다.
        * 새로 업데이트된 코드를 pull받는다.
        * 좋은 풀이법 + 피드백을 이용하여 자신의 코드를 재점검한다.
        * 관련된 알고리즘 풀이법에 대해 복습한다. 
        * 자신의 코드를 수정하여 다시 push한다.
* 스터디 모임에서 할 일
    * 이론 정리 공유
    * 문제 풀이 피드백 확인
        * 문제를 풀 때 발생한 **[issue]** 에 대해 논의하여 Readme에 정리한다.
    * 좋은 코드에 대한 분석 공유

## Git 저장소 이용하는 방법

- 저장소 : https://github.com/JAVA-codingTest/algorithm-study

### 폴더 설명

- docs: 공동폴더. 이론 이외의 문서를 업로드하는 폴더
- source: 개인 폴더. 필요한 개인폴더를 생성하고 알고리즘 풀이를 업로드하는 폴더

<br>

### GitBash 명령어 사용 방법

- [원격저장소의 브랜치를 생성하는 방법](https://github.com/TheCopiens/algorithm-study/blob/master/docs/github/howToCreate_branch.md#%EC%9B%90%EA%B2%A9%EC%A0%80%EC%9E%A5%EC%86%8C%EC%9D%98-%EB%B8%8C%EB%9E%9C%EC%B9%98%EB%A5%BC-%EC%83%9D%EC%84%B1%ED%95%98%EB%8A%94-%EB%B0%A9%EB%B2%95)
- [원격저장소의 브랜치를 로컬로 가져오는 방법](https://github.com/TheCopiens/algorithm-study/blob/master/docs/github/bring_remote_branch.md)
- [fork한 저장소 최신으로 동기화하는 방법](https://github.com/TheCopiens/algorithm-study/blob/master/docs/github/update_forkedRepo_from_originRepo.md#fork-%ED%95%9C-repository-%EC%B5%9C%EC%8B%A0%EC%9C%BC%EB%A1%9C-%EB%8F%99%EA%B8%B0%ED%99%94-%ED%95%98%EB%8A%94-%EB%B0%A9%EB%B2%95)

#### 원격저장소 로컬에 가져오기

<code> git clone https://github.com/JAVA-codingTest/algorithm-study.git </code>

#### 로컬에서 개인 브랜치 생성하기

local workspace에 'ohhako'라는 이름으로 브랜치 생성<br>
<code> git branch ohhako </code>

#### 로컬에서 브랜치 작업후 원격저장소에 반영하기

로컬 브랜치가 있는 폴더에서 개인작업을 마친 후 공동 저장소에 반영한다.

1. <code> **git checkout ohhako** </code> - master에서 ohhako 브랜치로 전환
2. workspace에서 작업
3. <code> **git commit -m "message"**</code>
4. <code> **git push origin ohhako** </code> - 원격저장소 ohhako 브랜치에 반영
5. <code> **git checkout master** </code> - 브랜치 전환
6. <code> **git pull** </code> - 원격저장소 master의 최신 정보를 로컬에 업데이트 시키기
7. <code> **git merge ohhako** </code> - master에 ohhako 브랜치 작업 반영
8. <code> **git push origin master** </code> - 원격저장소 master에 반영

## <br><br>
---

### 이 글은 아래 사이트를 참고해 작성되었습니다.

- [알고리즘스터디](https://github.com/TheCopiens/algorithm-study)
- [알고리즘 공부법](https://gmlwjd9405.github.io/2018/05/14/how-to-study-algorithms.html) <br>
- [wearsoft/algorithm-study](https://github.com/WeareSoft/algorithm-study)
- [알고리즘 공부 어떻게 해야하나](https://baactree.tistory.com/52)
