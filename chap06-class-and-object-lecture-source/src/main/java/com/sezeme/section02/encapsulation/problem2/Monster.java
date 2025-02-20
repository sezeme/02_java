package com.sezeme.section02.encapsulation.problem2;

public class Monster {
    /* Monster 클래스가 유지보수 과정에서 변경 사항이 발생했다고 가정한다.
     * name 필드가 제거되고 kinds 필드가 추가 되었다. */
//    String name;
    String kinds;
    int hp;

    public void setInfo(String info) {
        //this.name = info;
        this.kinds = info;
    }

    public String getInfo() {
//        return "몬스터의 이름은 : " + this.name + "입니다.";
        return "몬스터의 이름은 : " + this.kinds + "입니다.";
    }

}