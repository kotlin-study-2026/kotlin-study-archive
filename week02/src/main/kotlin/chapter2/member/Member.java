package chapter2.member;

import kos.chapter2.member.Status;

public class Member {
    private String name;
    private final Status status;

    public Member(String name,Status status ){
        this.name = name;
        this.status = status;
    }

    public String getMember(){
        return name;
    }

    public void setMember(String name){
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }
}
