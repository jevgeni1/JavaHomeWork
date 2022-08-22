package sktvp20task3jevgenifilin;
//Написать программу, которая спрашивает имя пользователя, фамилию, 
//год, месяц и день рождения. Затем выводит эту информацию в виде:
//Иван Иванов родился 3 февраля 2004 года. 

/**
 *
 * @author jevge
 */
import java.util.Scanner;


public class SKTVp20Task3JevgeniFilin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	System.out.println("Введите Ваше имя:  " );
	String phrase1 = sc.nextLine();
        
        System.out.println("Введите Вашу фамилию:  " );
        String phrase2 = sc.nextLine();
        
        System.out.println("Введите день Вашего рождения:  " );
        String phrase3 = sc.nextLine();
        
        System.out.println("Введите месяц вашего рождения:  " );
        String phrase4 = sc.nextLine();
        
        System.out.println("Ведите год вашего рождения:  " );
        String phrase5 = sc.nextLine();
        
        
        
	System.out.println(phrase1 + " " + phrase2 + " дата Вашего рождения: " + 
                phrase3 + " " + phrase4 + " " + phrase5 + " год.\n" );// TODO code application logic here
    }
    
}
