package com.epam.rd.java.basic.practice1;

@SuppressWarnings("all")
public class Part6 {

    // This method isn't empty
    public static void main(String[] args) {

        int[] number = new int[Integer.parseInt(args[0])];
        int prost = 2;
        int mas = 0;
        StringBuilder stringBuilder = new StringBuilder();
        while(number[number.length-1] == 0){
            int divisorCounter = 0;
            for(int i = 2; i <= prost; i++){
                if((prost % i) == 0){
                    divisorCounter++;
                }
            }
            if(divisorCounter < 2){
                number[mas] = prost;
                mas++;
                stringBuilder.append(prost).append(" ");
            }
            prost++;
        }
        System.out.println(stringBuilder.toString().substring(0, stringBuilder.toString().length() - 1));
    }
	
}
