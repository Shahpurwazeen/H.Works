package class26;

public interface TrustAble {
  public static int age=10; // Constants ... the value is not changeable
   String color="Blue";
  int trust();

  static void method1(){
      System.out.println("Hello world");

  }
  default void method2(){

  }
  private void method3(){

  }

}
class Bank implements TrustAble{

    @Override
    public int trust() {
        return 0;
    }

    public static void main(String[] args) {
        TrustAble.method1();
        System.out.println(TrustAble.age);

    }
}
