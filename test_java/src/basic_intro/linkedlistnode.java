package basic_intro;

public class linkedlistnode {
    private int val;
    private linkedlistnode next;

    public linkedlistnode(int val, linkedlistnode next){
        this.val = val;
        this.next = next;
    }
    public int get_val(){
        return this.val;
    }

    public linkedlistnode get_next(){
        return this.next;
    }
    public String get_lln2(){
        String out = "";
        out = out + this.val;
        linkedlistnode nextNext = this.next;
        while (nextNext != null){
            out = out + nextNext.get_val();
            nextNext = nextNext.get_next();
        }
        return out;

    }

    public String get_lln(){
        String out = "";
        if (this.next != null){
            out = out + this.val;
            out = out + this.next.get_lln();
        }else{
            out = out + this.val;
        }
        return out;
    }


    public static void main(String[] args) {
        linkedlistnode head = new linkedlistnode(1,null);
        head = new linkedlistnode(2, head);
        head = new linkedlistnode(3, head);
        System.out.println(head.get_lln());
    }

}
