class FactorsOfNumber{

    public static void main(String[] args){
        
        int num = 100;
        getFactors (num);
    }

    static void getFactors (int n)
    {
        for(int i = 1; i <= Math.sqrt(n); ++i)
        {
            if (n % i == 0){
                // If both pair of factors are equal then we just print
                // once, example for 100 : (a, b) : (10, 10)
                // 10 should be printed just once
                if(i == n / i)
                    System.out.print(i + ", ");

                    // else print both the pairs
                else
                    System.out.print(i + ", " + n/i + ", ");
            }
        }
    }
}