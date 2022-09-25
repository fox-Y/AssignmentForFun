package Collections;

import java.util.ArrayList;

public class ArrayLists {

    public ArrayList<Integer> addShit(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        list1.addAll(list2);

        return list1;
    }

    public Integer addShitTogether(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        Integer sum = 0;

        for(int num : list1){
            sum += num;
        }

        for(int num : list2){
            sum += num;
        }

        return sum;
    }

    public ArrayList<Integer> removeAll(ArrayList<Integer> original, Integer toRemove) {
        original.remove(toRemove);

        return original;
    }

    public boolean happyList(ArrayList<String> original) {
        int[][] hasCharacter = new int[original.size()][58];
        for(int i = 0; i < hasCharacter.length; i++){
            for(int j = 0; j < hasCharacter[0].length; j++){
                hasCharacter[i][j] = 0;
            }
        }


        for(int i = 0; i < original.size(); i++){
            String s = original.get(i);

            for(int j=0 ; j < s.length(); j++){
                if (Character.isLetter(s.charAt(j))){
                    hasCharacter[i][s.charAt(j) - 'A'] = 1;
                }
            }
        }

        for(int i = 1; i < original.size()-1; i++){
            String s = original.get(i);
            boolean happyLeft = false;
            boolean happyRight = false;

            for(int j = 0; j < s.length(); j++){
                if( happyLeft && happyRight){
                    break;
                }

                if(Character.isLetter(s.charAt(j)) && hasCharacter[i - 1][s.charAt(j) - 'A'] == 1){
                    happyLeft = true;
                }

                if(hasCharacter[i + 1][s.charAt(j) - 'A'] == 1){
                    happyRight = true;
                }
            }

            if(!happyLeft || !happyRight){
                return false;
            }
        }

        return true;
    }
}
