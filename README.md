# 서비스 소개

## 1. 서비스 설명

**개요**

- 한줄소개 : 현재 사람이 살수 없게 되고 있는 지구를 생명이 살기 좋은 환경으로 만드는 정보 및 서비스 제공
- 서비스명 : **지라포밍**

**타켓**🎯

- 환경에 관심이 없는 사람들
- 환경을 보호하고 환경 정보를 얻고 싶은 사람들

👉 **팀 빌딩이 필요한 모든 사람들**

## 2. 기획 배경

### 배경

현재 많은 환경오염 오염 문제는 심각하지만 많은 사람들이 현재 환경 상황 얼마나 심각한지 인식하지 못하고 인식을 했다고 하더라도 환경보호 활동을 많이 하고 있지 않음.

### 목적🥅

저희는 환경보호의 필요성을 알려주기 위해서 사람들에게 심각한 환경 문제에 대한 정보 제공하여 경각심을 주고 환경보호를 위한 활동을 제시 및 장려를 하기 위해 이 프로젝트를 기획.

### 의의

- 메인 페이지에서 다양한 환경 오염 문제 정보 제공.
- 환경 퀴즈, 별보러 갈래 캠페인, 자신만의 환경유형 등 다양한 서비스를 통해서 많은 유저들 접근가능.

## 3. 서비스 화면

**시연 순서**

메인페이지 => 로그인 => 환경스타일분석 => 환경퀴즈풀기=> 별보러갈래=> 마이페이지 => 환경뉴스 

메인페이지(스크롤을 통해서 환경 오염 정보 제공)

![image-20221007104202716](README.assets/image-20221007104202716.png)

![image-20221007104241838](README.assets/image-20221007104241838.png)

![image-20221007104545704](README.assets/image-20221007104545704.png)

![image-20221007104601583](README.assets/image-20221007104601583.png)

2. 로그인(네이버, 카카오, 구글 Oauth)

![image-20221007105448074](README.assets/image-20221007105448074.png)

3. 환경스타일분석(자신만의 환경 스타일을 얻을 수 있고, 스타일에 맞는 캠페인도 추천. 또한 SNS에 공유 또한 가능)

![image-20221007105734402](README.assets/image-20221007105734402.png)

![image-20221007105741619](README.assets/image-20221007105741619.png)

![image-20221007105834888](README.assets/image-20221007105834888.png)

![image-20221007105900329](README.assets/image-20221007105900329.png)

4. 환경퀴즈 풀기(자신의 환경 상식을 알 수 있고 모르는 환경 문제를 알아 가면서 환경 상식을 늘릴 수 있음)

![image-20221007110020762](README.assets/image-20221007110020762.png)

![image-20221007110032736](README.assets/image-20221007110032736.png)

![image-20221007110040762](README.assets/image-20221007110040762.png)

![image-20221007110059856](README.assets/image-20221007110059856.png)

5. 별보러 갈래(지라포밍 캠페인을 할 수 있는 서비스, 월별랭킹, 사진등록, 별 확인 )

![image-20221007110141942](README.assets/image-20221007110141942.png)

![image-20221007110348105](README.assets/image-20221007110348105.png)

![image-20221007110533402](README.assets/image-20221007110533402.png)

![image-20221007110515905](README.assets/image-20221007110515905.png)

![image-20221007110544833](README.assets/image-20221007110544833.png)

6. 마이페이지(서비스 이용 내역, 닉네임 변경, 배찌, 환경캠패인 참여 정보 )

![image-20221007111657161](README.assets/image-20221007111657161.png)

![image-20221007111902029](README.assets/image-20221007111902029.png)





## 2. AI, 빅데이터

### 과정

![image-20221007113831990](README.assets/image-20221007113831990.png)

### 클러스터 구성

![image-20221007114003009](README.assets/image-20221007114003009.png)

### 분산병렬 처리

![image-20221007114032887](README.assets/image-20221007114032887.png)



### 적용

크롤링한 뉴스 데이터를 스파크를 이용해 전처리하여 HDFS에 저장, 그후 sqoop을 이용하여 MySQL DB에 저장.



## 2. 데이터 분석

### 분석 과정

![image-20221007114604158](README.assets/image-20221007114604158-166511076523691.png)

### 데이터 ETL

![image-20221007114627805](README.assets/image-20221007114627805.png)

### 데이터 증강 및 예측

![image-20221007114653202](README.assets/image-20221007114653202.png)



### 적용

회귀 분석을 통해서 2030년도의 지구 온도, 빙하 감소량 예측, 또한 CO2 감소에 따른 기온상승, 빙하량 수치 예측

## 3. 이미지 AI

### 학습과정

![image-20221007114829717](README.assets/image-20221007114829717.png)

### 모델

![image-20221007114851496](README.assets/image-20221007114851496.png)

### 이미지 증강

![image-20221007114906703](README.assets/image-20221007114906703.png)

### 모델 학습

![image-20221007114923388](README.assets/image-20221007114923388.png)

# 

# 프로젝트 아키택쳐

### 아키텍쳐 - ERD

![image-20221007115205382](README.assets/image-20221007115205382.png)

### 아키텍쳐 - PROJECT 

![image-20221007115228480](README.assets/image-20221007115228480.png)

### 아키텍쳐 - 데이터

![image-20221007115300652](README.assets/image-20221007115300652.png)

### 기술스택

![image-20221007115317252](README.assets/image-20221007115317252.png)



# 4. 프로젝트 진행

온라인, 오프라인을 병행해서 진행되었기에 진행 방식과 소통 방법이 중요했습니다.

그래서 우리는 Agile 방법으로 프로젝트를 진행했고 Jira의 Scrum 방식을 채택하여 커뮤니케이션 리소스를 줄였습니다.

## 1. Git Flow

Git Flow는 최종 배포를 위한 Master, 배포 및 테스트를 위한 develop, 프론트와 백앤드를 나눠주는 front, backend 브랜치, 그리고 세부 기능을 개발할 수 잇는 Feature/(기능명) 브랜치로 구성하여 GitFloew를 구성했습니다.



## 2. Jira

매주 스크럼을 통해서 스프린트를 시작

- 에픽은 가장 큰 단위인 기획, 유저관리, 서버, 게더타운 등으로 구성하였습니다.
- 스토리는 로그인 페이지 구성한다와같이 작성하였으며 그 밑에 sub task를 두어 세부할일을 적었습니다.

![image-20221007112446064](README.assets/image-20221007112446064.png)

### 3. Notion

데일리 스크럼 , API문서, 발표정리 등 문서들에 대한 저료는 Notion을 통해서 작성했습니다.

![image-20221007112658359](README.assets/image-20221007112658359.png)

# 5. 배포

포팅메뉴얼에 포함되어있습니다. 참고하세요!

# 6. 소감 및 배운점

![KakaoTalk_20221007_112558248](README.assets/KakaoTalk_20221007_112558248.png)

- 권도현 : 다양한 분야를 접해볼 수 잇는 프로젝트였습니다. 마감까지 열심히 진행해주신 팀원들 덕분에 프로젝트를 성공적으로 마무리 할 수 있었던 것 같습니다.
- 김지혜 : 시간이 부족해서 아쉽지만, 다양한 기술을 사용해 볼 수 있어서 좋았습니다. 이후에 새로운 프로젝트를 진행할 때, 이번 프로젝트의 경험이 많은 도움이 될 거 같습니다.
- 박지현 : 아쉬운 점이 많이 남았던 프로젝트였습니다. 처음으로 팀장을 담당했는데 담당 도메인에 대해서 기술이 부족해서 프로젝트를 전반적으로 총괄하지 못했습니다. 개발할 시간이 부족했고 더 시간이 많았으면 좋은 퀄리티의 프로젝트가 나왔지않았을까 하는 아쉬움이 가득합니다. 그치만 새로운걸 도전해볼 수 있었고 팀원들과 함께 결과물을 만들어낼 수 있어서 또 성장하게 된 것 같습니다.
- 변수경: 백엔드를 담당하며 Redis MongoDB 스케쥴러 배치처리, 컨트롤어드바이스 등 새로운 기술들을 사용해 볼 수 있어서 많은 도움이 되었던 프로젝트였다.
- 이동욱 : 이미지 AI학습, 데이터 분산, 데이터분석(회귀분석)을 해보면서 빅데이터, AI에 대해서 배울 수 있는 프로젝트 였습니다. 클러스터를 EC2를 이용해 직접 구현하면서 서버, 클라우드에 대해서도 배울 수 잇는 프로젝트였습니다. 또한 좋은 팀원들과 협업을 하면서 협업에 대해서 다시 한번 배울 수 있었습니다. 
- 허건녕: 많이 배울 수 있는 프로젝트 였습니다. 처음에 생각한 기능을 모두 구현하지 못하여 아쉬운 부분이 있지만, 팀원들과 함께 웹사이트를 완성할 수 있어서 좋았습니다. 단순히 웹사이트의 많은 기능을 추가하여 화려하게 만드는 것보다 성능을 고려하며 기능과 웹사이트가 잘 조합되는 것의 중요성을 배울 수 있었습니다. 