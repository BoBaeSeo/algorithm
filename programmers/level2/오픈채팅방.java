package level2;

import java.util.ArrayList;
import java.util.HashMap;

public class 오픈채팅방 {

	public String[] solution(String[] record) {
		ArrayList<String> answer = new ArrayList<String>();
		HashMap<String, String> nick = new HashMap<String, String>();
		for (int i = 0; i < record.length; i++) {
			String[] temp = record[i].split(" ");
			if (temp[0].equals("Leave"))
				continue;
			if (nick.get(temp[1]) == null) {
				nick.put(temp[1], temp[2]);
			} else {
				nick.replace(temp[1], temp[2]);
			}
		}

		for (int i = 0; i < record.length; i++) {
			String[] temp = record[i].split(" ");
			if (temp[0].equals("Change"))
				continue;
			String str = temp[0].equals("Enter") ? "님이 들어왔습니다." : "님이 나갔습니다.";
			answer.add(nick.get(temp[1]) + str);
		}

		return answer.toArray(new String[0]);
	}

}
