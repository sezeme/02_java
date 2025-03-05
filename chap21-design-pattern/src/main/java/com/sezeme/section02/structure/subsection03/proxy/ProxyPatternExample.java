package com.sezeme.section02.structure.subsection03.proxy;

// 이미지 인터페이스 (공통 인터페이스)
interface Image {
    void display();
}

// 실제 이미지 객체 (비싼 리소스를 사용하는 객체)
class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(); // 파일 로딩 (비용이 큰 작업)
    }

    private void loadFromDisk() {
        System.out.println("디스크에서 " + fileName + " 로딩 중...");
    }

    public void display() {
        System.out.println(fileName + " 화면에 표시됨");
    }
}

// 프록시 객체 (실제 객체에 대한 접근을 지연시키거나 제어)
class ProxyImage implements Image {
    private RealImage realImage; // 실제 이미지 객체
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    public void display() {
        if (realImage == null) { // 실제 객체가 필요할 때만 생성 (지연 로딩)
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}

// 클라이언트 코드
public class ProxyPatternExample {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("photo1.jpg");

        // 첫 번째 호출 (이미지 로딩 발생)
        image1.display();

        System.out.println("-------------");

        // 두 번째 호출 (이미 로딩된 이미지 사용)
        image1.display();

        System.out.println("-------------");

        // 새로운 이미지 객체 생성
        Image image2 = new ProxyImage("photo2.jpg");
        image2.display();
    }
}
