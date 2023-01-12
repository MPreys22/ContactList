public class President extends Person{
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
