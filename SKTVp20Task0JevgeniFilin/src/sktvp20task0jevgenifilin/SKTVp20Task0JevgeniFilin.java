//Напишите программу, которая из консоли считывает градусы Цельсия в
//переменную double, затем конвертирует в градусы Фаренгейта и отображает
//результат. Формула для конвертации следующая:
//fahrenheit = (9 / 5) * celsius + 32
package sktvp20task0jevgenifilin;

/**
 *
 * @author jevge
 */

import java.util.Scanner; 

public class SKTVp20Task0JevgeniFilin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Введите значение температуры в градусах цельсия:");
        Scanner temp = new Scanner(System.in); //объявили Scanner temp
        double cels = temp.nextDouble(); //считали значение double cels
        double far = cels * 9 / 5 + 32; //высчитали значение double far
        
        System.out.println("Если температура в градусаз Цельсия равна: " + cels + ", то в градусах Фарингейта это будет: " + far );

    }
    
}
