package sequality;

public class Calculate {
    public int sum(int x, int y){
        return x + y;
    }

    public double average(double x, double y){
        return x / y;
    }

    public int sumall(int x, int y){
        int count = 0;
        for(int i=x; i<=y; i++){
            count += i;
        }
        return count;
    }

    public int sumodd(int x, int y){
        int odd = 0;
        for(int i=x; i<=y; i++){
            if(i%2!=0){
                odd += i;
            }
        }
        return odd;
    }

    public int sumeven(int x, int y){
        int even = 0;
        for(int i=x; i<=y; i++){
            if(i%2==0){
                even += i;
            }
        }
        return even;
    }
}
