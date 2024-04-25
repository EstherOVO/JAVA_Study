package jdbc.dao;

public class MemberDTO {

//  데이터를 전달한 컬럼(DB의 컬럼과 일치)
    private String id;
    private String name;
    private String email;

    public MemberDTO(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    //  Getter, Setter
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("ID : %s | Name : %s | Email : %s", id, name, email);
    }
}
