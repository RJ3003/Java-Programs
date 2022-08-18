package com.company;

public class stringMethod {
    public static void main(String[] args) {
        String name= new String("Chainsmokers");

        int i = name.length();
        System.out.println(i);

        String lc = name.toLowerCase();   // converts the string to lower case
        System.out.println(lc);

        String uc = name.toUpperCase();  // convert the string to UPPER CASE
        System.out.println(uc);

        String trim="     Rj     ";    //trims the blank spaces
        System.out.println(trim.trim());

        System.out.println(name.substring(1)); // returns the characters from given index number

        System.out.println(name.substring(2,6));

        String new1 = "Nappy";
        System.out.println(new1.replace('p','r'));  // it replaces the old char w given new char

        System.out.println(name.startsWith("Chain"));
        System.out.println(name.charAt(6));
        System.out.println(name.indexOf("i"));
        System.out.println(name.lastIndexOf("s"));
        System.out.println(name.equalsIgnoreCase("cHaiNsmokeRs"));




    }
}
