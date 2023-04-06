# Backend
<h1>ERD</h1>
<img width="80%" src="https://user-images.githubusercontent.com/67732143/229962846-0588dd71-43ca-48d5-8edc-aacfc34db833.png"/>

<h1>TDD</h1>
<h3>유저 API</h3>
<div>
1. 회원가입

- 속성 NULL 여부 테스트
- 패스워드 암호화
- 패스워드 재확인
</div>
<div>
2. 로그인

- 아이디, 패스워드 조회
- 패스워드 변경화
- 패스워드 오류
- 부모 페이지 로그인 확인 / 오류
</div>
<div>
3. 회원 정보 조회

- 조회
- 회원 정보 변경
- 삭제
- 연도 변경 시 나이 변경
- 빈 db 조회 예외 핸들링
</div>

<h3>단어 학습 API</h3>
<div>
1. 단어 학습

- 단어 학습(추가)
- 단어 학습 도중 포기(transaction)
</div>
<div>
2. 학습 단어 조회

- 날짜 정렬 확인
- 제공 난이도 정렬 확인
- 조회
- 빈 db 조회 예외 핸들링
</div>

<h3>학습 진척도 API</h3>
<div>
1. 분석 데이터 추가

- null 확인
</div>
<div>
2. 분석 데이터 조회

- 빈 db 조회 예외 핸들링
- 조회
</div>
<div>
3. 데이터 분석

- 성공률 분석
- word 테이블 빈 db 조회 예외 핸들링
- 성공률에 따른 레벨 설정
</div>

<h3>보상 API</h3>
<div>
1. 보상 정보 추가

- null 확인
</div>
<div>
2. 보상 정보 조회

- 빈 db 조회 예외 핸들링
- 조회
</div>
<div>
3. 보상 수여 계산

- 잔여 일수 계산
</div>