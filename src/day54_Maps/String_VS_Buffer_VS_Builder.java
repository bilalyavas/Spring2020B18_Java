package day54_Maps;

public class String_VS_Buffer_VS_Builder {
    public static void main(String[] args) {
        String str1 = "cybertek";
        str1.concat("School");

        System.out.println(str1);
        System.out.println("=======================");

        StringBuilder builder = new StringBuilder("Cybertek");
        builder.append(" School");

        System.out.println(builder);

        System.out.println("===========================");
        StringBuffer buffer = new StringBuffer("Cybertek");
        buffer.append(" School");

        System.out.println("buffer");
        System.out.println("===============================");

        String word = "ABCD";
        StringBuilder sb = new StringBuilder("ABCD");
        sb.reverse();
        System.out.println(sb);

        word = sb.toString();
        System.out.println(word);

    }
}
