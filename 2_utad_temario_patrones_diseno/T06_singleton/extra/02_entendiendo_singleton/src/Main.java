public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        FacebookLogin facebookLogin = new FacebookLogin();
        InstagramLogin instagramLogin = new InstagramLogin();

        facebookLogin.login("Steve");
        instagramLogin.login("Valentina");

        System.out.println("\n_______________________END\n");
    }
}