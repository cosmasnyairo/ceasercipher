package com.example.ceasercipher;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {

        System.out.println("Starting Application");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Text to encrypt: ");
        String userinput = scanner.nextLine();

        System.out.print("Shift: ");
        int shift = scanner.nextInt();
        scanner.nextLine(); 
        
        System.out.println("-> Encrypting");        
        String encryptedtext = encrypt(userinput, shift);     

        System.out.println("Decrypting ->");       
        String decryptedtext = decrypt(encryptedtext, shift);
        
        System.out.println(".....................");
        System.out.println("Input String: " + userinput);        
        System.out.println("Encrypted String: " + encryptedtext);
        System.out.println("Decrypted String: " + decryptedtext);

        scanner.close();
    }

    public static String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (Character.isLetter(ch)) {
                char base = Character.isLowerCase(ch) ? 'a' : 'A';
                ch = (char) (((ch - base + shift) % 26) + base);
            }

            result.append(ch);
        }

        return result.toString();
    }
    
    public static String decrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (Character.isLetter(ch)) {
                char base = Character.isLowerCase(ch) ? 'a' : 'A';
                ch = (char) (((ch - base - shift + 26) % 26) + base);
            }
            result.append(ch);
        }
        return result.toString();
    }

}
