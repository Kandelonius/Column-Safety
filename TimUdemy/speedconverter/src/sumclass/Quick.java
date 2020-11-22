package sumclass;

public class Quick {
    public static void main(String[] args) {
        int c=0,a,temp;
        int n=153;
        temp=n;
        while(n>0)
        {
            a = n % 10;
            System.out.println("a = " + a);
            n = n / 10;
            System.out.println("n = " + n + " temp = " + temp);
            c = c + (a * a * a);
            System.out.println("c = " + c + "\n");

        }
        if(temp==c)
            System.out.println("armstrong number");
        else
            System.out.println("Not armstrong number");
    }
}
