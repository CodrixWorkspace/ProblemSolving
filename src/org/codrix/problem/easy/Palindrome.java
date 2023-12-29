package org.codrix.problem.easy;

public class Palindrome {
    public static void main(String[] args){
        int x=123;
        Boolean result=Palind(x);
        System.out.println(result);
    }
    public static Boolean Palind(int x){
        if(x<0 ||(x%10==0 && x!=0)){  //-121 121- false,100 or 10 !=0 as 01 and 001 and x!0;
            return false;
        }
        int r=0;
        while(x>r){  //1221>0  //122>1  //12>12
            r=r*10+x%10; //r=0*10+1221%10=1   //r=1*10+122%10=10+2=12
            x=x/10; //1221/10=122  //122/10=12
        }
        return r==x || r/10==x;  // if 121= r=12 x=1  then 12/10=1.2 ==1

    }
}
