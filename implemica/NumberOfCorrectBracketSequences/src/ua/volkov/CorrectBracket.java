package ua.volkov;

/**
 * This class provides operations with bracket sequences
 */
public class CorrectBracket {


    private int count;

    public  CorrectBracket(int count){
        if(count < 0) throw new IllegalArgumentException("count can not be less than 0");
        this.count = count;
    }

    /**
     * Calculates how many correct bracket sequences of given count
     * @return number of correct bracket sequences
     */
    public long numberOfCorrecrBrSequences(){
        if(this.count <=1) return 1;
        return
                this.catalan(this.count);
    }

    private long catalan(long n){

        if ( n<=0 ) { return 1; }

        long sum= 0;
        for (int i= 0; i<n; i++ ) {
            sum+= catalan(i) * catalan( (n-1)-i );
        }
        return sum;

    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        if(count < 0) throw new IllegalArgumentException("count can not be less than 0");
        this.count = count;
    }


}
