package basic_intro;
import java.util.LinkedList;
public class linklist_intro {
    public static void main(String[] args){
        LinkedList<String> names = new LinkedList<String>();
        names.add("Junpeng");
        names.add("Kaden");
        names.add("Aaron");
        for (int i = 0;i<names.size();i++){
            System.out.printf("Now the index of the linkedlist is %s, the match string is %s.",i,names.get(i));
            System.out.println();
        }

        for (String i : names){
            System.out.println(i);
        }
//        names.remove();
//        names.removeFirst();
//        names.removeLast();
//        String first = names.getFirst();
//        String last = names.getLast();
//        System.out.printf("The first one is %s, and the last one is %s",first,last);

    }

}
