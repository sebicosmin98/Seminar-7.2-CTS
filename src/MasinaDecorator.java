public abstract class MasinaDecorator implements Masina{

    protected Masina decoratorMasina;

    public MasinaDecorator(Masina decoratorMasina) {
        this.decoratorMasina = decoratorMasina;
    }

    public void pornesteMotor(){

        this.decoratorMasina.pornesteMotor();
    }
}
