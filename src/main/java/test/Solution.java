package test;

public class Solution {

    public static void main(String [] args) {

        String word1 = "intention";
        String word2 = "execution";

        System.out.println(minDistance(word1,word2));
    }

    public static int minDistance(String word1, String word2) {

        int maxSize = 0;
        int sumSize = word1.length() + word2.length();

        return (sumSize - 2 * getMaxSame(word1, word2, maxSize));

    }

    public static int getMaxSame(String word1, String word2, int maxSize){

        int tempMax = 0;
        int flag = 0;

        for(int i = 0; i < word1.length(); i++){
            for(int j = flag; j < word2.length(); j++){
                if(word1.substring(i, i + 1).equals(word2.substring(j, j + 1))){
                    tempMax ++;
                    flag = j+1;
                    break;
                }
            }
            if(flag ==word2.length()) break;
        }

        if(tempMax > maxSize) maxSize = tempMax;

        if(word1.length() != 0) return getMaxSame(word1.substring(1), word2, maxSize);
        else return maxSize;
    }

}
