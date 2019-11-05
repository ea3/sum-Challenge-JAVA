package com.emilioaraos;

public class Main {

    public static void main(String[] args) {

        int count = 0;
        int sumValue = 0;
        for(int i= 1; i<=1000; i++){

            if(   (i% 3==0)   &&   (i%5 ==0)   ){

                System.out.println("This number is divisible by 3 and 5: "+ i);

                count++;
                sumValue+=i;
                System.out.println(sumValue);


                if (count == 5){
                    System.out.println("Exiting loop");
                    break;
                }


            }
        }

    }
}
