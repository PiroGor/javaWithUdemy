package streamUdemy;

import java.util.List;

public class FP02Structured {

    public static void main(String[] args){


        List<Integer> numbers = List.of(12,3,44,5,77,32,6,12,4);

        int sum= addListFunctional(numbers);

        System.out.println(sum);
    }

    private static int sum(int a,int b){
        return a+b;
    }

    private static int addListFunctional(List<Integer> numbers){
        return numbers.stream()
                .reduce(0,FP02Structured::sum);
//        int sum=0;
//        for(int number:numbers){
//            sum+=number;
//        }
//        return sum;
    }

    
}