/**
 * Michael Preys
 * 1/19/2023
 * A subclass of Person that represents a President
 *
 * Created for ContactList Project CS2
 *
 * @author: Michael Preys
 * @version: 2022-2023
 */

public class President extends Person{
    // Terms variable unique to students
    private int terms;

    public President(String firstName, String lastName, String phoneNumber, int terms) {
        super(firstName, lastName, phoneNumber);
        this.terms = terms;
    }

    public int getTerms() {
        return terms;
    }

    @Override
    public String toString() {
        return super.toString() + " Terms served: " + getTerms();
    }
}
