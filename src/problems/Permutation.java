package problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
        permutation("ABC");

    }
    public static void permutation(String input){
        permutation("", input);
    }
    public static void permutation(String perm,String word){
        if(word.length() ==0){
            System.out.println(perm);
        }
        for(int i = 0; i< word.length(); i++){
            permutation(perm + word.charAt(i), word.substring(0,i) + word.substring(i + 1, word.length()));
        }
    }
}
