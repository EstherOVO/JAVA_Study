package Class_;

public class Class03 {
    public static void main(String[] args) {

//      배열을 사용하게 될 경우 사람이 데이터를 수정하거나 관리할 때 실수할 수 있다.
        String[] studentNames = {"홍길동", "임꺽정", "이몽룡"};
        int[] studentScores = {80, 70, 95};
        int[] studentAges = {15, 17, 19};

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("학생 이름 : " + studentNames[i] + " / 점수 : " + studentScores[i] + " / 나이 : " + studentAges[i]);
        }
    }
}
