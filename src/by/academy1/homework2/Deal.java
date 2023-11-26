package by.academy1.homework2;
import java.util.Scanner;
public class Deal {
    public static void main(String[] args) {
        int cardsOnePlayer = 5;
        int players =0 ;
        String[] mastiCards = {"Черве", "Бубны", "Пики", "Трефы"};
        String[] rangiCards = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Валет", "Дама", "Король", "Туз"};
        int n = mastiCards.length * rangiCards.length;
        for(;;){
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите количество игроков: ");
            if(sc.hasNextInt()){
                players = sc.nextInt();
                if(cardsOnePlayer * players <= n){
                    break;
                } else {
                    if (players ==0){
                        System.out.println("Игра прекращена.");
                        break;
                    } else if (players<0){
                        System.out.println("Число игроков не может быть меньше 0");
                    } else {
                        System.out.println("Слишком много игроков");
                    }
                    }
            } else{
                System.out.println("Вы ввели не число, или Ваше число слишком большое");

            }
        }
        String[] namesCards = new String[n];
        for (int i = 0; i < rangiCards.length; i++) {
            for (int j = 0; j < mastiCards.length; j++) {
                namesCards[mastiCards.length*i + j] = rangiCards[i] + " " + mastiCards[j];
            }
        }
        for (int i = 0; i < n; i++) {
            int z = i + (int) (Math.random() * (n-i));
            String per = namesCards[z];
            namesCards[z] = namesCards[i];
            namesCards[i] = per;
        }
        for (int i = 0; i < players * cardsOnePlayer; i++) {
            System.out.println(namesCards[i]);
            if (i % cardsOnePlayer == cardsOnePlayer - 1)
                System.out.println();
        }
    }

}

