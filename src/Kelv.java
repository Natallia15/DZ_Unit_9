public class Kelv extends BaseConverter{
    //int kelv;
    int cels;
    int kelv;
    Kelv (int cels) {
        this.cels = cels;
    }

    @Override
   void convert() {
        kelv = cels + 273;
    System.out.println(cels+" градусов цельсия - это "+kelv + " Кельвинов");
    }
}
