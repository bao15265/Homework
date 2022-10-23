package com.b3string;

import java.text.DecimalFormat;
import java.util.*;

public class StringExercise {
    private char upperC;
    private int count = 0;
    private String str;

    public void setStr(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    //ex 1.1, line 3
    public String addString(String str1, String str2) {
        return str1.concat(str2);
    }

    //ex 1.2, line 5
    public String upperCase(String str) {
        return str.toUpperCase();
    }

    //ex 1.3, line 7
    public int countUpperCase(String str) {
        for (int i = 0; i < str.length(); i++) {
            upperC = str.charAt(i);
            if (Character.isUpperCase(upperC)) {
                count++;
            }
        }
        return count;
    }

    //ex 1.4, line 9
    public int countNumber(String str) {
        for (int i = 0; i < str.length(); i++) {
            upperC = str.charAt(i);
            if (Character.isDigit(upperC)) {
                count++;
            }
        }
        return count;
    }

    //ex 1.5, line 11
    public List<Character> printOddIndex(String str) {
        List<Character> indexList = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 1) {
                indexList.add(str.charAt(i));
            }
        }
        return indexList;
    }

    //ex 1.6, line 13
    public List<Character> printSpecialChar(String str) {
        List<Character> specList = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            upperC = str.charAt(i);
            if (!Character.isLetterOrDigit(upperC) && !Character.isWhitespace(upperC)) {
                specList.add(upperC);
            }
        }
        return specList;
    }

    //ex 1.7, line 15
    public String removeFirstSpace(String str) {
        return str.stripLeading();
    }

    //ex 1.8, line 17
    public int countLowerCase(String str) {
        for (int i = 0; i < str.length(); i++) {
            upperC = str.charAt(i);
            if (Character.isLowerCase(upperC)) {
                count++;
            }
        }
        return count;
    }

    //ex 1.9, line 19
    public String sub2toE(String str) {
        return str.substring(2);
    }

    //ex 1.92, line 21
    public List<Integer> printNumber(String str) {
        List<Integer> arl = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            upperC = str.charAt(i);
            if (Character.isDigit(upperC)) {

                int num = Character.getNumericValue(upperC);
                arl.add(num);
            }
        }
        return arl;
    }

    //ex 1.91, line 23
    public String sub2to8(String str) {
        return str.substring(2, 8);
    }

    //ex 2, line 25
    public Map<Character, Integer> countKey(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            map.merge(c, 1, Integer::sum);
        }
        return map;
    }

    //ex 2.1, line 29
    public Map<String, Integer> countCharAndNum(String str) {
        HashMap<String, Integer> map = new HashMap<>();
        int charNum = 0;
        int digitNum = 0;
        for (int i = 0; i < str.length(); i++) {
            upperC = str.charAt(i);
            if (Character.isDigit(upperC)) {
                digitNum++;
            } else if (Character.isLetter(upperC)) {
                charNum++;
            }
        }
        map.put("chu", charNum);
        map.put("so", digitNum);
        return map;
    }

    //ex 3, line 31
    public List<Character> printIndex243(String str) {
        List<Character> tft = new ArrayList<>();
        tft.add(str.charAt(2));
        tft.add(str.charAt(4));
        tft.add(str.charAt(3));
        return tft;
    }

    //ex 4, line 33
    public String replaceChar(String str) {
        char key = 0;
        upperC = str.charAt(count);
        for (int i = 1; i < str.length(); i++) {
            if (upperC == str.charAt(i)) {
                key = upperC;
                break;
            } else {
                count++;
            }
        }
        return str.substring(0, count + 1) + str.substring(count + 1).replace(key, '$');
    }

    //ex 5, line 37
    public String swapTwoString(String str1, String str2) {
        str = str2.substring(0, 2) + str1.substring(2) + " " + str1.substring(0, 2) + str2.substring(2);
        return str;
    }

    //ex 6, line 41
    public String addLying(String str) {
        String last;
        int num = this.str.length();
        if (num < 3) {
            this.str = str;
        } else {
            last = str.substring(num - 3);
            if ("ing".equals(last)) {
                this.str = str + "ly";
            } else {
                this.str = str + "ing";
            }
        }
        return this.str;
    }

    //ex 8, line 47
    public String printLongestWord(String[] array) {
        int max = array[0].length();
        for (String s : array) {
            if (s.length() > max) {
                max = s.length();
                str = s;
            }
        }
        return "Longest word: " + str + "\nLength of the longest word: " + max;
    }

    //ex 10, line 52
    public String swapFirstAndLast(String str) {
        int num = str.length();
        String newStr;
        newStr = str.substring(num - 1) + str.substring(1, num - 1) + str.substring(0, 1);
        return newStr;
    }

    //ex 11, line 56
    public StringBuilder removeOddIndex(String str) {
        StringBuilder bld = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 1) {
                continue;
            }
            bld.append(str.charAt(i));
        }
        return bld;
    }

    //ex 13, line 58
    public String printUpperAndLower() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tu can nhap?");
        str = sc.nextLine();
        return str.toUpperCase() + " " + str.toLowerCase();
    }

    //ex 14, line 60
    public String printUniqueWord() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chuoi can nhap?");
        str = sc.nextLine();
        String[] arrayStr = str.split(", ");
        Arrays.sort(arrayStr);
        arrayStr[count] = arrayStr[0];
        for (int i = 0; i < arrayStr.length; i++) {
            if (!arrayStr[count].equals(arrayStr[i])) {
                count++;
                arrayStr[count] = arrayStr[i];
            }
        }
        String[] newArray = Arrays.copyOf(arrayStr, count + 1);
        return Arrays.toString(newArray);
    }

    //ex 15, line 65
    public String addTag(String str1, String str2) {
        String[] htmlTag = {"i", "b", "span", "a"};
        for (String s : htmlTag) {
            if (str1.equals(s)) {
                str = String.format("<%s>%s<%s>", str1, str2, str1);
                break;
            } else {
                str = String.format("%s not match html tag", str1);
            }
        }
        return str;
    }

    //ex 20, line 72
    public String reverserFour(String str) {
        String reverse = new StringBuffer(str).reverse().toString();
        if (str.length() % 4 == 0) {
            this.str = reverse;
        }
        return reverse;
    }

    //ex21, line 74
    public String upperAll(String str) {
        if (str.length() < 4) {
            System.out.println("error input");
        } else {
            String checkStr = str.substring(0, 4);
            for (int i = 0; i < checkStr.length(); i++) {
                upperC = checkStr.charAt(i);
                if (Character.isUpperCase(upperC)) {
                    count++;
                }
            }
            if (count == 2) {
                this.str = str.toUpperCase();
            }
        }
        return this.str;
    }

    //ex 23, line 76
    public String removeLine(String str) {
        return str.replace("\n", "").replace("\r", "");
    }

    //ex 24, line 78
    public void checkString(String str, Character upperC) {
        if (str.charAt(0) != upperC) {
            System.out.println("String doesn't start with " + upperC);
        } else {
            System.out.println("String starts with " + upperC);
        }
    }

    //ex 27, line 80
    public String removeIndent(String str) {
        return str.indent(-100);
    }

    //ex 28, line 82
    public String addPrefix(String str, String prefix) {
        String newStr = prefix + str.indent(-100).replace("\n", "\n" + prefix);
        count = newStr.length();
        int num = prefix.length();
        return newStr.substring(0, count - num);
    }

    //ex 36, line 84
    public String getPercent(Double num) {
        DecimalFormat df = new DecimalFormat("#.##");
        String rtNum = df.format(num);
        return rtNum + "%";
    }

    //ex 37, line 86
    public String getAlign(String str) {
        count = str.length() + 10;
        String left = String.format("%-" + count + "s", str);
        String center = String.format("%" + (count - 5) + "s", str) + String.format("%" + 5 + "s", "");
        String right = String.format("%" + count + "s", str);
        return "Left  |" + left + "|" +
                "\nCenter|" + center + "|" +
                "\nRight |" + right + "|";
    }

    //ex 40, line 88
    public String reverseString(String str) {
        StringBuilder sbl = new StringBuilder(str);
        return String.valueOf(sbl.reverse());
    }

    //ex 44, line 90
    public void printIndexChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(String.format("Current character %c position at %d", str.charAt(i), i));
        }
    }

    //ex 46, line 100
    public List<String> convertToWord(String str) {
        return List.of(str.strip().split(" +"));
    }

    //ex 57, line 105
    public StringBuilder removeSpaces(String str) {
        StringBuilder sbl = new StringBuilder();
        String[] list = str.strip().split(" +");
        for (String s : list) {
            sbl.append(s);
        }
        return sbl;
    }

    //ex 58, line 107
    public StringBuilder moveSpaceToFirst(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        StringBuilder sbl = new StringBuilder();
        sbl.append(" ".repeat(Math.max(0, count)));
        String[] list = str.strip().split(" +");
        for (String s : list) {
            sbl.append(s);
        }
        return sbl;
    }

    //ex 59, line 109
    public void checkString(String str) {
        if (str == null || str.length() == 0) {
            System.out.println("This string is null or empty");
        } else {
            System.out.println("This string is neither null nor empty");
        }
    }

    //line 117
    public String printQuote(String str) {
        return String.format("\"%s\"", str);
    }

    //line 119
    public String GlueString() {
        String tech = "tech";
        String dot = ".";
        String io = "io";
        return "http://" + tech + dot + io + "/";
    }

    //ex 105, line 128
    public String countString(String str1, String str2) {
        int index = 0;
        while ((index = str1.indexOf(str2, index)) != -1) {
            index += str2.length();
            count++;
        }
        return String.format("%s has occured %d times in '%s'", str2, count, str1);
    }

    //ex 102, line 131
    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public static boolean isLong(String s) {
        try {
            Long.parseLong(s);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public static boolean isDouble(String s) {
        try {
            Double.parseDouble(s);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public static boolean isFloat(String s) {
        try {
            Float.parseFloat(s);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public String convertString(String str) {
        if (isInteger(str)) {
            this.str = String.format("%s as int is %d and as Integer is %d", str, Integer.parseInt(str), Integer.parseInt(str));
        } else if (isLong(str)) {
            this.str = String.format("%s as long is %d and as Long is %d", str, Long.parseLong(str), Long.parseLong(str));
        } else if (isFloat(str)) {
            this.str = String.format("%s as float is %f and as Long is %f", str, Float.parseFloat(str), Float.parseFloat(str));
        } else if (isDouble(str)) {
            this.str = String.format("%s as double is %d and as Double is %d", str, Double.parseDouble(str), Double.parseDouble(str));
        } else {
            this.str = "FALSE";
        }
        return this.str;
    }

    //ex 92, line 143
    public String replaceString(String str1, String str2) {
        int index = 0;
        while ((index = str1.indexOf(str2, index)) != -1) {
            index += str2.length();
            count++;
        }
        if (count == 0) {
            System.out.println("error input");
        } else {
            str = str1.replaceAll(str2, "");
        }
        return str;
    }

    //line 149
    public StringBuilder leadingZero(int num) {
        StringBuilder sbl = new StringBuilder();
        sbl.append("0".repeat(Math.max(0, 10)));
        sbl.append(num);
        return sbl;
    }
}