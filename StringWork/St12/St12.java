package EpamJavaTrainee.StringWork.St12;

public class St12 {
    public static void main(String[] args) {
        String s = "Mmoo_-&=+ n E";
        int count1 = 0;
        int count2 = 0;
        s = s.replaceAll("\\W"," ");
        s = s.replaceAll("_"," ");
        s = s.replaceAll(" ","");
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == Character.toUpperCase(s.charAt(i))) {
                count1++;
            } else if (
                    s.charAt(i) == Character.toLowerCase(s.charAt(i))) {
            count2++;
            }
        }
        System.out.println(count1 + " "+ count2);

    }
}
