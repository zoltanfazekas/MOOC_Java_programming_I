
public class Statistics {
    private int count;
    private int sum;
    
    public Statistics() {
        
    }
    
    public void addNumber(int number) {
        
        this.count++;
        this.sum = this.sum + number;
        
    }
    
    public int getCount() {
        return this.count;
    }
    
    public int sum() {
        if (this.sum == 0) {
            return 0;
        } else {
            return this.sum;
        }
        
        
    }
    
    public double average() {
        if (this.sum != 0 && this.count != 0) {
            return 1.0 * this.sum / this.count;
        }
        return 0.0;
        
    }
}
