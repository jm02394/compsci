class UserProfile {
    String username;
    int pin;

    public UserProfile(String username, int pin) {
        this.username = username;
        this.pin = pin;
    }

    public String toString() {
        return "Username: " + this.username + ", Pin #: " + this.pin;
    }
}

class UserProfileDriver {
    public static void main(String[] args) {
        UserProfile user1 = new UserProfile("Billy", 1234);
        System.out.println(user1.toString());

        UserProfile user2 = new UserProfile("Bob", 4321);
        System.out.println(user2.toString());
    }
}
