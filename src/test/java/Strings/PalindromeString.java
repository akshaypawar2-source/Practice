package Strings;

public class PalindromeString {

    public static void main(String[] args) {
        String s = "Automation";
        String reverse = "";
         if (s.isEmpty()){
             System.out.println("please enter a valid string");
         }
        for (int i = s.length()-1; i>=0; i --){

            reverse += s.charAt(i);
        }

        if (s.equals(reverse)){
            System.out.print("String "+ s + " is palindrome");
        }
        else  {
            System.out.print("String "+ "\""+ s +"\"" +" is not palindrome");
        }
    }
}
