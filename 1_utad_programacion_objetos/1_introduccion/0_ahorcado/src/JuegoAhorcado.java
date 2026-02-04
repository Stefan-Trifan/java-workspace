public class JuegoAhorcado
{
    // Atributos inicializados por Constructor
    private String[]      palabras;
    private int           numVidas;

    // Atributos ejecución
    private String        palabraSecreta;
    private StringBuilder palabraUsuario;

    // Constructores
    public JuegoAhorcado(String[] palabras, int numVidas)
    {
        this.palabras = palabras;
        this.numVidas = numVidas;
        elegirPalabraSecreta();
        inicializarPalabraUsuario();
    }

    // Getters
    public StringBuilder getPalabraUsuario()
    {
        return this.palabraUsuario;
    }

    // Setters

    // Métodos públicos
    public void pedirLetra(char c)
    {
        for(int i = 0; i < palabraSecreta.length(); i++)
        {
            if(palabraSecreta.charAt(i) == c)
            {
                palabraUsuario.setCharAt(i, c);
            }
            else
            {
                numVidas--;
            }
        }
    }

    // Métodos privados
    private void elegirPalabraSecreta()
    {
        int indiceAleatorio = (int) (Math.random() * palabras.length);
        palabraSecreta = palabras[indiceAleatorio];
    }

    private void inicializarPalabraUsuario()
    {
        palabraUsuario = new StringBuilder();
        for(int i = 0; i < palabraSecreta.length(); i++)
        {
            palabraUsuario.append("_");
        }
    }
}
