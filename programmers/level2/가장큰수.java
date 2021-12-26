package level2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class 가장큰수 {
    public static String solution(int[] numbers) {
        String[] stringNumbers = Arrays.toString(numbers).split("[\\[\\]]")[1].split(", ");
        Arrays.sort(stringNumbers, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) return Integer.parseInt(o2) - Integer.parseInt(o1);
                boolean lengthCheck = o1.length() > o2.length();
                long maxCheck = 0;
                o1 = new String(new char[3]).replace("\0", o1);
                o2 = new String(new char[3]).replace("\0", o2);
                try {
                    String tmpNum = lengthCheck ? o1.substring(0, o2.length()) : o2.substring(0, o1.length());
                    if (lengthCheck) {
                        maxCheck = Long.parseLong(o2) - Long.parseLong(tmpNum);
                    } else {
                        maxCheck = Long.parseLong(tmpNum) - Long.parseLong(o1);
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }
                return maxCheck > 0 ?  1 : maxCheck == 0 ? 0 : -1;
            }
        });

        return stringNumbers[0].equals("0") ? "0" : Arrays.stream(stringNumbers).collect(Collectors.joining());
    }

}
