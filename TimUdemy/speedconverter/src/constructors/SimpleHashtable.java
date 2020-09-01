package constructors;

public class SimpleHashtable {
    private Account[] hashtable;

    public SimpleHashtable() {
        hashtable = new Account[10];
    }

    /*
    this implementation is very limited because if any accounts have the same
    length we will get collision.
     */
    public void put(String key, Account account) {
        int hashedKey = hashKey(key); // assigning the result of key and the method below
        if (hashtable[hashedKey] != null) { // if the key is already in use
            System.out.println("Sorry, there is already an account at position " + hashedKey);
        } else {
            hashtable[hashedKey] = account;
        }
    }

    public Account get(String key) {
        int hashedKey = hashKey(key);
        return hashtable[hashedKey];
    }
    
    private int hashKey(String key) {
        /*
        this will allow us to have a hash table with keys 0 - 9 using the
        length of the String as the key
         */
        return key.length() % hashtable.length; // modding by the length of the array
    }
    
    public void printHashtable() {
        for (int i = 0; i < hashtable.length; i++) {
            System.out.println(hashtable[i]);
        }
    }
}
