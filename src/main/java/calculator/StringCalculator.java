package calculator;

class StringCalculator {

    public int add(String input) {
    	int sum=0;
    	if(input=="") {
    		return 0;
    	}else if(input.contains(",")) {
    		String regex = "\\,";
    		String[] words = input.split(regex);
    		for( String word : words ) {
    		//	System.out.println(word);
    			sum=sum+Integer.parseInt(word);
    		}
    	}/*
    	else {
    	 sum=Integer.parseInt(input);
    	}*/
		return sum;
    }

}