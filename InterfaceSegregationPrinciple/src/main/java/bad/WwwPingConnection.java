package bad;

public class WwwPingConnection implements Connection {

    private final String www;

    public WwwPingConnection(String www) {
        this.www = www;
    }

    @Override
    public void http() {
        System.out.println("Setup an HTTP connection to " + www);
    }

    @Override
    public void connect() {
        System.out.println("Connect to " + www);
    }

    // 이 메서드는 인터페이스 분리 원칙에 맞지 않는다.
    // 이 클래스는 socket 메서드가 필요하지 않지만 강제로 재정의해야 한다.
    // 불필요한 자원 낭비!
    @Override
    public void socket() { }
}
