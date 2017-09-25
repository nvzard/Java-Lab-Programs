package p1;

public class Amount_in_words{

      String[] ones ={"", " One", " Two", " Three", " Four", " Five",
         " Six", " Seven", " Eight", " Nine", " Ten", " Eleven", " Twelve",
         " Thirteen", " Fourteen", " Fifteen",  " Sixteen", " Seventeen", 
         " Eighteen", " Nineteen"};
      String[] tens =  {"", "Ten", " Twenty", " Thirty", " Forty", " Fifty",
         " Sixty", " Seventy", " Eighty"," Ninety"};
      String[] digit = {"", " Hundred", " Thousand", " Lakh"}; 

    
    int countDigits(int arg){
        
        int count = 0;

        while(arg > 0){
            arg /= 10;
            count++;
        }

        return count;
    }
    
    
    int reverse(int arg){
        int rev = 0;

        while(arg > 0){
            rev = rev*10 + arg%10;
            arg /= 10;
        }
        return rev;
    }

    int[] numToarray(int num){
        int[] array = new int[countDigits(num)];
        int rev = reverse(num);

        for(int i=0; i<array.length; i++){
            array[i] = rev%10;
            rev /= 10;
        }

        return array;
    }

    public void convert(int num){
        StringBuilder result = new StringBuilder("");
        int[] arr = numToarray(num);
        int len = countDigits(num);
        for(int i=0, n=arr.length; i<n; i++){

            switch(len){
                case 7:
                    if((arr[i]*10+arr[i+1]) < 20 ){
                        result.append(ones[arr[i]*10+arr[i+1]]);
                        result.append(digit[3]);
                        len -= 2;
                        i++;
                    }
                    else{
                        result.append(tens[arr[i]]);
                        len--;
                    }
                    break;
                case 6:
                    result.append(ones[arr[i]]);
                    result.append(digit[3]);
                    len--;
                    break;
                case 5:
                    if((arr[i]*10+arr[i+1]) < 20){
                           result.append(ones[arr[i]*10+arr[i+1]]);
                           result.append(digit[2]);
                           len -= 2;
                           i++;
                    }
                    else{
                        result.append(tens[arr[i]]);
                        len--;
                    }
                    break;
                case 4:
                    result.append(ones[arr[i]]);
                    result.append(digit[2]);
                    len--;
                    break;
                case 3:
                    result.append(ones[arr[i]]);
                    result.append(digit[1]);
                    len--;
                    break;
                case 2:
                    if((arr[i]*10 + arr[i+1]) < 20){
                        result.append(ones[arr[i]*10 + arr[i+1]]);
                        len -= 2;
                        i++;
                    }
                    else{
                        result.append(tens[arr[i]]);
                        len--;
                    }
                    break;
                case 1:
                    result.append(ones[arr[i]]);
                    len--;
                    break;
                default:System.out.println("Not Valid Input");
                        return;
              }
        }

      System.out.println(result);
                
    }
}
                   

