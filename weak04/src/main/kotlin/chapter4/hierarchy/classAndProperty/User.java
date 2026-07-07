package chapter4.hierarchy.classAndProperty;

// Java
public final class User {
    private final String nickname;

    public User(String nickname) {
        this.nickname = nickname;
    }

    public final String getNickname() {
        return nickname;
    }
}