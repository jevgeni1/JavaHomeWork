package sktvp20task4jevgenifilin;
//Создать программу, которая выводит в консоль одномерный массив (new int[100]) 
//нечетных случайных чисел от 0 до 100 (выводить в консоль по десять чисел в одном ряду). 
//Отсортировать массив и посчитать среднее арифметическое всех чисел массива.
/**
 *
 * @author jevge
 */

import java.util.Arrays;
import java.util.Random;



public class SKTVp20Task4JevgeniFilin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //создали одномерный/массив из 100 элементов от 0 до 100
        int[] arr = new int[100];
        Random rand = new Random();
         
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
            /*if (arr[i]%2 == 1) {*/
 


            
// выводим массив по 10 чисел в ряд 
        System.out.print(" "); 
        System.out.printf( "%4d", arr[i]);
        if (i % 10 == 9) {
            System.out.println("");  
            }
        }
    
//выводим максимальное значение массива
        int max = arr[1];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(" ");
        System.out.println("max: " + max);
        
//выводим минимальное значение массива
        int min = arr[1];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("min: " + min);
        
//находим среднее арифметическое значение всех чисел массива
        float average = 0;       
        for(int i =0; i < 100; i++) {
            average = average+arr[i];
}

        average = average/100;
        System.out.println(" ");
        System.out.println("Cреднее арифметическое всех чисел массива: ");
        System.out.println("average = " + average);
        System.out.println(" ");
        
//Сортировка массива по возрастанию значений
        /*boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i] > arr[i+1]){
                    isSorted = false;
 
                    buf = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(arr));*/
        
        
//Сортировка массива по убыванию значений
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i] < arr[i+1]){
                    isSorted = false;
 
                    buf = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    
}
