package nested.ex.ex04;

public class CheckBox {

    static interface OnSelectListener {
        void onSelect();
    }

    OnSelectListener listener;

    void setOnSelectListener(OnSelectListener listener) {
        this.listener = listener;
    }

    void selct() {
        listener.onSelect();
    }
}
