//BMI測定器(?)
//2020/10/25
//@Tione_6296

import java.util.Scanner;

class Main{
    public static void main(String[] args){
        System.out.println("このプログラムで入力可能な数値は半角整数のみです");
        Scanner sc = new Scanner(System.in);
        System.out.print("何人分の情報を入力しますか：");
        int ninzu = sc.nextInt();
        if(ninzu == 0){
        System.out.println("プログラムを終了します");
        System.exit(0);
        }else{
            System.out.println(ninzu+"人分の情報を入力します");
        }

        int maxage = 0;
        int average = 0;
        int allage = 0;
        int[] fage = new int[ninzu+1];
        float bmi = 0;

        for(int i=1;i<=ninzu;i++){

        System.out.println(i+"人目");

        System.out.print("名前：");
        String name = sc.next();

        System.out.print("苗字：");
        String fname = sc.next();

        System.out.print("年齢：");
        int age = sc.nextInt();

        System.out.print("身長(cm)：");
        float height = sc.nextFloat();

        System.out.print("体重(kg)：");
        float weight = sc.nextFloat();

        fage[i] = age;

        System.out.println("名前は" + fname + " " + name + "です");
        System.out.println("年齢は" + age + "歳です");
        if(age >= 20){
            System.out.println("成年者です");
        }else{
            System.out.println("未成年者です");
        }

        System.out.print("身長は");
        System.out.printf("%.1f",(float)height);
        System.out.println("cmです");

        System.out.print("体重は");
        System.out.printf("%.1f",(float)weight);
        System.out.println("kgです");
        
        height = height / 100;
        bmi = weight/(height*height);

        System.out.print("BMIは");
        System.out.printf("%.2f",(float)bmi);
        System.out.println("です");

        }

        sc.close();

        for(int i=0;i<=ninzu;i++){
            if(maxage < fage[i]){
                maxage = fage[i];
            }
        }

        for(int i=0;i<=ninzu;i++){
            allage += fage[i];
        }

        average = allage / ninzu;

        if(ninzu != 1){
        System.out.println("最高齢は" + maxage + "歳です");
        System.out.println("平均年齢は" + average + "歳です");
        }
    }
}
