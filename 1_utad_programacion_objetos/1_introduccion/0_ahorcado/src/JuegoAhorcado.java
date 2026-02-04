public class JuegoAhorcado
{
    // Atributos inicializados por Constructor
    private String[]      palabras;
    private int           numVidas;

    // Atributos ejecución
    private String         palabraSecreta; 
    private StringBuilder palabraUsuario;

    // Constructores
    public JuegoAhorcado(String[] palabras, int numVidas)
    {
        this.palabras = palabras;
        this.numVidas = numVidas;
        inicializarPalabraSecreta();
        inicializarPalabraUsuario();
    }

    // Getters
    public StringBuilder getPalabraUsuario()
    {
        return this.palabraUsuario;
    }

    public int getNumVidas()
    {
        return this.numVidas;
    }

    // Setters

    // Métodos públicos
    public void pedirLetra(char c)
    {
        int hayLetraEncontrada = 0;

        // Recorremos las letras de la palabra secreta
        for (int i = 0; i < palabraSecreta.length(); i++)
        {
            if (palabraSecreta.charAt(i) == c)
            {
                palabraUsuario.setCharAt(i, c);
                hayLetraEncontrada++;
            }
        }
        if (hayLetraEncontrada < 1)
        {
            System.out.println("Letra no encontrada");
            numVidas--;
        }
        else
        {
            System.out.println("Letra encontrada " + palabraUsuario);
        }
    }

    // Métodos privados
    private void inicializarPalabraSecreta()
    {
        int indiceAleatorio = (int) (Math.random() * palabras.length);
        palabraSecreta = palabras[indiceAleatorio];
    }

    private void inicializarPalabraUsuario()
    {
        palabraUsuario = new StringBuilder();
        for (int i = 0; i < palabraSecreta.length(); i++)
        {
            palabraUsuario.append("_");
        }
    }

    public int comprobarVictoria()
    {
        if (palabraSecreta.equals(palabraUsuario.toString()))
        {
            System.out.println("Enorabuena, has ganado!");
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
