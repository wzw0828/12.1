package L12.Ex07.bbb;

public class Average {
    private int sum = 0;
    private int end;
    private double avg;
    public Average(int e){
        end = e;
    }

    public double averg(){
        for(int i = 0; i <= end; i++){
            sum += i;
        }
        avg = (double)sum / end;
        return avg;
    }
}
