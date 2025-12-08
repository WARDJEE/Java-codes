package week10.Verjaardagen;

// import java.time.Month;   Ingebouwde enum maar in het Engels

public class Birthday implements Comparable <Birthday>{
    private int day;
    private Month month;

    public Birthday(int day, Month month) {
        this.day = day;
        this.month = month;
    }

    public int getDay() {
        return this.day;
    }

    public Month getMonth() {
        return this.month;
    }

    public String toString(){
        return this.day + " " +this.month.toString().toLowerCase();
    }

    @Override
    public int compareTo(Birthday birthday) {
        int month = this.month.compareTo(birthday.getMonth());
        if (month != 0) {
            return month;
        }
        return Integer.compare(this.day, birthday.getDay());
    }
}
