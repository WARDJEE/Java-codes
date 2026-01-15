package week12.VoorbeeldexamenChemie;

public class NietMetaal extends Atoom {
    private boolean isolerend = true;

    public NietMetaal(String naam, String symbool, int atoomnummer){
        super(naam, symbool, atoomnummer);
    }

    public NietMetaal(String naam, String symbool, int atoomnummer, double massa){
        super(naam, symbool, atoomnummer, massa);
    }

    public void setIsolerend(boolean isolerend) {
        this.isolerend = isolerend;
    }

    @Override
    public String toString() {
        return String.format("%s - %sisolerend", super.toString(), this.isolerend? "":"niet ");
    }
}
