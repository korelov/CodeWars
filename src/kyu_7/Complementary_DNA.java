package kyu_7;

//https://www.codewars.com/kata/554e4a2f232cdd87d9000038/solutions/java

public class Complementary_DNA {
    public static String makeComplement(String dna) {

        StringBuilder str = new StringBuilder();
        for (int i = 0; i < dna.length(); i++) {
            if (dna.charAt(i) == 'A') {
                str.append("T");
            } else if (dna.charAt(i) == 'T') {
                str.append("A");
            } else if (dna.charAt(i) == 'C') {
                str.append("G");
            } else if (dna.charAt(i) == 'G') {
                str.append("C");
            } else {
                str.append(dna.charAt(i));
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {

        System.out.println(makeComplement("AAAA"));
        System.out.println(makeComplement("ATTGC"));
    }
}
