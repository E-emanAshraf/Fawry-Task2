public class Service {
    public void send(String address_or_email,Book b){
        if(b instanceof PaperBook)
            System.out.println("The paper book is included in the shipping service. Please send it to the following customer address: " + address_or_email);
        else if (b instanceof EBook)
            System.out.println("The EBook is included in the mail service. Please send it to the following email address: " + address_or_email);

        System.out.println(b.toString());
    }
}
