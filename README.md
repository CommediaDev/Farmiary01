
# Farmiary
## 농부들을 위한 커뮤니티 및 판매 홈페이지입니다.

    자신이 키우는 작물에 대해 작물일기를 작성하거나
    농사 관련 이야기를 여러 사람들과 공유할 수 있는
    사이트이며 작물 판매도 가능합니다.

    농사 지식이 부족한 젊은 농부들에게 자신의 노하우 공유,
    점차 줄어들는 농사꾼을 위하여 제작되었습니다.

</br>

## 1.제작 기간 & 참여 인원
- 2022년 11월 1일 ~ 11월 6일
- 팀프로젝트 / 4명
### 신원희(팀장) - 관리자 페이지 제작
- 권한 설정
- 회원 수정, 삭제
  - 일정관리

### 이우영 - 블로그 페이지 제작
- 연관관계 매핑
- 블로그 CRUD
  - 시큐리티

### 윤미혜 - 회원 페이지, 기획 및 제작
- 회원가입 기능
- 로그인 기능
  - 카카오톡 로그인 API
  - 화면 CSS 구현 
### 홍성훈 - 쇼핑몰 페이지 
- 상품 등록
- 쿼리문 작성
  - 형상관리
  - 환경설정

### 공통
- 장바구니

</br>

## 2.사용 기술
- Java 11
- Spring Boot 2.7
- Maven
- Spring Data JPA
- QueryDSL
- H2
- MySQL 5.7
- Spring Security
- Thymeleaf

</br>

## 3.ERD 설계
![ERD](https://user-images.githubusercontent.com/64462106/200100548-79fbc8b2-6e86-40c3-8dcd-4962e9553b2e.png)




## 4.핵심 기능
* 블로그 게시판 
* 회원가입, 회원정보, 관리자 로그인
* 상품 등록, 상품 목록, 장바구니
<details>
<summary><b>핵심 기능 설명 펼치기</b></summary>
<div markdown="1">       

### 4.1 전체 흐름

### 4.2 사용자 요청
- **로그인 비밀번호 확인** :pushpin: [코드 확인](https://github.com/CommediaDev/Farmiary01/blob/3014439b069722719e2a5725d87f3a40d2c48e5b/src/main/java/com/shop/config/SecurityConfig.java)
  - 회원정보 수정 시 한번더 아이디와 비밀번호 확인
  - mathces()를 이용하여 boolean 형태로 리턴 받음

### 4.3 Controller
- d

### 4.4 Service


### 4.5 Repository


</div>
</details>

## 5.핵심 트러블 슈팅
<details>
<summary>지연 로딩을 통해서 쿼리문이 필요할 때만 실행되도록 최적화</summary>
- 성능 저하는 데이터를 저장하거나 수정할 때 일어나기보다는, 데이터를 조회 할 때 일어남

![엔티티 지연 로딩]()
<div markdown="1"> 
</div>
</details>

## 6.그 외 이슈사항
<details>
<summary>QDomain 임포트 문제</summary>
src/main/generated 라는 폴덩 아래에 존재하는 Q domain들의 위치를 못찾는 현상이 발생

- File > Project Structure > Modules에 들어가서 main 아래의 generated 폴더에 마우스 우측클릭을하고 Sources 를 체크
- maven의 경우 추가한 dependency의 version을 명시하지 않은 채로 reload를 진행한 뒤 compile을 진행하면 해결
- maven - Lifecycle - clean(오른쪽 마우스-Run Build) - 다시 compile 더블 클릭
<div markdown="1"> 
</div>
</details>
<br>
<details>
<summary></summary>

<div markdown="1"> 
</div>
</details>
