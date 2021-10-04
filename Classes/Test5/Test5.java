package EpamJavaTrainee.Classes.Test5;

public class Test5 {
    private int hr = 0;
    private int min = 0;
    private int sec = 0;

    public int getHr() {
        return hr;
    }

    public void setHr(int hr) {
        this.hr = hr;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }
    public void changeMin (int b){
        if(b >= 0 && b <=59){
            setMin(b);
        }else setMin(0);
    }
    public void changeHr (int b){
        if(b >= 0 && b <=23){
            setHr(b);
        } else setHr(0);
    }
    public void changeSec (int b){
        if(b >= 0 && b <=59){
            setSec(b);
        }else setSec(0);
    }
    public void getTime(){
        System.out.print("Текущее время: ");
        System.out.print(getHr() + ":" + getMin() + ":" + getSec());
        System.out.println();
    }
}
