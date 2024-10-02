웹은 클라이언트와 서버가 상호작용 하는공간이다. 클라이언트는 서버에 데이터의 생성/조회/수정/삭제 등을 요청할 수 있고 서버는 그에 상응하는 동작을 수행한다.  
웹에서 프로토콜(규칙)이 존재하는데 이는 우리가 흔히 알고 있는 HTTP이다.  
HTTP에 데이터 요청을 보낼 땐 HTTP Method가 필요하다.  
자주 사용되는 HTTP Method에는 GET,POST,PUT,PATCH,DELETE가 있다.  
URL(Uniform Resource Location)은 다룰 데이터의 위치를 나타내는데 흔히 알려진 URL 구조 외에 Path Parameter 표현 방법이 존재한다.  
HTTP의 데이터 구조는 HTTP 헤더와 바디 부분으로 나뉘어져 있다. HTTP 헤더에는 서버와 클라이언트가 어떻게 통신할지에 대한 정보들을 담고 있고, HTTP 바디에는 실제 제이터들이 존재한다.  
클라이언트가 명령을 실행하고 서버로부터 데이터를 받을 때, HTTP 헤더, HTTP 바디 그리고 상태코드와 함께 받는다. 여기서 상태코드는 잘 알려진 404(요청 데이터 없음)과 함께 200(처리 성공), 201(데이터 생성 성공), 400(클라이언트 요청 오류), 500(서버 에러) 등이 있다.  
프론트엔드와 백엔드의 구분--> 화면에는 여러 종류의 컨텐츠가 있다. 그 중 일부는 몇초마다 갱신이 필요한 데이터일 수도 있고, 일부는 변하지 않는 데이터일 수 있다. 데이터가 변할 때, html 코드를 수정해야 하는데 이때, 몇초마다 갱신이 필요한 데이터는 html 코드를 몇초마다 갱신할 필요 없이 백엔드에서 처리되고, 변하지 않는 화면 같은 경우는 프론트엔드에서 관리한다.  
프론트엔드와 백엔드는 HTTP를 이용하여 통신을 한다. 정해진 규칙은 없고 약속들이 존재하는데 규칙은 안에서 직접 정의한다.  
API(Application Programming Interface)는 어플리케이션과의 소통하는 구체적인 방법을 정의한 사용설명서다.  
백엔드 API는 프론트엔드가 백엔드에 요청을 보낼 때 어떤 HTTP Method, URL을 사용해야하는지 정의한 것이다. 그리고 그 요청들에 대해 어떤 응답을 보내는지 정의한 것이다.

### 회원가입 API

    - 'POST /name'
    - 'PATCH /name'
    - 'PUT /name'
    _이름 생성, 수정, 교체_

    - 'POST /email'
    - 'PATCH /email'
    - 'PUT /email'
    _이메일 생성, 수정, 교체_

### 친구 관리 API

    - 'GET /name'
    - 'POST /name/follow'
    - 'DELETE /name/follow'
    _이름 데이터 조회, 친구 팔로우/팔로우 삭제_

    - GET /name/categories/{categoryid}/todolist
    - POST /name/categories/{categoryid}/todolist
    - DELETE /name/categories/{categoryid}/todolist
    _친구 할일 조회 및 좋아요&좋아요 취소_

### 할일 관리 API

    - 'POST /categories'
    - 'PATCH /categories/{categoryid}'
    - 'PUT /categories/{categoryid}'
    - 'DELETE /categories/{categoryid}'
    _//할일 카테고리 생성, 수정, 교체, 삭제_

    - 'POST /categories/{categoryid}/todolist'
    - 'PATCH /categories/{categoryid}/todolist'
    - 'PUT /categories/{categoryid}/todolist'
    - 'DELETE /tcategories/{categoryid}/todolist'
    _할일 생성, 수정, 교체, 삭제*_
