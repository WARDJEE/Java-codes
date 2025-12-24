package week12.Voorbeeldexamen;

public class NietMetaal extends Atoom{
    private boolean isolerend;

    public NietMetaal(String naam, String symbool, int atoomnummer) {
        super(naam, symbool, atoomnummer);
    }

    public NietMetaal(String naam, String symbool, int atoomnummer, double massa) {
        super(naam, symbool, atoomnummer, massa);
    }

    public void setIsolerend(boolean isolerend) {
        this.isolerend = isolerend;
    }

    @Override
    public String toString() {
        return String.format("%-10s - %sisolerend", super.toString(), this.isolerend? "": "niet ");
    }
}
