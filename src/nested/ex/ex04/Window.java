package nested.ex.ex04;

public class Window {

    CheckBox checkBox = new CheckBox();

    public Window() {
        checkBox.setOnSelectListener(new CheckBox.OnSelectListener() {
            @Override
            public void onSelect() {
                System.out.println("배경을 변경합니다.");
            }
        });
    }
}
