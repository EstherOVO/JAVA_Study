package polymorphism.abstraction.ex.ex04;

public class CookieMain_Ex04 {
    public static void main(String[] args) {

        Gingerbread gingerbread = new Gingerbread();
        StrawberryCookie strawberryCookie = new StrawberryCookie();
        ChocoCookie chocoCookie = new ChocoCookie();

        gingerbread.run();
        gingerbread.jump();
        gingerbread.specialSkill();

        strawberryCookie.run();
        strawberryCookie.jump();
        strawberryCookie.specialSkill();

        chocoCookie.run();
        chocoCookie.jump();
        chocoCookie.specialSkill();
    }
}
