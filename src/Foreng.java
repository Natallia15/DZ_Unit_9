public class Foreng extends BaseConverter{
    int cels;
    double foreng;
    Foreng(int cels) {
        this.cels = cels;
    }

    @Override
   void convert() {
        foreng = cels*5/9 + 32;
    System.out.println(cels+" градусов цельсия - это "+foreng + " Форенгейтов");
    }
}
