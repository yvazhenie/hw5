import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        for (int g = 1; g < 11; g = g + 1){
            System.out.println("Итерация цикла " + g);
        }
        for (int f = 10;f > 0; f = f - 1){
            System.out.println("Итерация цикла " + f);
        }
        for (int e = 0; e < 17;e = e + 2){
            System.out.println("Итерация цикла " + e);
        }
        for (int d = 10; d > - 11; d = d - 1){
            System.out.println("Итерация цикла " + d);
        }
        for (int v = 1904; v < 2096; v = v +4){
            System.out.println(v + " год является високосным");
        }
        for (int t = 7; t < 105; t = t +7){
            System.out.println("Итерация цикла " + t);
        }
        for (int h = 1; h < 513; h = h * 2){
            System.out.println("Итерация цикла " + h);
        }
        int salary1 = 29000;
        int total1 = 0;
        for (int j = 0; j < 12; j++){
            total1 = total1 + total1/100;
            total1 = total1 + salary1;
            System.out.println("Месяц " + j + " сумма накоплений равна " + total1 + " рублей");
        }
        int m = 2;
        for (int l = 1; l <11; l++){
            System.out.println(m + "*" + l + "=" + (l*m));
        }
    }
}