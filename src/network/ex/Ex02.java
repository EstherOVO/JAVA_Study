package network.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex02 {
    public static void main(String[] args) {

/*
        연습 문제 2 : 웹 페이지 제목 추출기

        주어진 URL의 웹 페이지로부터 HTML <title> 태그 내의 텍스트를 추출하는 자바 프로그램을 작성하세요.
        이 프로그램은 웹 페이지를 다운로드하고,
        HTML 내용에서 <title> 태그의 텍스트를 찾아 출력해야 합니다.

        - 웹 페이지의 HTML 내용을 가져옵니다.
        - HTML 내용에서 <title> 시작 태그와 </title> 종료 태그 사이의 텍스트를 추출합니다.
        - 추출한 텍스트를 출력합니다.

        - 입력 예시: https://www.example.com
        - 출력 예시 (웹 페이지의 제목에 따라 다름): Example Domain
*/

        try {

            URL url = new URL("https://www.example.com");

            URLConnection connection = url.openConnection();

            InputStream is = connection.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            String line = "";

            while ((line = br.readLine()) != null) {

                if (line.contains("<title>")) {

                    String title = line.substring(line.indexOf(">") + 1, line.indexOf("</"));
                    System.out.println(title);

//                  Pattern pattern = Pattern.compile("[>](.*?)[<]");
//                  Matcher matcher = pattern.matcher(line);
//
//                  while (matcher.find()) {
//
//                      System.out.println(matcher.group(1));
//
//                      if (matcher.group(1) == null) break;
//                  }
                }
            }
        } catch (MalformedURLException e) {
            System.out.println("잘못된 URL 형식입니다.");
        } catch (IOException e) {
            System.out.println("입출력에 문제가 발생하였습니다.");
        }
    }
}
