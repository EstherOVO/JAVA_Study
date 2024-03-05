package library.lang;

// Clone은 기본적으로 얕은 복사다.
public class ShallowCopy implements Cloneable {

    int[] array;

    public ShallowCopy(int[] array) {
        this.array = array;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
