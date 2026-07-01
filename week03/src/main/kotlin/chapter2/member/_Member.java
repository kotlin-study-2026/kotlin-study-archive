package chapter2.member;

import kos.chapter2.member.Status;

// 자바 코드
class _Member {

    // 불변 필드 코드
    private final String name;

    // 가변 필드 코드
    private Status status;

    // 생성자 코드
    public _Member(String name, Status status){

        // 파라미터를 필드에 직접 대입
        this.name = name;
        this.status = status;
    }

    // 자바의 관습인 getter와 setter 코드 따로 생성
    public String getName(){
        return name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status){
        this.status = status;
    }
}
