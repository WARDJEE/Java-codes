package week9.Voetbalclub;

public class Member {
    private int id;
    private String name;
    private MemberType memberType;

    public Member(int id, String name, MemberType memberType) {
        this.id = id;
        this.name = name;
        this.memberType = memberType;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getMemberType() {
        return switch (this.memberType){
            case NORMAL -> "gewoon";
            case SUPPORTING -> "steunend";
            case HONOURLY -> "erelid";
        };
    }

    public String toString(){
        return String.format(" %d %-10s soort: %s", this.id, this.name, this.getMemberType());
    }
}
