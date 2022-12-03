import java.util.Scanner;

/*
In this section we will see about bitwise operator how they work, and we are using all the operator of bitwise.
There are mainly five types of bitwise operator i.e :
1: Bitwise operator or(|)
2:Bitwise operator and(&)
3:Bitwise operator exclusive xor(^)
4:Bitwise operator left shift(<<)
5:Bitwise operator right shift(>>)
 */
class operators {
    int a;
    int b;
    public operators(int x, int y) {
        a = x;
        b = y;
    }
    public int bit() {
        return a | b;
    }
    public int and() {
        return a & b;
    }
    public int xor() {
        return a ^ b;
    }
    public int left() {
        return a << b;
    }
    public int right() {
        return a >> b;
    }
}
        public class Main {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the first number :");
                int x = sc.nextInt();
                System.out.println();
                System.out.print("Enter the second number :");
                int y = sc.nextInt();
                operators obj = new operators(x,y);
                System.out.println("Final result after calculating the input by use of and operator = " +  obj.and());
                System.out.println("Final result after calculating the input by use of bit operator = " +  obj.bit());
                System.out.println("Final result after calculating the input by use of xor operator = " +  obj.xor());
                System.out.println("Final result after calculating the input by use of left operator = " + obj.left());
                System.out.println("Final result after calculating the input by use of right operator = " + obj.right());
            }
        }
