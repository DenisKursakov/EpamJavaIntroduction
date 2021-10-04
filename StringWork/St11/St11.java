package EpamJavaTrainee.StringWork.St11;

public class St11 {
    public static void main(String[] args) {
      String s = "German is good";

        int count = 0;
        for (String rev: s.split(" ")
             ) {if(rev.length() > count){
                 count = rev.length();
        }

        }
        for (String rev:s.split(" ")
             ) { if (rev.length() == count) {
            System.out.println(rev);
        }

        }
    }
}
