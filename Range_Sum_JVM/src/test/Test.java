/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;
import java.math.BigInteger;
import java.util.Scanner;
import smz.sumsz;
import matcher.mtch;
/**
 *
 * @author acherontas
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //it uses the 'range' of a number in four positions
    //then its summarize the result as one digit in a specific fixed array
    //passes in matcher class
    //each number has four position
    //the number 4 has four position
    //4 5 6 7
    //3 4 5 6
    //2 3 4 5
    //1 2 3 4
    //with summary array numbers of {4,9,5,1}
    //it attempts to find the main number sum of digit
    //through these ranges
        Scanner console=new Scanner(System.in);
        System.out.println("Enter a number ");
        sumsz sz=new sumsz();
        BigInteger x;
        x=console.nextBigInteger();
        int[] gnr=new int[4];
        BigInteger[] arr_one=new BigInteger[4];
        arr_one[0]=x;
        arr_one[1]=x.add(BigInteger.ONE);
        arr_one[2]=arr_one[1].add(BigInteger.ONE);
        arr_one[3]=arr_one[2].add(BigInteger.ONE);
        System.out.print(arr_one[0]+ " " + arr_one[1]+ " " + arr_one[2]+ " " + arr_one[3]);
        BigInteger sum_one=arr_one[0].add(arr_one[1]);
        sum_one=sum_one.add(arr_one[2]);
        sum_one=sum_one.add(arr_one[3]);
        int lri=sz.get_the_sum(sum_one.toString());
        System.out.println(" : " + sum_one + " ------> " + lri);
        gnr[0]=lri;
        BigInteger[] arr_two=new BigInteger[4];
        arr_two[0]=x.subtract(BigInteger.ONE);
        arr_two[1]=x;
        arr_two[2]=x.add(BigInteger.ONE);
        arr_two[3]=arr_two[2].add(BigInteger.ONE);
        sz.get_the_sum_number=0;
        System.out.print(arr_two[0]+ " " + arr_two[1]+ " " + arr_two[2]+ " " + arr_two[3]);
        BigInteger sum_two=arr_two[0].add(arr_two[1]);
        sum_two=sum_two.add(arr_two[2]);
        sum_two=sum_two.add(arr_two[3]);
        int mri=sz.get_the_sum(sum_two.toString());
        System.out.println(" : " + sum_two + " ------> " + mri);   
        gnr[1]=mri;
        BigInteger[] arr_three=new BigInteger[4];
        arr_three[0]=x.subtract(BigInteger.valueOf(2));
        arr_three[1]=x.subtract(BigInteger.ONE);
        arr_three[2]=x;
        arr_three[3]=arr_three[2].add(BigInteger.ONE);
        sz.get_the_sum_number=0;
        System.out.print(arr_three[0]+ " " + arr_three[1]+ " " + arr_three[2]+ " " + arr_three[3]);
        BigInteger sum_three=arr_three[0].add(arr_three[1]);
        sum_three=sum_three.add(arr_three[2]);
        sum_three=sum_three.add(arr_three[3]);
        int mria=sz.get_the_sum(sum_three.toString());
        System.out.println(" : " + sum_three + " ------> " + mria);
        gnr[2]=mria;
        BigInteger[] arr_four=new BigInteger[4];
        arr_four[0]=x.subtract(BigInteger.valueOf(3));
        arr_four[1]=x.subtract(BigInteger.valueOf(2));
        arr_four[2]=x.subtract(BigInteger.ONE);
        arr_four[3]=x;
        sz.get_the_sum_number=0;
        System.out.print(arr_four[0]+ " " + arr_four[1]+ " " + arr_four[2]+ " " + arr_four[3]);
        BigInteger sum_four=arr_four[0].add(arr_four[1]);
        sum_four=sum_four.add(arr_four[2]);
        sum_four=sum_four.add(arr_four[3]);
        int mriaa=sz.get_the_sum(sum_four.toString());
        System.out.println(" : " + sum_four + " ------> " + mriaa);
        gnr[3]=mriaa;
        mtch  mt=new mtch();
        int mti=mt.match_them(gnr);
        sz.get_the_sum_number=0;
        int lry=sz.get_the_sum(x.toString());
        System.out.println("main number " + lry + " vs range number " + mti);
    }   
}
