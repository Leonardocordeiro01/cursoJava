public class Aula17FunsoesStrings {
      public static void main(String[] args){
        String original =  "abcde FGHIJ ABCD abc DEFG   ";

        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(2);
        String s05 = original.substring(2, 9);
        String s06 = original.replace('a', 'x');
        String s07 = original.replace("abc", "xy");
        int i = original.indexOf("bc");
        int j = original. lastIndexOf("bc");

        System.out.println("Original: -" + original + "-");
        System.out.println("toLowerCase: -" +s01+ "-");
        System.out.println("toUpperCase: -" +s02+ "-");
        System.out.println("trim: -" +s03+ "-");
        System.out.println("substring(2): -" +s04+ "-");
        System.out.println("subtring(2, 9): -" +s05+ "-");
        System.out.println("replace('a', 'x'): -" +s06+ "-");
        System.out.println("replace('abc', 'xy'): -" +s07+ "-");
        System.out.println("index of 'bc': " +i);
        System.out.println("last index of 'bc'>: "+j);

        //operação split
        String s = "potato apple lemon";

        String[] vect = s.split(" ");

        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
    }
}
