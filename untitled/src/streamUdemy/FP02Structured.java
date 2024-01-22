package streamUdemy;

import java.util.List;

public class FP02Structured {

    public static void main(String[] args){


        List<Integer> numbers = List.of(12,3,44,5,77,32,6,12,4);

//        0 12
//        12 3
//        15 44
//        59 5
//        64 77
//        141 32
//        173 6
//        179 12
//        191 4
//        195

        int sum= addListFunctional(numbers);

        System.out.println(sum);

    }

    private static int sum(int aggregate,int nextNumber){
        System.out.println(aggregate+" "+nextNumber);
        return aggregate+nextNumber;
    }

    private static int addListFunctional(List<Integer> numbers){
        return numbers.stream()
                .reduce(0,Integer::sum);
//                .reduce(0,(x,y) -> x+y);
//                .reduce(0,FP02Structured::sum);
//        int sum=0;
//        for(int number:numbers){
//            sum+=number;
//        }
//        return sum;
    }

    
}