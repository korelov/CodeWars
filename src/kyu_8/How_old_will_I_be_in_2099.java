package kyu_8;

//https://www.codewars.com/kata/5761a717780f8950ce001473/train/java
public class How_old_will_I_be_in_2099 {

    public static String CalculateAge(int birth, int yearTo) {

        int old = yearTo - birth;
        String res = "";
        if (yearTo == birth) {
            res = "You were born this very year!";
        }
        if(yearTo > birth ) {
            if ((yearTo - birth)>1){
                res = "You are " + Math.abs(old) + " years old.";
            } else {
                res = "You are 1 year old.";

            }
        }
        if(yearTo < birth ) {
            if ((birth - yearTo)>1){
                res = "You will be born in " + Math.abs(old) + " years.";
            } else {
                res = "You will be born in 1 year.";

            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(CalculateAge(2012, 2013));
        System.out.println(CalculateAge(1989,2016));
        System.out.println(CalculateAge(2000,1990));
        System.out.println(CalculateAge(2011,2012));
        System.out.println(CalculateAge(2000,1999));
    }
}
