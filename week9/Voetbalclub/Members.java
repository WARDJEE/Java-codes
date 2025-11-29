package week9.Voetbalclub;

public class Members {
    private Member[] members;
    private int amount;

    public Members() {
        this.members = new Member[100];
        this.amount = 0;
    }

    public void addMember(Member member){
        if (this.amount < this.members.length){
            this.members[this.amount] = member;
            this.amount++;
        }
    }

    public String getMember(int index){
        if (index > this.amount){
            return "NULL";
        }

        else
            return this.members[index].toString();
    }

    public int getAmount() {
        return this.amount;
    }

    public int getAmountOfActiveMembers(){
        int amount = 0;
        for (int i = 0; i < this.amount; i++){
            if (!members[i].getMemberType().equals("steunend")){
                amount++;
            }
        }
        return amount;
    }

    public void printActiveMembers(){
        System.out.println("Aantal active leden: " + this.getAmountOfActiveMembers());
        for (int i = 0; i < this.amount; i++){
            if (!members[i].getMemberType().equals("steunend")){
                System.out.println(members[i]);
            }
        }
    }

}
