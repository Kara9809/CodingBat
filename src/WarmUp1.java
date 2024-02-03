public class WarmUp1 {
/*
    Ex.1 The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
         We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
         sleepIn(false, false) → true
         sleepIn(true, false) → false
         sleepIn(false, true) → true
*/

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return (!weekday || vacation);
    }
// ---------------------------------------------------------------------------------------------------------
/*
    Ex.2 Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
         diff21(19) → 2
         diff21(10) → 11
 */

    public static int diff21(int n) {
        if (n <= 21) {
            return 21 - n;
        } else {
            return (n - 21) * 2;
        }
    }
// ---------------------------------------------------------------------------------------------------------

/*
    Ex.3 Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.
         nearHundred(93) → true
         nearHundred(90) → true
 */

    public static boolean nearHundred(int n) {
        return ((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10));
    }
// ---------------------------------------------------------------------------------------------------------

/*
    Ex.4 Given a non-empty string and an int n, return a new string where the char at index n has been removed.
         The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).
         missingChar("kitten", 1) → "ktten"
         missingChar("kitten", 0) → "itten"
 */
// ---------------------------------------------------------------------------------------------------------

    public static String missingChar(String str, int n) {
        String front = str.substring(0, n);
        String back = str.substring(n + 1, str.length());
        return front + back;
    }
// ---------------------------------------------------------------------------------------------------------
/*
    Ex.5 Given a string, take the last char and return a new string with the last char added at the front and back,
         so "cat" yields "tcatt". The original string will be length 1 or more.
         backAround("cat") → "tcatt"
         backAround("Hello") → "oHelloo"
*/
// ---------------------------------------------------------------------------------------------------------

    public static String backAround(String str) {
        String last = str.substring(str.length() - 1);
        return last + str + last;
    }
// ---------------------------------------------------------------------------------------------------------

/*
    Ex.6 Given a string, return true if the string starts with "hi" and false otherwise.
           startHi("hi there") → true
           startHi("hi") → true
*/
// ---------------------------------------------------------------------------------------------------------

    public static boolean startHi(String str) {
        if (str.length() < 2) {
            return false;
        }
        String firstTwo = str.substring(0, 2);
        return firstTwo.equals("hi");
    }
// ---------------------------------------------------------------------------------------------------------

    /*
    Ex.7 We'll say that a number is "teen" if it is in the range 13..19 inclusive.
         Given 3 int values, return true if 1 or more of them are teen.
         hasTeen(13, 20, 10) → true
         hasTeen(20, 19, 10) → true
    */

    public static boolean hasTeen(int a, int b, int c) {
        return (a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19);
    }
// ---------------------------------------------------------------------------------------------------------

/*
    Ex. 8 Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.
          mixStart("mix snacks") → true
          mixStart("pix snacks") → true
 */

    public static boolean mixStart(String str) {
        if (str.length() < 3) {
            return false;
        }
        String ix = str.substring(1, 3);
        return (ix.equals("ix"));
    }
// ---------------------------------------------------------------------------------------------------------

    /*
        Ex.9 Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie.
        Note that Math.abs(n) returns the absolute value of a number.
        close10(8, 13) → 8
        close10(13, 8) → 8
     */
    public static int close10(int a, int b) {
        int aDiff = Math.abs(a - 10);
        int bDiff = Math.abs(b - 10);

        if (aDiff < bDiff) {
            return a;
        }
        if (bDiff < aDiff) {
            return b;
        }
        return 0;  // i.e. aDiff == bDiff
    }
// ---------------------------------------------------------------------------------------------------------

    /*
    Ex.10 Return true if the given string contains between 1 and 3 'e' chars.
    stringE("Hello") → true
    stringE("Heelle") → true
     */

    public static boolean stringE(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e')
                count++;
        }
        return (count >= 1 && count <= 3);
    }
}





