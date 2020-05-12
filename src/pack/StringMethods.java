package pack;

public class StringMethods {

    public static void main (String[] args){
        String str1 = "Hello Student " + "Welcome in Java course";
        String str2 = "Welcome! ";
        String str3 = "      str      ";
        int stringCount = 50;
        String[] strCount = str1.split("\\s+");

   //     System.out.println(str1.length());
   //     System.out.println(str1.substring(3));
   //     System.out.println(str1.substring(6, 13));
   //     System.out.println(str2.equals("welcome"));
   //     System.out.println(str2.equalsIgnoreCase("welcome"));
   //     System.out.println(str1.contains("Hello"));
   //     System.out.println(str3.isEmpty());
   //     System.out.println(str2.concat(str1));
   //    System.out.println(str2.replace("W", "V"));
   //     System.out.println(str2.toLowerCase());
   //     System.out.println(str2.toUpperCase());
   //     System.out.println(str2.toLowerCase());
        System.out.println(str3.trim());
        System.out.println(String.valueOf(stringCount));
        for (String s : strCount) {
           System.out.println("Word is: " + s);
        }


    }
}
