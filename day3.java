//メソッドを用いた入力数値の桁数確認
//2020/10/26
//@Tione=6296

import java.util.Scanner;

class Main{
    public static void main(String[] args){

        System.out.println("1以上の整数を入力してください");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int check = 0;

        check = keta(num);

        System.out.println(num+"は"+check+"桁です");

    }

    public static int keta(int x){
        int i=0;
        while(x != 0){
            x = x / 10;
            i++;
        }
        return i;
    }

}