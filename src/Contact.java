public class Contact {
    // Contact creates a class for storing contact information.

    //setters and getters:
    private String name;
    String returnName(){
        return name;
    }


    private String email;
    String returnEmail(){
        return email;
    }

    private String phoneNumber;
    String returnPhoneNumber(){
        return phoneNumber;
    }



    Contact(String inName, String inPhoneNumber) {
        this.name = inName;
        this.phoneNumber = inPhoneNumber;

    }


    Contact(String inName, String inEmail, String inPhoneNumber) {
        this.name = inName;
        this.email = inEmail;
        this.phoneNumber = inPhoneNumber;

    }

}


