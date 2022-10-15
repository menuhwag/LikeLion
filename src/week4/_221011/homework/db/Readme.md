# DB 설계 과제

## Twitter DB 설계하기

### ERD

![ERD](https://github.com/menuhwang/LikeLion/blob/main/src/homework/homework_221011/db/twitter_db_erd.png)

### 테이블

#### Member

| 순번 | 컬럼 | 데이터 타입 | PK | FK | NN | AI | Default |
| --- | --- | ---------- | :---: | :---: | :---: | :---: | :----: |
| 1 | id | INT | Y |  | Y | Y |  |
| 2 | email | VARCHAR(45) |  |  | Y |  |  |
| 3 | password | VARCHAR(45) |  |  | Y |  |  |
| 4 | blocked | BIT |  |  | Y |  | FALSE |
| 5 | circle_id | INT |  | Y |  |  |  |

#### Circle

| 순번 | 컬럼 | 데이터 타입 | PK | FK | NN | AI | Default |
| --- | --- | ---------- | :---: | :---: | :---: | :---: | :----: |
| 1 | id | INT | Y |  | Y | Y |  |
| 2 | name | VARCHAR(45) |  |  | Y |  |  |

#### Post

| 순번 | 컬럼 | 데이터 타입 | PK | FK | NN | AI | Default |
| --- | --- | ---------- | :---: | :---: | :---: | :---: | :----: |
| 1 | id | INT | Y |  | Y | Y |  |
| 2 | contents | VARCHAR(140) |  |  |  |  |  |
| 3 | member_id | INT |  | Y | Y |  |  |
| 4 | circle_only | BIT |  |  | Y |  | FALSE |
| 5 | circle_id | INT |  | Y |  |  |  |

#### Comment

| 순번 | 컬럼 | 데이터 타입 | PK | FK | NN | AI | Default |
| --- | --- | ---------- | :---: | :---: | :---: | :---: | :----: |
| 1 | id | INT | Y |  | Y | Y |  |
| 2 | member_id | INT |  | Y | Y |  |  |
| 3 | post_id | INT |  | Y | Y |  |  |
| 4 | contents | VARCHAR(140) |  |  |  |  |  |

#### Like

| 순번 | 컬럼 | 데이터 타입 | PK | FK | NN | AI | Default |
| --- | --- | ---------- | :---: | :---: | :---: | :---: | :----: |
| 1 | id | INT | Y |  | Y | Y |  |
| 2 | post_id | INT |  | Y | Y |  |  |
| 3 | member_id | INT |  | Y | Y |  |  |
