	import utils.Math;
	import utils.ArrayUtils;
	import animals.Puppy;

	public class Driver {
	 
		 public static void main (String[] args) {
			 
				Puppy Puppy1 = new Puppy("Joey");
				Puppy Puppy2 = new Puppy("Chandler");
				Puppy Puppy3 = new Puppy("Ross");
				System.out.println(Puppy1.getName());
				System.out.println(Puppy2.getName());
				System.out.println(Puppy3.getName());
				
				
				int [] arrays = {9,20,3,44,88,300};
				int [] result = ArrayUtils.reverse(arrays);
				String finalStringified = ArrayUtils.stringifyArray(result);
				System.out.println(finalStringified);
				
				
				double Num = 15.4;
				int factorialNum = (int) Num;
				long FinalFact = utils.Math.factorial(factorialNum);
				
				
				System.out.println(FinalFact);
			}
	 }



