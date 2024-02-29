package nested.ex.ex02;

public class Button {

    static interface OnClickListener {

        void onClick();
    }

    OnClickListener listener;

    public void setOnClickListener(OnClickListener listener) {
        this.listener = listener;
    }

    public void touch() {
        listener.onClick();
    }
}
