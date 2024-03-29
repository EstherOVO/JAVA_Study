package network.tcp;

import java.io.*;
import java.net.Socket;

public class EchoClient {
    public static void main(String[] args)  {

//      클라이언트 측에서 사용하는 단말
//      Socket : 서버가 리스닝하고 있는 호스트와 포트를 알아야 한다.
//      호스트 이름과 포트 번호를 인자로 받음
        String hostName = "localHost";  // 서버의 호스트 이름("localHost" : 자기 자신을 가리킴)
        int portNumber = 12345;         // 서버측 애플리케이션의 포트 번호

//      클라이언트 소켓의 입출력 스트림
        try (Socket socket = new Socket(hostName, portNumber);
             InputStream inputStream = socket.getInputStream();
             BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));
             OutputStream outputStream = socket.getOutputStream();
             PrintWriter out = new PrintWriter(outputStream);) {

            System.out.println("클라이언트가 서버에 연결이 되었습니다.");

//          콘솔에서 표준 입력을 받는 입력 스트림 리더
            BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));

            while (true) {

//              서버 쪽에서 출력 스트림으로 메시지 전송
                String input = stdIn.readLine();
                out.println(input);
                out.flush();

                String serverResponse = in.readLine();
                if (serverResponse == null) break;
                System.out.println("서버로부터 받은 응답 : " + serverResponse);
            }
        } catch (IOException e) {
            System.out.println("오류가 발생했습니다.");
        }
    }
}
