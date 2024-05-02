package src_interviewQuestion;

public class P1_Printnumberfromwithout_using_any_number {

    //print number from 1 to 100 without using any number
    public static void main(String[] args) {
        int start = 'A' / 'A';
        String end = "..........";

        for (int i = start; i <= (end.length() * end.length()); i++) {
            System.out.println(i);
        }

        //Approach 2:
        //ASCII value of a-97, b=98, c=99, d=100
        for(int i= start; i<='d';i++){
            System.out.println(i);
        }

    }
}