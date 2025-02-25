package com.sezeme.section04.override;

import java.io.IOException;

public class SubClass extends SuperClass {
    /* throws 구문 없이 오버라이딩 가능 */
//    @Override
//    public void method() {}
    /* 같은 예외 타입을 throws 시 오버라이딩 가능 */
//    @Override
//    public void method() throws IOException {}

    /* 상위 예외 타입을 throws 시 오버라이딩 불가 */
//    @Override
//    public void method() throws Exception {}

}
