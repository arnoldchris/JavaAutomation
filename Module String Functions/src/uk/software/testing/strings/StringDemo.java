package uk.software.testing.strings;

public class StringDemo {
    public static void main(String[] args) {
        String str="   Java ";
        String str2="   Programming    ";
        int length= str.length();
        System.out.println("The length of the string "+ str + " is "+length);
        String str3=str.concat(str2);

        System.out.println(str3);
    }
}
