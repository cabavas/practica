import java.util.ArrayList;

public class PokemonResponse {
    private float count;
    private String next;
    private String previous = null;
    ArrayList<Object> results = new ArrayList<Object>();


    // Getter Methods

    public ArrayList<Object> getResults() {
        return results;
    }

    public float getCount() {
        return count;
    }

    public String getNext() {
        return next;
    }

    public String getPrevious() {
        return previous;
    }

    // Setter Methods

    public void setCount( float count ) {
        this.count = count;
    }

    public void setNext( String next ) {
        this.next = next;
    }

    public void setPrevious( String previous ) {
        this.previous = previous;
    }
}