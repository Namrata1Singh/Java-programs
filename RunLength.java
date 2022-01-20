package com.company;

public class RunLength {
    public String encoding(String toEncode){
        int count = 1;
        StringBuilder encodingString = new StringBuilder();
        for(int currentchar = 1;currentchar <= toEncode.length(); ++currentchar){
            if(currentchar == toEncode.length() || toEncode.charAt(currentchar) != toEncode.charAt(currentchar-1)){
               encodingString.append(count);
               encodingString.append(toEncode.charAt(currentchar-1));
               count = 1;
            }
            else{
                ++count;
            }
        }
        return encodingString.toString();
    }

    public static void main(String[] args) {
        RunLength runLength = new RunLength();

        String t1 = "AAAADDDCC";
        System.out.println("RLE of "+ t1 +":"+ runLength.encoding(t1));
    }
}
