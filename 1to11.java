public class 1to11 {

	public static void problem1() {
		int count = 0;
		for (int i = 1; i < 1000; i++) {
			if(i % 3 == 0 || i % 5 == 0) {
				count += i;
			}
		}
		System.out.println("Problem 1: " + count);
	}

	public static void problem2() {
		int count = 0;
		int curr = 1;
		int next = 2;
		int upperlim = 4000000;
	
		while(curr <= upperlim) {
			if (curr % 2 == 0) {
			count += curr;
			}

			int fib = curr + next;
			curr = next;
			next = fib;
		}
		System.out.println("Problem 2: " + count);
	}

	public static void problem3() {
		long toFactorize = 600851475143L;
		long largestSoFar = -1;

		while(toFactorize % 2 == 0){
			largestSoFar = 2;
			toFactorize /= 2;
		}

		for (long i = 3; i <= toFactorize; i = i + 2) {
        	while (toFactorize % i == 0) {
           		largestSoFar = i;
            	toFactorize /= i;
        	}
		}
		System.out.println("Problem 3: " + largestSoFar);
	}

	public static void problem4() {
		int largestSoFar = -1;

		for(int i = 100; i <= 1000; i++) {
			for(int j = 100; j <= 1000; j++){
				int product = i*j;
				if(isPalindrome(product) && product > largestSoFar){
					largestSoFar = product;
				}
			}
		}
		System.out.println("Problem 4: " + largestSoFar);
	}

	// Problem 4 helper method
	public static boolean isPalindrome(int n) {
		int num = n;
		int rev = 0;

		while(num != 0){
			int rem = num % 10;
			rev = (rev * 10) + rem;
			num = num/10;
		}

		if(n == rev) {
			return true;
		}

		else {
			return false;
		}
	}

	public static void problem5() {
		int smallest = 1;
		for(int i = 1; i <= 20; i++) {
			int curr = gcd(i,smallest);
			smallest = smallest / curr * i;
		}
		System.out.println("Problem 5: " + smallest);
	}

	// Problem 5 helper method
	public static int gcd(int x, int y) {
		while(y != 0) {
			int z = x;
			x = y;
			y = z % y;
		}
		return x;
	}

	public static void problem6() {
		int sumSqr = 0;
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			sumSqr = sumSqr + (i * i);
			sum = sum + i;
		}

		int sqrSum = sum * sum;
		int difference = sqrSum - sumSqr;

		System.out.println("Problem 6: " + difference);
	}

	public static void problem7() {
		int res = 1;
		int count = 0;
		int i;

		while (count < 10001){
      		res++;
      		for (i = 2; i <= res; i++){
        		if (res % i == 0) {
        			break;
        		}
      		}

      		if (i == res){
        	count ++;
			}
		}
	System.out.println("Problem 7: " + res);
	}

	public static void problem8() {
		String bigNum = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";
		long largestSoFar = 0;

		for (int i = 0; i < bigNum.length() - 13; i ++) {
        	long prod = 1;
            for (int j = i; j < i + 13; j++) {
            	prod = prod * Integer.parseInt(bigNum.substring(j, j + 1));
            }

            if (prod > largestSoFar) {
            	largestSoFar = prod;
            } 
		}
		System.out.println("Problem 8: " + largestSoFar);
	}

	public static void problem9() {
		double n = 1000;
		double x = 0;

		for(int i = 2 ; i <= (n/3 - 1); i++){
        	x = (n - ( 500 * n / (n - i)));
        	if(x == (int)x){
        		int result = (int)(i * x * (n - i - x));
        		System.out.println("Problem 9: " + result);
            	break;
        	}
		}	
	}

	public static void problem10() {
		boolean[] primes = isPrime(2000000);
    	long sum = 0;

    	for(int i = 0; i < primes.length; i++) {
        	if(!primes[i]) { 
        		sum += i; 
        	}
   		}
    	System.out.println("Problem 10: " + sum);
	}

	// Problem 10 helper method - sieve of Eratosthenes
	public static boolean[] isPrime(int n) {
		boolean[] check = new boolean[n+1];  
   		check[0] = true; 
    	check[1] = true; 
    	check[2] = false;

    	for(int i = 4; i <= n; i += 2) { 
    		check[i] = true; 
    	}

    	int ubound = (int)Math.sqrt(n) + 1;
    	for(int i = 3; i < ubound; i += 2) {
        	if(!check[i]) {
            	for(int j = i * i; j <= n; j += i) { 
            		check[j] = true; 
            	}
        	}
   		}
    return check;
	}

	public static void problem11() {
		int grid[][] = {
        {8,02,22,97,38,15,00,40,00,75,04,05,07,78,52,12,50,77,91,8},
        {49,49,99,40,17,81,18,57,60,87,17,40,98,43,69,48,04,56,62,00},
        {81,49,31,73,55,79,14,29,93,71,40,67,53,88,30,03,49,13,36,65},
        {52,70,95,23,04,60,11,42,69,24,68,56,01,32,56,71,37,02,36,91},
        {22,31,16,71,51,67,63,89,41,92,36,54,22,40,40,28,66,33,13,80},
        {24,47,32,60,99,03,45,02,44,75,33,53,78,36,84,20,35,17,12,50},
        {32,98,81,28,64,23,67,10,26,38,40,67,59,54,70,66,18,38,64,70},
        {67,26,20,68,02,62,12,20,95,63,94,39,63,8,40,91,66,49,94,21},
        {24,55,58,05,66,73,99,26,97,17,78,78,96,83,14,88,34,89,63,72},
        {21,36,23,9,75,00,76,44,20,45,35,14,00,61,33,97,34,31,33,95},
        {78,17,53,28,22,75,31,67,15,94,03,80,04,62,16,14,9,53,56,92},
        {16,39,05,42,96,35,31,47,55,58,88,24,00,17,54,24,36,29,85,57},
        {86,56,00,48,35,71,89,07,05,44,44,37,44,60,21,58,51,54,17,58},
        {19,80,81,68,05,94,47,69,28,73,92,13,86,52,17,77,04,89,55,40},
        {04,52,8,83,97,35,99,16,07,97,57,32,16,26,26,79,33,27,98,66},
        {88,36,68,87,57,62,20,72,03,46,33,67,46,55,12,32,63,93,53,69},
        {04,42,16,73,38,25,39,11,24,94,72,18,8,46,29,32,40,62,76,36},
        {20,69,36,41,72,30,23,88,34,62,99,69,82,67,59,85,74,04,36,16},
        {20,73,35,29,78,31,90,01,74,31,49,71,48,86,81,16,23,57,05,54},
        {01,70,54,71,83,51,54,69,16,92,33,48,61,43,52,01,89,19,67,48}
        };
         
        int prod = 0;
        int largestSoFar = 0;
         
        for(int i = 0; i < 20; i++){
            for(int j = 0; j < 17; j++){
                prod = grid[i][j] * grid[i][j + 1] * grid[i][j + 2] * grid[i][j + 3];
                if(prod > largestSoFar){
                    largestSoFar = prod;
                }
            }   
        }
         
        for(int i = 0; i < 17; i ++){
            for(int j = 0; j < 20; j++){
                prod = grid[i][j] * grid[i + 1][j] * grid[i + 2][j] * grid[i + 3][j];
                if(prod > largestSoFar){
                    largestSoFar = prod;
                }
            }
        }
         
        for(int i = 0; i < 17; i++){
            for(int j = 0; j < 17; j++){
                prod = grid[i][j] * grid[i + 1][j + 1] * grid[i + 2][j + 2] * grid[i + 3][i + 3];
                if(prod > largestSoFar){
                    largestSoFar = prod;
                }
            }
        }
         
        for(int i = 0; i < 17; i ++){
            for(int j = 3; j < 20; j ++){
                prod = grid[i][j] * grid[i + 1][j - 1] * grid[i + 2][j  - 2] * grid[i + 3][j - 3];
                if(prod > largestSoFar){
                    largestSoFar = prod;
                }
            }
        }
        System.out.println("Problem 11: " + largestSoFar);
    }

	public static void main(String[] args) {

		problem1();
		problem2();
		problem3();
		problem4();
		problem5();
		problem6();
		problem7();
		problem8();
		problem9();
		problem10();
		problem11();
	}
}
