package network;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class Network03 {
    public static void main(String[] args) throws IOException {

//      URL 객체 연결
        URL naverEntUrl = new URL("https://entertain.naver.com");
        URL url = new URL(naverEntUrl, "/ranking/read?oid=408&aid=0000218993");

//      URL 연결 객체 반환
        URLConnection connection = url.openConnection();

//      URL 연결 정보에서 입력 스트림으로 데이터를 받음
        InputStream inputStream = connection.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

//      출력 스트림으로
        FileWriter writer = new FileWriter("src/network/news.html");
        BufferedWriter bw = new BufferedWriter(writer);

        String line = "";

        while ((line = bufferedReader.readLine()) != null) {

//          한 줄씩 출력하기
            System.out.println(line);
            bw.write(line);
            bw.newLine();
        }

//      닫기
        bufferedReader.close();
        inputStreamReader.close();
        inputStream.close();

        bw.flush();
        bw.close();
    }
}
