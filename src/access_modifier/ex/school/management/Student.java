package access_modifier.ex.school.management;

public class Student {
    
    private String name;
    private String sturdenId;
    
    Student(String name, String sturdenId) {
        this.name = name;
        this.sturdenId = sturdenId;
    }

    public String getInstance1() {
        return name;
    }

    public String getInstance2() {
        return sturdenId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSturdenId(String sturdenId) {
        this.sturdenId = sturdenId;
    }
}
