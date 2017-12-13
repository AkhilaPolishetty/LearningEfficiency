class Solution {
    public String complexNumberMultiply(String a, String b) {
        
        String[] x = a.split("\\+|i");
        String[] y = b.split("\\+|i");
        int real = Integer.parseInt(x[0])*Integer.parseInt(y[0]) - Integer.parseInt(x[1])*Integer.parseInt(y[1]);
        int imaginary = Integer.parseInt(x[0])*Integer.parseInt(y[01]) + Integer.parseInt(x[1])*Integer.parseInt(y[0]);
        return String.valueOf(real)+"+"+String.valueOf(imaginary)+"i";
        
    }
}