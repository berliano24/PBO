/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package tugas;

import models.PasswordStore;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
          try {
            PasswordStore pass1 = new PasswordStore("Akun BCA", "1122334455", "RahasiaNegara");
            pass1.setCategory(PasswordStore.CAT_WEBAPP);
            System.out.println(pass1);
            System.out.println("USERNAME: " + pass1.username + " PASSWORD: " + pass1.getPassword());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
}