package DansDilemma;

import java.util.*;

public class DansDilemma {

    public Integer dilemmaOfTwo(Double input1, Double input2) {
        Set<Double> set = new HashSet<>();

        set.add(input1 * input2);
        set.add(input1 + input2);

        set.add(input1 - input2);
        if(input2 != 0) set.add(input1 / input2);

        set.add(input2 - input1);
        if(input1 != 0) set.add(input2 / input1);

        return set.size();
    }

    public Integer dilemmaOfThree(Double input1, Double input2, Double input3) {
        double[] args = new double[]{input1, input2, input3};

        Set<Double> res = new HashSet<>();

        for(int i = 0; i < args.length; i++){
            double leftNum = args[i];

            for(int j = i + 1; j < args.length; j++){
                double rightNum = args[j];

                res.add(leftNum + rightNum);
                res.add(leftNum * rightNum);

                res.add(leftNum - rightNum);
                if(rightNum != 0 ) res.add(leftNum / rightNum);

                res.add(rightNum - leftNum);
                if(leftNum != 0) res.add(rightNum / leftNum);
            }
        }

        return res.size();
    }

    public Integer dilemmaOfN(Double... args){

        Set<Double> res = new HashSet<>();

        for(int i = 0; i < args.length; i++){
            double leftNum = args[i];

            for(int j = i + 1; j < args.length; j++){
                double rightNum = args[j];

                res.add(leftNum + rightNum);
                res.add(leftNum * rightNum);

                res.add(leftNum - rightNum);
                if(rightNum != 0 ) res.add(leftNum / rightNum);

                res.add(rightNum - leftNum);
                if(leftNum != 0) res.add(rightNum / leftNum);
            }
        }

        return res.size();
    }
}
