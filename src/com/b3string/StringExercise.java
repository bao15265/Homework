package com.b3string;

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

    public String addString(String str1, String str2) {
        return str1.concat(str2);
    }

    public String upperCase(String str) {
        return str.toUpperCase();
    }

    public int countUpperCase(String str) {
        for (int i = 0; i < str.length(); i++) {
            upperC = str.charAt(i);
            if (Character.isUpperCase(upperC)) {
                count++;
            }
        }
        return count;
    }

    public int countNumber(String str) {
        for (int i = 0; i < str.length(); i++) {
            upperC = str.charAt(i);
            if (Character.isDigit(upperC)) {
                count++;
            }
        }
        return count;
    }

    public List<Character> printOddIndex(String str) {
        List<Character> indexList = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 1) {
                indexList.add(str.charAt(i));
            }
        }
        return indexList;
    }

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

    public String deleteSpace(String str) {
        return str.stripLeading();
    }

    public int countLowerCase(String str) {
        for (int i = 0; i < str.length(); i++) {
            upperC = str.charAt(i);
            if (Character.isLowerCase(upperC)) {
                count++;
            }
        }
        return count;
    }

    public String sub2toE(String str) {
        return str.substring(2);
    }

    public String sub2to8(String str) {
        return str.substring(2, 8);
    }

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

    public Map<Character, Integer> countKey(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            map.merge(c, 1, Integer::sum);
        }
        return map;
    }

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

    public List<Character> printIndex243(String str) {
        List<Character> tft = new ArrayList<>();
        tft.add(str.charAt(2));
        tft.add(str.charAt(4));
        tft.add(str.charAt(3));
        return tft;
    }

    public String replaceChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    this.str = str.substring(0, j) + '$' + str.substring(j + 1);
                }
            }
        }
        return this.str;
    }

    public String swapTwoString(String str1, String str2) {
        str = str2.substring(0, 2) + str1.substring(2) + " " + str1.substring(0, 2) + str2.substring(2);
        return str;
    }

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

    public String swapFirstAndLast(String str) {
        int num = str.length();
        String newStr;
        newStr = str.substring(num - 1) + str.substring(1, num - 1) + str.substring(0, 1);
        return newStr;
    }

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

    public String printUniqueWord() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chuoi can nhap?");
        str = sc.nextLine();
        String[] arrayStr = str.split(", ");
        Arrays.sort(arrayStr);
        arrayStr[count] = arrayStr[0];
        for (int i = 0; i < arrayStr.length; i++) {
            if(!arrayStr[count].equals(arrayStr[i])){
                count++;
                arrayStr[count] = arrayStr[i];
            }
        }
        String[] newArray = Arrays.copyOf(arrayStr, count+1);
        return Arrays.toString(newArray);
    }

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

    public String printUpperAndLower() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tu can nhap?");
        str = sc.nextLine();
        return str.toUpperCase() + " " + str.toLowerCase();
    }

    public String reverserFour(String str) {
        String reverse = new StringBuffer(str).reverse().toString();
        if (str.length() % 4 == 0) {
            this.str = reverse;
        }
        return reverse;
    }

}