package operator;

public class Ex04 {
    public static void main(String[] args) {

//      다음 코드는 사다리꼴의 넓이를 구하는 코드입니다.
//      정확히 소수 자릿수가 나올 수 있도록 빈칸을 채워주세요.
//      (사다리꼴의 넓이) = (윗변의 길이 + 아랫변의 길이) x (높이) ÷ 2

        int lengthTop = 5;
        int lengthBottom = 10;
        int height = 7;
        double area = ((double) (lengthTop + lengthBottom) * height / 2);
        System.out.println("사다리꼴의 넓이 : " + area);

    }
}
