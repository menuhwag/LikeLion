# 대용량 데이터 처리 프로젝트

## 결과

대용량 데이터 처리 프로젝트를 진행하며.

파일 읽기와 파일 쓰기를 해보았고, 파일 읽기 중 문자열 연산 `String str = ""; str += br.readLine()` 을 하면 모든 String 리터럴이 메모리에 저장돼 시간이 매우 오래 걸리는 것을 직접 경험해 볼 수 있었음.

따라서, 많은 문자열 연산이 필요할때는 `List<String>` 또는 `StringBuilder`를 활용할 것.

객체 지향적인 프로그래밍을 해보려고 시도함.

`Parser` 인터페이스를 작성하여 추후 다른 데이터의 파서를 구현할 때 본 코드 수정 없이 실행할 수 있도록 노력함.

파일 읽기, 파서, 도메인 객체, 분석으로 역할별로 클래스를 분리해 봄.

얼마나, 어떻게, 어떤 기준으로 클래스를 나누면 좋을지, 그리고 그 클래스들 사이를 어떻게 연결하는 것이 바람직할지 좀 더 공부가 필요함.

![HeatmapChart](https://github.com/menuhwang/LikeLion/blob/main/src/week3/_221007/study/bigdata_project_refactor/heatmapChart.png)

## 파일

### `Categories`, `Data`, `HeatmapChart`

Heatmap 차트 작성을 위한 데이터 가공.
```json
{
  "xAxis": {
    "categories": ["서울특별시","부산광역시","대구광역시","인천광역시","광주광역시","대전광역시","울산광역시","세종특별자치시","경기도","강원도","충청북도","충청남도","전라북도","전라남도","경상북도","경상남도","제주특별자치도"]
  },
  "yAxis": {
    "categories": ["서울특별시","부산광역시","대구광역시","인천광역시","광주광역시","대전광역시","울산광역시","세종특별자치시","경기도","강원도","충청북도","충청남도","전라북도","전라남도","경상북도","경상남도","제주특별자치도"]
  },
  "data": [...]
}
```

<br>

### `City`

도시 코드와 인덱스 값을 포함하여 미리 정의해둔 Enum 클래스.

`City.SEOUL` 과 같이 값을 가져올 수 있음.

<br>

### `TransferHistory`

전출 도시와 전입 도시를 담는 객체, 도메인

<br>

### `Parser`

Parser 구현을 위한 인터페이스

<br>

### `TransferHistoryParser`

인구이동내역 파싱을 위한 Parser 인터페이스의 구현체

<br>

### `ReadLineContext`

파일을 읽어와 파싱하는 객체

<br>

### `TransferHistoryCounter`

인구이동내역 리스트를 카운트하기 위한 객체

<br>

### `TransferHistoryAnalyzer`

인구이동내역을 분석하는 객체

+ getListByFromAndTo(City fromCity, City toCity) : 전출도시와 전입도시로 내역 조회
+ getTransferHistories() : 전체 리스트 조회
+ count(List<TransferHistory> list) : 인자의 데이터 카운트 2차 배열 형태로 반환.
+ saveHeatmapJson(String filename) : 전체 리스트 Heatmap 생성을 위한 json파일로 저장.

<br>


