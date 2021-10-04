package EpamJavaTrainee.Classes.Test6;

public class Test6 {
    private int id;
    private String name;
    private String address;
    private int card;
    private int bankNumber;
    public Test6(int id,String name, String address, int card, int bankNumber){
        setId(id);
        setName(name);
        setAddress(address);
        setCard(card);
        setBankNumber(bankNumber);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCard() {
        return card;
    }

    public void setCard(int card) {
        this.card = card;
    }

    public int getBankNumber() {
        return bankNumber;
    }

    public void setBankNumber(int bankNumber) {
        this.bankNumber = bankNumber;
    }
    public void sort (Test6[] testsort){
        int k = 1;
        for (int i = 0; i < testsort.length; i++) {
            for (int j = k; j < testsort.length; j++) {
                if( testsort[i].name.charAt(0) > testsort[j].name.charAt(0)){
                    Test6 t = testsort[i];
                    testsort[i] = testsort[j];
                    testsort[j] = t;
                }
            }k++;
            System.out.println(testsort[i].name);
        }
    }
}
