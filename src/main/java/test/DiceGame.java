package test;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.*;


public class DiceGame {

    public static void main(String[] args) {

        List<Integer> customerDice = Arrays.asList(4, 4, 4);
        List<Integer> resultDice;
        Integer buyTimes = 1000;
        Integer missCount = 0;
        Integer winCount = 0;

        Collections.sort(customerDice);

        for (int i = 0; i < buyTimes; i++) {

            resultDice = rollDice(customerDice, missCount);

            if(resultDice.equals(customerDice)){
                missCount = 0;
                //System.out.println("win!");
                winCount ++;
            }
            else {
                missCount ++;
                //System.out.println("Lose!");
            }
        }


        System.out.println("Win Rate = "+ (double)winCount/buyTimes *100 + "%");
    }

    public static List<Integer> rollDice(List<Integer> customerDice, Integer missCount) {

        List<Integer> resultDice = new ArrayList<>();
        DecimalFormat format = new DecimalFormat("0.000000");

        /**計算點數的權重**/
        List<Double> weights = getWeight(customerDice,missCount);

        /**若權重<0，表示臉太黑，直接保底**/
        for(Double weight:weights){
            if(weight<=0) return customerDice;
        }

        /**產生點數**/
        Random random = new Random();
        Double tempSum;
        Double seeds;

        for (int i = 0; i < 3; i++) {
            tempSum = 0.0;
            seeds = random.nextDouble();

            for (int j = 0; j <6; j++) {
                tempSum+=weights.get(j);

                if (seeds<=tempSum) {
                    //System.out.println(format.format(seeds) +" "+ format.format(tempSum));
                    resultDice.add(j + 1);
                    break;
                }
            }
        }
        //System.out.println(customerDice + " " + resultDice + "\n");

        Collections.sort(resultDice);
        return resultDice;
    }

    public static List<Double> getWeight(List<Integer> customerDice, Integer missCount) {

        DecimalFormat format = new DecimalFormat("0.000000");

        List<Double> weights = Arrays.asList(1 / 6d, 1 / 6d, 1 / 6d, 1 / 6d, 1 / 6d, 1 / 6d);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                if (j == customerDice.get(i) - 1) {
                    weights.set(j, weights.get(j) + 0.0001 * missCount);
                } else {
                    weights.set(j, weights.get(j) - ((0.0011 * missCount) / 5.0));
                }
            }
        }

//        weights.forEach(
//                x->System.out.print(format.format(x) + " ")
//        );
//        System.out.println(weights.stream().mapToDouble(Double::doubleValue).sum());
//        System.out.println();

        return weights;
    }


}