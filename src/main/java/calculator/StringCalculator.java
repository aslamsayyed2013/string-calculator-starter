package calculator;

class StringCalculator {
/*
    public int add1(String input) {
    	String[] numbers=input.split(delimiter);
    	int sum=0;
    	if(input.isEmpty()) {
    		return 0;
    	}else if(!input.isEmpty()) {
    		String regex = ",";
    		String[] words = input.split(regex);
    		for( String word : words )
    			sum=sum+Integer.parseInt(word);
    	}
    	else {
    		sum =Integer.parseInt(input);
    	}
		return sum;
    }

	private final String delimiter=",|\n";
	
	public Integer add(String input) throws Exception {
		String[] numbers=input.split(delimiter);
		if(isEmpty(input)) {
			return 0;
		}else if(input.length()==1) {
			return Integer.parseInt(input);
		}else {
			return getSum(numbers);
		}
	}
    
	private int getSum(String[] numbers) throws Exception{
		for(String current:numbers) {
			if(stringToInt(current)<0) {
				throw new Exception("Negative input");
			}
		}
		int sum=0;
		for(String current:numbers) {
			sum+=stringToInt(current);
		}
		return sum;
	}
	
    private int stringToInt(String input) {
		return Integer.parseInt(input);
	}

	private boolean isEmpty(String input) {
    	return input.isEmpty();
    }

	public static void negative(String input) {
		String regex = ",";
		String[] words = input.split(regex);
		for( String word : words )
			if(Integer.parseInt(word)<0) {
				throw new IllegalArgumentException();
			}
			
			sum=sum+Integer.parseInt(word);
	}
   */ 
	public static int add(String text){
	       if(text.equals("")){
	           return 0;
	       }
	       else{
	           String delimiter = ",";
	           if(text.matches("//(.)\n(.)")){
	               delimiter = Character.toString(text.charAt(2));
	               text = text.substring(4);
	           }
	           
	           String numList[] = splitNumbers(text, delimiter + "|\n");
	           return sum(numList);
	       }
	   }

	   private static int toInt(String number){
	       return Integer.parseInt(number);
	   }

	   private static String[] splitNumbers(String numbers, String divider){
	       return numbers.split(divider);
	   }

	   private static int sum(String[] numbers){
	       int total = 0;
	       String negString = "";

	        for(String number : numbers){
	           if(toInt(number) < 0){
	               if(negString.equals(""))
	                   negString = number;
	               else
	                   negString += ("," + number);
	           }
	           if(toInt(number) < 1000)
	               total += toInt(number);
	       }

	       if(!negString.equals("")){
	           throw new IllegalArgumentException("Negatives not allowed: " + negString);
	       }

	       return total;
	    }
}