package level1;

public class 직업군추천하기 {
    public static String solution(String[] table, String[] languages, int[] preference) {
        String job[] = new String[5];
        int total[] = new int[5];
        int max = 0;
        for (int x = 0; x < table.length; x++) {
            String lang[] = table[x].split(" ");
            job[x] = lang[0];
            for (int i = 0; i < languages.length; i++) {
                for (int j = 1; j < lang.length; j++) {
                    if (languages[i].equals(lang[j])) total[x] += preference[i] * (6 - j);
                }
            }
            max = x != 0 ? Math.max(max, total[x]) : total[x];
        }

        String answer = "";
        for (int i = 0; i < total.length; i++) {
            if (max == total[i]) {
                answer = answer.equals("") ? job[i] : answer.charAt(0) < job[i].charAt(0) ? answer : job[i];
            }
        }
        return answer;
    }
}
