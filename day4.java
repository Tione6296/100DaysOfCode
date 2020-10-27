//三角形の成立条件
//2020/10/27
//@Tione_6296

import java.util.Scanner;

class Main{
    public static void main(String[] args){
        int x=0;
        boolean sankaku = false;
        System.out.println("三つの整数を入力してください");
        Scanner sc = new Scanner(System.in);
        System.out.print("一つ目>> ");
        int a = sc.nextInt();
        System.out.print("二つ目>> ");
        int b = sc.nextInt();
        System.out.print("三つ目>> ");
        int c = sc.nextInt();
        sc.close();

        if(a < b + c){
            if(b < a + c){
                if(c < a + b){
                    sankaku = true;
                }
            }
        }

        if(sankaku){
            System.out.print("三つの数 "+a+" "+b+" "+c+" で");
        }else{
            System.out.println("三つの数 "+a+" "+b+" "+c+" では三角形は作れません");
            System.exit(0);
        }

        if(a<b){
            x=a;
            a=b;
            b=x;
        }
        if(a<c){
            x=a;
            a=c;
            c=x;
        }
        if(b<c){
            x=b;
            b=c;
            c=x;
        }
        
        if((a == b)&&(b == c)&&(c == a)){
            System.out.println("正三角形が作れます");
        }else if((a != b)&&(b == c)){
            System.out.println("二等辺三角形が作れます");
        }else if(a*a == b*b + c*c){
            System.out.println("直角三角形が作れます");
        }else{
            System.out.println("三角形が作れます");
        }

    }
}