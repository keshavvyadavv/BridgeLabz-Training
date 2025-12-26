class PlusOne {
    public int[] plusOne(int[] digits) {
      
        int carry = 0;
        int sum = digits[digits.length-1] + 1;
        carry = sum / 10;
        digits[digits.length-1] = sum%10;
        for(int i = digits.length - 2 ; i >= 0 ; i--){
            sum = carry + digits[i];
            digits[i] = sum%10;
            carry = sum/10;
        }
        if(carry == 1){
            int[] result = new int[digits.length +1];
            result[0] = 1;
            return result;
        }
        return digits;
    }
}