public class Singleton {
    private static Singleton singleton;

    private Singleton() { // 생성자로 객체를 생성하지 못하도록 제한.
    }

    public static Singleton getInstance() { // 객체를 가져오는 메소드. 생성자로 객체 생성을 막아뒀기때문에 static 메소드로 작성.
        if (singleton == null) { // 객체가 생성되있지 않다면
            singleton = new Singleton(); // 객체를 생성
        }
        return singleton; // 객체를 반환.
    }
}
