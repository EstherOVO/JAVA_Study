package nested.anonymous_interface.button;

public class Button {

//  중첩 인터페이스
    static interface OnClickListener {
        void onClick();
    }

//  필드
    OnClickListener listener;

//  필드 설정자 : 매개 변수로 인터페이스 구현 객체를 입력받음
    void setOnClickListener(OnClickListener listener) {
        this.listener = listener;
    }

    void touch() {
        listener.onClick();
    }

}
