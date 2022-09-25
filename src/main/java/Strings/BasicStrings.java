package Strings;

public class BasicStrings {

    public String flipConcat(String string1, String string2) {
        return string2 + string1;
    }

    public char getChar(String string, int index) {
        return string.charAt(index);
    }

    public String iCantSee(String string) {
        StringBuilder res = new StringBuilder();

        for(int i = 0; i < string.length(); i++){
            res.append(" ");
        }

        return res.toString();
    }

    public String loudAndClear(String string) {
        StringBuilder res = new StringBuilder();

        for(int i = 0; i < string.length(); i++){
            res.append(Character.toUpperCase(string.charAt(i)));
        }

        return res.toString();
    }

    public String reverseCase(String string) {
        StringBuilder res = new StringBuilder();

        for(int i = 0; i < string.length(); i++){
            char ch = string.charAt(i);

            if( Character.isLetter(ch) ){
                if( Character.isLowerCase(ch) ){
                    res.append(Character.toUpperCase(ch));
                }else {
                    res.append(Character.toLowerCase(ch));
                }
            }else{
                res.append(ch);
            }
        }
        return res.toString();
    }

    public String oneAtATime(String string1, String string2) {
        StringBuilder res = new StringBuilder();
        int index1 = 0, index2 = 0;

        for(int i = 0; i < string1.length() + string2.length(); i++){
            if( index1 >= string1.length() && index2 < string2.length() ){
                res.append(string2.substring(index2));
                break;
            }

            if( index2 >= string2.length() && index1 < string1.length() ){
                res.append(string1.substring(index1));
                break;
            }

            if( i % 2 == 0 ){
                res.append(string1.charAt(index1 ++));
            }else {
                res.append(string2.charAt(index2 ++));
            }
        }
        return res.toString();
    }
}
