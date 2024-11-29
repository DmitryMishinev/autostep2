package ru.courses.main;

import ru.courses.birds.*;
import ru.courses.figure.*;
import ru.courses.geometry.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        System.out.println(sumAll(new Number[]{2,new Fraction(3,2),2.3}));
//        System.out.println(sumAll(new Number[]{3.6, new Fraction(49, 12), 3, new Fraction(3, 2)}));
//        System.out.println(sumAll(new Number[]{new Fraction(1,3),1}));
        Circle circle = new Circle(new Point(3,4),4);
        Square square = new Square(new Point(4,5),2);
        Rectangle rectangle = new Rectangle(new Point(4,3),2,4);
        System.out.println(circle.getArea());
        System.out.println(square.getArea());
        System.out.println(rectangle.getArea());
        sumAllArea(new ArrayList<>(Arrays.asList(circle,square,rectangle)));
        Bird[] birds = new Bird[]{new Cuckoo("Cuckoo2", 5),new Cuckoo("Cuckoo", 3),new Parrot("Parrot2", 2,"меня зовут Кеша"),new Parrot("Parrot", 4,"привет как дела"),new Sparrow("Sparrow", 1),new Sparrow("Sparrow", 5)};
        songs(birds);
    }
    public static void sumAllArea(List<Figure> figures){
        double sum = 0;
        for (Figure figure : figures){
            sum+=figure.getArea();
        }
        System.out.println(sum);
    }
    public static void songs(Bird... birds){
        for (Bird bird : birds){
            System.out.println(bird.song());
        }
    }

    public static  double sumAll(Number[] number){
        double sum = 0;
        for (int i=0; i<number.length; i++){
            sum+=number[i].doubleValue();
        }
        return sum;
    }
    public static int[] add(int[] arr, int[] ins, int pos){
        int[] res=new int[arr.length + ins.length];
        for(int i=0;i< arr.length;i++){
            res[i]=arr[i];
        }
        for (int i = 0; i < res.length; i++) {
            if (res[pos-1]==i) {
                for(int m=0;m< ins.length;m++){
                    res[i++]=ins[m];
                }
                for (int j = pos+ins.length; j < res.length; j++) {
                    res[i++]=arr[j-pos- ins.length+1];
                }
            }
        }
        return res;
    }
    public static int[] add(int[] arr, int x, int pos){
        int[] res=new int[arr.length+1];
        for(int i=0;i< arr.length;i++){
            res[i]=arr[i];
        }
        res[pos]=x;
        for(int i=pos,j=pos+1;i< arr.length;i++,j++){
            res[j]=arr[i];
        }
        return res;
    }

    public static int[] deleteNegative(int[] arr){
        int count=0;
        int[]tmp=new int[arr.length];
        for(int i=0;i< arr.length;i++){
            if(arr[i]>=0) tmp[count++]= arr[i];
        }
        int[] res=new int[count];
        for (int i=0;i<count;i++){
            res[i]=tmp[i];
        }
        return res;
    }

    public static int[] findAll(int[] arr, int x){
        int[] tmp = new int[arr.length];
        int count=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==x) tmp[count++]=i;
        }
        if (count==arr.length)return tmp;
        int res[]=new int[count];
        for(int i=0;i<count;i++){
            res[i]=tmp[i];
        }
        return res;
    }

    public static int[] concat(int[] arr1, int[] arr2){
        int[] res= new int[arr1.length + arr2.length];
        int tmp=0;
        for (int i=0;i < arr1.length;i++){
            res[tmp++]=arr1[i];
        }
        for (int i=0;i<arr2.length;i++){
            res[tmp++]=arr2[i];
        }
        return res;
    }

    public static int[] reverseBack(int[] arr){
        int tmp=0;
        for (int i=0;i< arr.length/2;i++){
            tmp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=tmp;
        }
        return arr;
    }
    public static void reverse(int[] arr){
        int tmp=0;
        for (int i=0;i< arr.length/2;i++){
            tmp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=tmp;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static boolean palindrom(int[] arr){

        for(int i=0;i< arr.length/2;i++){
            if(arr[i]!=arr[arr.length-i-1]){
                return false;
            }
        }
        return true;
    }
    public static int countPositive(int[] arr){
        int countPositive=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                countPositive++;
            }
        }
        return countPositive;
    }
    public static int maxAbs(int[] arr){
        int max=0;
        for(int i=0;i< arr.length;i++){
            if(abs(max)<abs(arr[i])){
                max=arr[i];
            }
        }
        return max;
    }
    public static int findLast(int[] arr, int x){
        for(int i=arr.length-1; i>0;i--){
            if(x==arr[i]){
                return i;
            }
        }
        return -1;
    }
    public static int  findFirst(int[] arr, int x){
        for(int i=0; i<arr.length;i++){
            if(x==arr[i]){
                return i;
            }
        }
        return -1;
    }
    public static void guessGame() {
        int randomNum = 5;
        int x=0;
        int count=0;
        while(x!=randomNum){
            java.util.Scanner sc = new java.util.Scanner(System.in);
            System.out.println("What number am I thinking (0 to 9)? :");
            x = sc.nextInt();
            if (x != randomNum) {
                System.out.println("No, try again");
            } else {
                System.out.println("Yes, it`s " + randomNum);

            }   count++;
        }System.out.println("Attempts used:" + count);
    }
    public static void rightTriangle(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x-i-1; j++) {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void leftTriangle(int x){
        for(int i=0;i<x;i++){
            for(int y=0;y<=i;y++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void square(int x){
        for(int i=0;i<x;i++){
            for(int y=0;y<x;y++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static boolean equalNum(int x) {
        int res = x % 10;
        while(x>0){
            if(x%10!=res) return false;
            x/=10;
        }
        return true;
    }
    public static int numLen(long x){
        int res=0;
        for (int i=0;i<x;i++){
            x=x%10;
            res++;
        }
        return res;
    }
    public static int pow(int x, int y){
        int res=1;
        for (int i=0;i<y;i++){
            res*=x;
        }
        return res;
    }
    public static String chet(int x){
        String res="";
        for (int i=0; i<=x;i+=2){
            res+=i+" ";
        }
        return res;
    }
    public static String reverseListNums(int x){
        String res ="";
        for (int i=x;i>=0;i--){
            res+=i+" ";
        }
        return res;
    }

    public static String listNums(int x){
        if (x<0){
            throw new RuntimeException("x не может меньше 0");
        }
        String res= "";

        for (int i = 0; i <= x; i++) {
            res+=i+" ";
        }
        return res;
    }


    public static void printDays(String x){
        switch (x){
            case "понедельник":
                System.out.println("понедельник");
            case "вторник":
                System.out.println("вторник");
            case "среда":
                System.out.println("среда");
            case "четверг":
                System.out.println("четверг");
            case "пятница":
                System.out.println("пятница");
            case "суббота":
                System.out.println("суббота");
            case "воскресенье":
                System.out.println("воскресенье");
                break;
            default:
                System.out.println("это не день недели");
        }
    }
    public static String day(int x){
        switch (x){
            case 1: return "понедельник";
            case 2: return "вторник";
            case 3: return "среда";
            case 4: return "четверг";
            case 5: return "пятница";
            case 6: return "суббота";
            case 7: return "воскресенье";
            default: return "это не день недели";
        }
    }
    public static String age(int x){
        if (x%100>=10&&x%100<=20) return x+" лет";
        if (x%10==1) return x + " год";
        if (x%10==2 ||x%10==3 ||x%10==4) return x +" года";
        return x+" лет";
    }
    public static boolean magic6(int x, int y){
        return (x==6 || y==6 || (x-y)==6 || (y-x)==6 || (x+y)==6);
    }
    public static boolean is35(int x){
        if ((x%3==0)&& (x%5==0)) return false;
        return ((x%3==0)||(x%5==0));
    }
    public static int sum2(int x, int y){
        int res = x+y;
        if (res>=10 && res<=19) return 20;
        return res;
    }
    public static boolean sum3(int x, int y, int z){
        return ((x+y==z) || (y+z==x) || (z+x==y));
    }
    public static int max3(int x, int y, int z){
        int max = x;
        if (max<y) max=y;
        if (max<z) max=z;
        return max;
    }
    public static String makeDecision(int x, int y){
        if (x>y) return x + ">" +y;
        if (x<y) return x + "<" +y;
        return x + "==" +y;
    }
    public static int max(int x, int y){
        if (x>y){
            return x;
        } else{
            return y;
        }
    }
    public static int safeDiv(int x, int y){
        if(y==0) return 0;
        return x/y;
    }
    public static int abs(int x){
        if (x<0) x=-x;
        return x;
    }

    public static int lastNumSum(int a, int b){
        return (a%10)+(b%10);
    }
    public static boolean isEqual (int a, int b, int c){
        return a==b && b==c;
    }
    public static boolean isDivisor (int a, int b){
        return (a%b==0) || (b%a==0);
    }
    public static boolean isInRange(int a, int b, int num){
        return num>=a && num <=b || num<=a && num>=b;
    }
    public static boolean isUpperCase(char x){
        return x>='A' && x<='Z';
    }
    public static boolean is2Digits(int x){
        return x>9 && x<100;
    }

    public static boolean isPositive(int x){
        return x>0;
    }

    public static int charToNum(char x){
        return x-48;
    }
    public static double fraction(double x){
        return x-(int)x;
    }
    public static int sumLastNums(int x){
        int res = x%10;
        x=x/10;
        return x%10+res;
    }

}
