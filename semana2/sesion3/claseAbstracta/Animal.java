package semana2.sesion3.claseAbstracta;

public abstract class Animal {
    public void comer(){
        System.out.println("Comiendo");
    }

    // abstract: operador de concrecion
    public abstract void trabajar();
    public abstract void emitirUnSonido();
    public abstract void dormir();
    public abstract void hibernar();
}
