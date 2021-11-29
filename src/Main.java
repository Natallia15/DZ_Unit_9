//1)Напишите абстрактный класс BaseConverter для конвертации из градусов по Цельсию в Кельвины, Фаренгейты, и так далее.
// У метода должен быть метод convert, который и делает конвертацию.

public class Main {
    public static void main(String[] args) {
    Kelv kelv = new Kelv(35);
        Foreng foreng = new Foreng(35);
   kelv.convert();
   foreng.convert();

}}
