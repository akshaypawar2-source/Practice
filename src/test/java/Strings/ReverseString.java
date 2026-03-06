package Strings;

public class ReverseString {

    public static void main(String[] args) {
      String s= "";
      System.out.println(reverseString(s));

    }

     public static String reverseString(String input){

        String reverseString= "";
        if (input == null || input.isEmpty()){
              return input;
         }
        for (int i =input.length()-1;i>=0;i--){

            reverseString += input.charAt(i);
        }
          return reverseString;


     }

}
