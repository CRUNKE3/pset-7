public class ProblemSet7 {
    public static void main(String[] args) {

    }

    /*
     * Exercise 1.
     *
     * Given two strings, return a new string built by surrounding in with the first
     * and last two characters of out.
     */
    public String surroundMe(String in, String out) {
        if (in != null && out != null && out.length() == 4) {
            String out1 = out.substring(0, 2);
            String out2 = out.substring(2);
            in = out1 + in + out2;
        }
        return in;
    }

    /*
     * Exercise 2.
     *
     * Given a string and an integer, return a new string that represents the first
     * and last n characters of text (overlapping, as needed).
     */
    public String endsMeet(String text, int n) {
        String output = text;
        if (text != null && n >=1 && n<=text.length() && text.length()<=10) {
            String output1 = text.substring(0, n);
            String output2 = text.substring(text.length()-(n));
            output = output1 + output2;
        }
        return output;
    }

    /*
     * Exercise 3.
     *
     * Given a string, return a new string using the middle three characters of text.
     */
    public String middleMan(String text) {
        String output = text;
        int length = text.length();
        if (text != null && text.length()>=3 && text.length()%2==1) {
            length = (text.length()/2)+1;
            output = text.substring(length-2, length+1);
        }
        return output;
    }

    /*
     * Exercise 4.
     *
     * Given two strings, determine whether or not target is equivalent to the middle
     * three characters of text.
     */
    public boolean isCentered(String text, String target) {
        boolean output = false;
        int length = text.length();
        if (text != null && text.length()>=3 && text.length()%2==1 && target.length()==3) {
            length = (text.length()/2)+1;
            String subText = text.substring(length-2, length+1);
            if (target.equals(subText))
            output = true;

        }
        return output;
    }

    /*
     * Exercise 5.
     *
     * Given a string and a character, compute the number of words that end in suffix.
     */
    public int countMe(String text, char suffix) {
        int count = 0;
        boolean check = false;
        switch (suffix) {
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'g':
            case 'h':
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'o':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'u':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                check = true;
                break;
            default:
                break;
        }
        if (text != null && check) {
            String[] words = text.split(" ");
            for(int i = 0; i<=words.length; i++) {
                String[] letters = words[i].split("");
                if (letters[words[i].length()-1].equals(String.valueOf(suffix))) {
                    count++;
                }

            }
            return count;
        } else {
            return -1;
        }

    }

    /*
     * Exercise 6.
     *
     * Given a string, compute the number of triplets in text.
     */
    public int triplets(String text) {
        String[] letters = text.split("");
        int count = 0;
        if (text != null) {
            for (int i = 0; i<text.length()-2; i++) {
                if (letters[i].equals(letters[i+1])){
                    if (letters[i+1].equals(letters[i+2])) {
                       count++;
                   }
                }
            }
        } else {
            count = -1;
        }

        return count;
    }

    /*
     * Exercise 7.
     *
     * Given a string, compute the sum of the digits in text.
     */
    public long addMe(String text) {
        int total = 0;
        String[] chars = text.split("");
        if (text != null) {
            for(int i = 0; i<text.length(); i++) {
                switch(chars[i]) {
                    case "1":
                        total += 1;
                        break;
                    case "2":
                        total += 2;
                        break;
                    case "3":
                        total += 3;
                        break;
                    case "4":
                        total += 4;
                        break;
                    case "5":
                        total += 5;
                        break;
                    case "6":
                        total += 6;
                        break;
                    case "7":
                        total += 7;
                        break;
                    case "8":
                        total += 8;
                        break;
                    case "9":
                        total += 9;
                        break;
                    default:
                        break;
                }
            }
        } else {
            total = -1;
        }
        return total;


    }

    /*
     * Exercise 8.
     *
     * Given a string, compute the length of the longest sequence.
     */
    public long sequence(String text) {
        String[] chars = text.split("");
        int count = 0;
        int max = 0;
        if (text != null) {
            for (int i = 0; i<text.length(); i++) {
                if (chars[i].equals(chars[i+1])) {
                    count++;
                    if (count > max) {
                        max = count;
                    }
                } else {
                    count = 0;
                }
            }
            return max;
        } else if (text.equals("")) {
            return 0;
        } else {
            return -1;
        }

    }

    /*
     * Exercise 9.
     *
     * Given two strings, return a new string built by intertwining each of the
     * characters of a and b.
     */
    public String intertwine(String a, String b) {
        String[] aList = a.split("");
        String[] bList = b.split("");
        String ab = "";
        int smallest;
        if(a != null && b != null) {
            if (aList.length > bList.length) {
                smallest = bList.length;
            } else if (bList.length > aList.length) {
                smallest = aList.length;
            } else {
                smallest = aList.length;
            }

            for (int i = 0; i < smallest; i++) {
                ab = ab.concat(aList[i] + bList[i]);
            }

            if (aList.length > bList.length) {
                for (int j = smallest - (aList.length - bList.length); j < aList.length; j++) {
                    ab = ab.concat(aList[j]);
                }
            } else {
                for (int j = smallest - (bList.length - aList.length); j < bList.length; j++) {
                    ab = ab.concat(bList[j]);
                }
            }
            return ab;
        } else {
            return null;
        }
    }

    /*
     * Exercise 10.
     *
     * Given a string, determine whether or not it is a palindrome.
     */
    public boolean isPalindrome(String text) {
        boolean check = false;
        int length = text.length();
        String[] letters = text.split("");

        if (text != null) {
            for (int i = 0; i<(length/2)+1; i++) {
                if (letters[i].equals(letters[length-(i+1)])) {
                    check = true;
                } else {
                    check = false;
                    break;
                }
            }
        }
        return check;
    }
}
