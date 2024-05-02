package src_interviewQuestion;

public class P2_Printnumberswithoutusinganyloop {

    //print numbers from 1 to 100 without using any loop

    //will use recursive method

    public static void main(String[] args){
        P2_Printnumberswithoutusinganyloop p1 = new P2_Printnumberswithoutusinganyloop();
        p1.printnumbers(1,100);
    }

    public void printnumbers(int startnum, int endnum){
        if(startnum <= endnum){
            System.out.println(startnum);
            startnum++;
            printnumbers(startnum,endnum);

        }

    }
}
