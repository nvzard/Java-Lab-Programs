class A{

    final int a = 1947;
    int x = 1923;

    void method(){
        this.x = 9999;
    }
}

final class B{

    int a = 1947;

    void method(){
        System.out.println(a);
    }
}

/*
class C extends B{

    System.out.println(a);

}
*/
