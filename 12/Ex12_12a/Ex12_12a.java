package L12.Ex12.Ex12_12a;

class Factor{
    public int fac(int n){
        if(n >= 1)
            return n * fac(n-1);
        else return 1;
    }
}

public class Ex12_12a {
    public static void main(String[] args) {
        Factor f = new Factor();
        System.out.println("factor(5)= "+f.fac(5));

    }
}
