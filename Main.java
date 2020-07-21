class Main 
{
  // main-Mathode um das Programm zu starten
  public static void main(String[] args)
  {
    String plaintext = "Guten Tag!";
    int key = 3;

    String ciphertext = code(plaintext, key);
    System.out.println("Klartext: " + plaintext + " ---> " + ciphertext);

    String decoded = decode(ciphertext, key);
    System.out.println("Geheimtext: " + ciphertext + " ---> " + decoded);
  }
}