package leetcode;

import java.util.ArrayList;
import java.util.List;

public class CriancasComDoces {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> moreCandies = new ArrayList<>();
        int biggerValue = candies[0];
        for(int i = 1; i < candies.length; i++){
            if(biggerValue < candies[i]){
                biggerValue = candies[i];
            }
        }
        for(int i = 0; i < candies.length; i++){
            if((candies[i] + extraCandies) >= biggerValue){
                moreCandies.add(true);
            }else {
                moreCandies.add(false);
            }
        }
        return moreCandies;
    }

    public static void main(String[] args) {
        CriancasComDoces criancasComDoces = new CriancasComDoces();
        int [] doces = {1,4,6,3};

        System.out.println(criancasComDoces.kidsWithCandies(doces, 3));
    }
}
