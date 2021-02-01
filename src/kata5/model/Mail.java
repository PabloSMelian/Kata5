package kata5.model;

public class Mail {

    private final String mail;

    public Mail(String mail) {
        this.mail = mail;
    }

    public String getDomain(){
        return mail.substring(mail.indexOf("@") + 1);
    }

    public static boolean isMail(String line) {
        return line.matches("[^@]+@[^@]+\\.[a-zA-Z]{2,}");
    }
}
