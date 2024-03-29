package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Network05 {
    public static void main(String[] args) {

        String urlString = "https://jsonplaceholder.typicode.com/";
        StringBuilder response = new StringBuilder();

        try {

//          URL로부터 HTTP 연결 객체 생성
            URL url = new URL(urlString + "albums/10");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

//          메서드 설정
            connection.setRequestMethod("GET");
//          헤더 추가 : 받는 데이터의 타입이 JSON
            connection.setRequestProperty("Content-Type", "application/json");

//          응답 코드
            int responseCode = connection.getResponseCode();
            System.out.println("responseCode = " + responseCode);

//          성공적으로 응답이 되었을 때 JSON 본문을 문자열에 넣어 저장
            if (responseCode == 200) {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));

                while (true) {

                    String line = in.readLine();
                    if (line == null) break;
                    response.append(line);
                }

                in.close();
            }
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("응답 본문");
        System.out.println(response);
    }
}
