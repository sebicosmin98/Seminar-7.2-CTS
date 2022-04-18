public class MasinaInteligentaDecorator extends MasinaDecorator {

    public MasinaInteligentaDecorator(Masina decoratorMasina) {
        super(decoratorMasina);
    }

    public void incalzireScaune(){

        System.out.println("Scaunele au pornit incalzirea!");
    }

    public void pornesteMotor() {
        this.decoratorMasina.pornesteMotor();
        incalzireScaune();
    }

}
