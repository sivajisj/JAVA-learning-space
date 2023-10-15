/**
 * b
 */
public class b {
    int a ;
    int b ;
    b(int a , int b){
        this.a = a;
    this.b =b;
    }

    b(int a){
        this.a =a;

    }
    void display(){
        System.out.println("a = "+a+" b="+b);

    }

    public static void main(String[] args) {
        b foo = new b(1);
        foo.display();
        
  }
}