public class Caesar {
  /* Klartext mit dem Schluessel verschluesseln */
  public String code(String plaintext, int key) {
    String ciphertext = "";
    plaintext = plaintext.toLowerCase(); // Alles in Kleinbuchstaben umwandeln
    for (int i = 0; i < plaintext.length(); i++) {
      // Buchstaben verschieben und an Geheimtext haengen
      char next = plaintext.charAt(i);
      ciphertext = ciphertext + shift(next, key);
    }
    return ciphertext;
  }

  /* Verschiebt den Buchstaben um die angegebene Verschiebung (key) */
  public char shift(char letter, int shift) {
    // Buchstaben als Zahl behandeln
    if (letter >= 'a' && letter <= 'z') { // Sonderzeichen nicht veraendern
      letter += shift;
      while (letter > 'z') {
        letter -= 26;
      }
    }
    return letter;
  }

  /* Entschluesselt den Geheimtext mit dem angegebenen Schluessel */
  public String decode(String ciphertext, int key) {
    String decoded = "";
    ciphertext = ciphertext.toLowerCase(); // Alles in Kleinbuchstaben umwandeln
    for (int i = 0; i < ciphertext.length(); i++) {
      // Jeden Buchstaben verschieben und zwar um (26-Schluessel(key)) Stellen
      // und an entschluesselten Text anhaengen
      char next = ciphertext.charAt(i);
      decoded = decoded + shift(next, 26 - key);
    }
    return decoded;
  }
}