public class Wilder {

    private String firstname;
    private boolean present;

    public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String firstname){
        this.firstname = firstname;
    }

    public boolean getPresent() {
        return this.present;
    }

    public void setPresent(boolean present) {
        this.present = present;
    }

    public Wilder() {

    }
    
    public Wilder(String firstName, boolean present) {

        this.firstname = firstName;
        this.present = present;

    }

    public static final String ANSI_RESET = "\u001B[0m";  // set terminal output color to red, requires Windows 10
    public static final String ANSI_RED = "\u001B[31m";   // reset terminal output color to default color

    public String whoAmI() {
        if (this.present) {
            return ("My name is " + this.firstname + " and I am present");
        }
        else {
            return ("My name is " + this.firstname + " and I am " + ANSI_RED + "not" + ANSI_RESET + " present"); // 
        }
    }
}