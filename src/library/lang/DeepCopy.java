package library.lang;


// 깊은 복사
public class DeepCopy implements Cloneable {

    int[] array;
    String str; // 깊은 복사 시 참조값 주의
    int[][] deepArray = {{1, 2, 3}, {4, 5, 6}}; // 차원이 높아질수록 모두 깊은 복사를 해야 한다.
    String[] strArray;  // 참조 차원마다 복사해야 한다.

    public DeepCopy(int[] array) {
        this.array = array;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        DeepCopy cloned = (DeepCopy) super.clone();

//      내부 필드의 참조값(배열, 참조타입 등)을 다시 한 번 복사해야 된다.
        cloned.array = this.array.clone();

        cloned.deepArray = this.deepArray.clone();
        for (int i = 0; i < deepArray.length; i++) {
            cloned.deepArray[i] = this.deepArray[i].clone();
        }
        return cloned;
    }
}
