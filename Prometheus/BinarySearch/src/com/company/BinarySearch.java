package com.company;

public class BinarySearch {

    public static void main(String[] args) {
        int data[] = {101, 8, 23, 42, 56, 61, 67, 72, 73, 88, 90};
        int numberToFind = 101;

        boolean flag = true;
        int i = data.length/2;
        for(int j = 0; j<=data.length; j++){
            if(numberToFind==data[i]){
                flag = false;
                if (i != 0 && data[i] == data[i-1]) {
                    i--;

                }
            }
            else if(data[i]<numberToFind){
                i=i+((data.length-i)/2);
            }
            else{
                i=i-(i/2);
            }
        }
        if(!flag){
            System.out.print(i);
        }else{
            System.out.print(-1);
        }
        // PUT YOUR CODE HERE
        }
    }

