public class ContactManager {

    /**
     * ContactsManager is a class for maintaining all contacts.
     *
     * @param Contact is a class created above for the purpose of storing contacts(duh)
     * @param friendsCount counts how many contacts are stored(also helps in adding a new contact
     * to appropriate slot in the array(ContactsManager)
     */


    //Fields-setters:
    private Contact[] myFriends;
    private int friendsCount;

    //Default constructor:
    ContactManager() {
        this.friendsCount = 0;
        this.myFriends = new Contact[500];
    }

    //Method for adding a contact:
    void addContact(Contact contact) {
        myFriends[friendsCount] = contact;
        friendsCount++;
    }

    //Method for searching contacts:
    Contact searchContact(String searchName) {

        for (int i = 0; i < friendsCount; i++) {

            if (myFriends[i].returnName().equals(searchName)) {
                return myFriends[i];
            }
        }
        return null;
    }
}

