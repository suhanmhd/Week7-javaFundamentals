package sample;

@FunctionalInterface
public interface A {

    int sum(int val1,int val2);

}

  class Sample{

      public static void main(String[] args) {
         A obj=( n, m)->n*m;


          int s =obj.sum(12,14);
          System.out.println(s);
      }

}
