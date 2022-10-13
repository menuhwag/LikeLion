package com.hospital.util;

import com.google.gson.Gson;
import com.hospital.dto.juso.JusoDTO;

import java.net.URI;
import java.net.http.*;

public class JusoApi {
    private final String API_KEY;
    private final String BASE_URL = "https://www.juso.go.kr/addrlink/addrLinkApi.do";

    public JusoApi(String apiKey) {
        API_KEY = apiKey;
    }

    public JusoDTO search(String keyword, int currentPage, int countPerPage) {
        Gson gson = new Gson();
        String requestURL = new StringBuilder()
                .append(BASE_URL)
                .append("?")
                .append(getConfirmKeyQuery())
                .append("&")
                .append(getResultTypeQuery())
                .append("&")
                .append(getKeywordQuery(keyword))
                .append("&")
                .append(getCurrentPage(currentPage))
                .append("&")
                .append(getCountPerPage(countPerPage))
                .toString();

        JusoDTO jusoDTO = null;
        try {
            HttpClient client = HttpClient.newBuilder().version(HttpClient.Version.HTTP_1_1).build();
            String result = client.sendAsync(
                                    HttpRequest.newBuilder(new URI(requestURL)).GET().build(),  //GET방식 요청
                                    HttpResponse.BodyHandlers.ofString()  //응답은 문자형태
                            ).thenApply(HttpResponse::body)  //thenApply메소드로 응답body값만 받기
                            .get();  //get메소드로 body값의 문자를 확인
            jusoDTO = gson.fromJson(result, JusoDTO.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jusoDTO;
    }

    public JusoDTO search(String keyword) {
        return search(keyword, 1, 10);
    }

    private String getConfirmKeyQuery() {
        return "confmKey=" + API_KEY;
    }

    private String getResultTypeQuery() {
        return "resultType=json";
    }

    private String getKeywordQuery(String keyword) {
        return "keyword=" + keyword;
    }

    private String getCurrentPage(int currentPage) {
        return "currentPage=" + currentPage;
    }

    private String getCountPerPage(int countPerPage) {
        return "countPerPage=" + countPerPage;
    }
}
