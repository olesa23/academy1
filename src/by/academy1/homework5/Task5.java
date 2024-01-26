package by.academy1.homework5;

import java.util.HashMap;
import java.util.Map;

public class Task5 {
    public static void main(String[] args) {
        String text = "Буря мглою небо кроет," +
                "Вихри снежные крутя;";
        String st = text.toLowerCase();//Преобразует все символы в нижний String регистр

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < st.length(); i++) {
            Character charSymbol = st.charAt(i);
            Integer caunt = map.get(charSymbol);
            if (caunt == null) {
                caunt = 1;

                map.put(charSymbol, caunt);
            } else {
                caunt += 1;
                map.put(charSymbol, caunt);
            }
        }
        System.out.println(map);
    }
}
