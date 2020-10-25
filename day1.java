//素因数分解をするプログラム
//2020/10/24
//@Tione_6296

import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("整数nを入力してください");
        int n = sc.nextInt();
        sc.close();
        int i=2;
        System.out.print(n+"=");
        while(n != i){
            while(n%i==0){
                System.out.print(i+"*");
                n=n/i;
            }
            i++;
        }
        System.out.print(n);
    }
}