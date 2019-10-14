package ba.unsa.etf.rpr.tutorijal1;

import java.util.*;

public class Main{

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int n = input.nextInt();
	    for(int i = 1; i <= n; i++)
        {
            if(i % sumaCifara(i) == 0) System.out.println(i + "\n");
        }
    }

    public static int sumaCifara(int n) {
        int suma = 0;
        for(int i = 1; i < 2; i++)
        {
            if( n != 0 ) {
                suma += n % 10;
                n /= 10;
                if (n != 0) i--;
            }
        }
        return suma;
    }
}
