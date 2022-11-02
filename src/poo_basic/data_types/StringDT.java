package poo_basic.data_types;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class StringDT {
    public void task1(String str) {
        System.out.println("task1");
        System.out.println("The character at position 0 is " + str.charAt(0));
        System.out.println("The character at position 10 is " + str.charAt(10));
    }

    public void task2(String str, int p1, int p2) {
        System.out.println("task2");
        System.out.println(str.substring(p1, p2));
    }

    public void task3(String str1, String str2) {
        String msg = "";
        if(str1.compareTo(str2) > 0) {
            msg = " is bigger than ";
        }
        if (str1.compareTo(str2) == 0) {
            msg = " is equal to ";
        }
        if (str1.compareTo(str2) < 0) {
            msg = " is less than ";
        }
        System.out.println("task3");
        System.out.println(str1 + msg + str2);
    }

    public void task4(String str1, String str2) {
        System.out.println("task4");
        System.out.println(str1 + str2);
        System.out.println(str1.concat(str2));
    }

    public void task5(String str1, String str2) {
        String strUpper1 = str1.substring(0, 1).toUpperCase() + str1.substring(1);
        String strUpper2 = str2.substring(0, 1).toUpperCase() + str2.substring(1);
        System.out.println("task5");
        System.out.println(str1.length() + str2.length());
        System.out.println(str1.charAt(0) < str2.charAt(0));
        System.out.println(strUpper1 + " " + strUpper2);
    }

    public void task6(String str) {
        String outputStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (!outputStr.contains(String.valueOf(str.charAt(i)))) {
                outputStr += String.valueOf(str.charAt(i));
            }
        }
        System.out.println("task6");
        System.out.println(outputStr);
    }

    public void task7(String str, String word) {
        String[] strArr = str.split(" ");
        ArrayList<String> strList = new ArrayList<String>(Arrays.asList(strArr));

        System.out.println("task7");
        for (String s : strList) {
            Boolean containsWord = true;
            for (int i = 0; i < word.length(); i++) {
                containsWord = containsWord && s.contains(String.valueOf(word.charAt(i)));
            }
            if (containsWord) {
                System.out.println(s);
            }
        }
    }

    public void task8(String str) {
        String[] strArr = str.split(" ");
        ArrayList<String> outputArr = new ArrayList<String>();
        ArrayList<String> strList = new ArrayList<String>(Arrays.asList(strArr));

        for (int i = strList.size() - 1; i >= 0; i--) {
            outputArr.add(strList.get(i));
        }
        String result = String.join(" ", outputArr);
        System.out.println("task8");
        System.out.println(result);
    }

    public void task9(String str1, String str2, String str3) {
        ArrayList<String> strList = new ArrayList<String>();
        strList.add(str1);
        strList.add(str2);
        strList.add(str3);
        System.out.println("task9");
        for (String s: strList) {
            int firstChId = 0;
            if (s.charAt(firstChId) != 'g') {
                s = s.substring(1);
            } else {
                firstChId++;
            }
            if (s.charAt(firstChId) != 'h') {
               s = s.replaceFirst(String.valueOf(s.charAt(1)), "");
            }
            System.out.println(s);
        }
    }

    public void task10(String str) {
        int sum = 0;
        String nr = "";

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                if (i < str.length() - 1 && Character.isDigit(str.charAt(i+1))) {
                    nr += str.charAt(i);
                } else {
                    nr += str.charAt(i);
                    sum += Integer.parseInt(nr);
                    nr = "";
                }
            }
        }
        System.out.println("task10");
        System.out.println(sum);
    }

    public void task11(String str) {
        HashMap<Character, Integer> leters = new HashMap<>();
        leters.put(str.charAt(0), 1);

        for (int i = 1; i < str.length(); i++) {
            if (leters.get(str.charAt(i)) != null) {
                leters.put(str.charAt(i), leters.get(str.charAt(i)) + 1);
            } else {
                leters.put(str.charAt(i), 1);
            }
        }
        System.out.println("task11");
        System.out.println(leters);
    }

    public void task12 (String str) {
        System.out.println("task12");
        String newStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            newStr += str.charAt(i);
        }
        System.out.println(newStr);
    }

}
