package calculator;

class StringCalculator {

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
    
}