package e4_efecto_cascada;

class BinarioObserver implements Observer
{
    public void update(Numero s)
    {
        // 1.	💣 Efecto cascada
        int nuevoValor = s.getValor() + 1;
        s.setValor(nuevoValor); // 💣
        System.out.println("Binario: " + Integer.toBinaryString(s.getValor()));
    }
}