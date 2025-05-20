class A{
    String name;
    A(String name){
        this.name = name;
    }
}

class B{
    String name;
    B(String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object object){
        // 다운 캐스팅사용, 모든 객체클래스는 Object 를 상속받으므로.
        if(this.name == ((B) object).name){
            return true;
        }else{
            return false;
        }
    }
}

public class ObjectMethod_equals {
    public static void main(String[] args) {
        A a1 = new A("안녕");
        A a2 = new A("안녕");

        System.out.println(a1 == a2);

        // equals()는 원래 스택 메모리의 주소값을 비교했지만, equals를 오버라이딩 하여 재정의 하여 name 변수의 값을 비교하도록 했다.
        System.out.println(a1.equals(a2));

        B b1 = new B("안녕");
        B b2 = new B("안녕");
        System.out.println(b1 == b2);
        System.out.println(b1.equals(b2));
    }
}
