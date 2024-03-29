package library.lang.ex;

public class Ex14 {
    public static void main(String[] args) {

/*
        연습문제 : 우주 탐험가 정보 출력하기

        요구사항 :
        우주 탐험가의 이름, 발견한 행성의 수, 행성을 발견하는데 걸린 평균 년도를 변수에 저장하고,
        이 정보를 사용하여 탐험가에 대한 정보를 포매팅하여 출력하는 프로그램을 작성하세요.

        이 탐험가의 이름은 "김우주"입니다.
        이 탐험가는 총 7개의 행성을 발견했습니다.
        이 값은 2.5년입니다.
        위 정보를 사용하여 String.format 메서드를 사용해 다음 문장을 포매팅하고 출력하는 코드를 작성합니다
        "탐험가 [이름]는 총 [행성 수]개의 행성을 발견했으며, 평균 [평균 년도]년에 한 번씩 새로운 행성을 발견했습니다."
*/

        String explorerName = "김우주";
        int planetsDiscovered = 7;
        double averageDiscoveryYear = 2.5;

        String format = String.format("탐험가 %s는 총 %d개의 행성을 발견했으며, 평균 %.1f년에 한 번씩 새로운 행성을 발견했습니다.", explorerName, planetsDiscovered, averageDiscoveryYear);

        System.out.println(format);
    }
}
