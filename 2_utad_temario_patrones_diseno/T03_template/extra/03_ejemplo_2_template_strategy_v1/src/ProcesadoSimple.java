

public class ProcesadoSimple implements ProcesadoStrategy
{
    // ------------------------------- Atributos
    // ------------------------ Métodos Públicos
    @Override
    public void procesarDatos()
    {
        System.out.println("- Simple: Procesando datos");
    }
}

// ConcreteStrategy

// procesa datos