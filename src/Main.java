public class Main {


    public static void main(String[] args){

        Masina m = new MasinaPersonala();
        m.pornesteMotor();

        System.out.println();

        Masina m2 = new MasinaInteligentaDecorator(new MasinaPersonala());
        m2.pornesteMotor();











    }



}
