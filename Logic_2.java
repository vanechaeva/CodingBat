//We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each) and big bricks (5 inches each). Return true if it is possible to make the goal by choosing from the given bricks. This is a little harder than it looks and can be done without any loops. See also: Introduction to MakeBricks
//
//makeBricks(3, 1, 8) → true
//makeBricks(3, 1, 9) → false
//makeBricks(3, 2, 10) → true

public boolean makeBricks(int small, int big, int goal) {
  if (goal%5<=small &&goal-(big*5)<=small) {
    return true;
  }
  else return false;
}

//Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values, it does not count towards the sum.
//
//loneSum(1, 2, 3) → 6
//loneSum(3, 2, 3) → 2
//loneSum(3, 3, 3) → 0

public int loneSum(int a, int b, int c) {
	  int sum = 0;
	  if (a != b && a!= c) sum += a;
	  if (b != a && b != c) sum += b;
	  if (c != a && c != b) sum += c;
	  return sum;
	}
//
//Given 3 int values, a b c, return their sum. However, if one of the values is 13 then it does not count towards the sum and values to its right do not count. So for example, if b is 13, then both b and c do not count.
//
//luckySum(1, 2, 3) → 6
//luckySum(1, 2, 13) → 3
//luckySum(1, 13, 3) → 1

public int luckySum(int a, int b, int c) {
	  int sum = 0;
	if (a != 13) sum += a;
	else return sum;
	if (b != 13) sum += b;
	else return sum;
	if (c != 13) sum += c;
	return sum;
	}

//Given 3 int values, a b c, return their sum. However, if any of the values is a teen -- in the range 13..19 inclusive -- then that value counts as 0, except 15 and 16 do not count as a teens. Write a separate helper "public int fixTeen(int n) {"that takes in an int value and returns that value fixed for the teen rule. In this way, you avoid repeating the teen code 3 times (i.e. "decomposition"). Define the helper below and at the same indent level as the main noTeenSum().
//
//noTeenSum(1, 2, 3) → 6
//noTeenSum(2, 13, 1) → 3
//noTeenSum(2, 1, 14) → 3

public boolean fixTeen (int n) {
	  if (n != 15 && n != 16 && n >= 13 && n <= 19) return false;
	  else return true;
	}

	public int noTeenSum(int a, int b, int c) {
	  int sum = 0;
	  if (fixTeen(a)) sum += a;
	  if (fixTeen(b)) sum += b;
	  if (fixTeen(c)) sum += c;
	  return sum;
	}

//	For this problem, we'll round an int value up to the next multiple of 10 if its rightmost digit is 5 or more, so 15 rounds up to 20. Alternately, round down to the previous multiple of 10 if its rightmost digit is less than 5, so 12 rounds down to 10. Given 3 ints, a b c, return the sum of their rounded values. To avoid code repetition, write a separate helper "public int round10(int num) {" and call it 3 times. Write the helper entirely below and at the same indent level as roundSum().
//
//	roundSum(16, 17, 18) → 60
//	roundSum(12, 13, 14) → 30
//	roundSum(6, 4, 4) → 10

public int round10 (int n) {
	  if (n%10 < 5) {
	    return n/10*10;
	  }
	  else return (n/10 + 1)*10;
	}

	public int roundSum(int a, int b, int c) {
	  int sum = round10(a) + round10(b) + round10(c);
	  return sum;
	}

//		Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1), while the other is "far", differing from both other values by 2 or more. Note: Math.abs(num) computes the absolute value of a number.
//
//				closeFar(1, 2, 10) → true
//				closeFar(1, 2, 3) → false
//				closeFar(4, 1, 3) → true

public boolean closeFar(int a, int b, int c) {
	  if (Math.abs(a-b) <= 1 && Math.abs(a-c) >= 2 && Math.abs(b-c) >= 2|| 
	  Math.abs(a-c) <= 1 && Math.abs(a-b) >= 2 && Math.abs(b-c) >= 2) return true;
	  else return false;
	  
	}


//		Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. Return 0 if they both go over.
//
//				blackjack(19, 21) → 21
//				blackjack(21, 19) → 21
//				blackjack(19, 22) → 19

public int blackjack(int a, int b) {
	  if (a > 21 && b > 21) return 0;
	  else if (((21 - a) > (21 - b) && b <= 21) || a > 21) return b;
	  else if (((21 - a) < (21 - b) && a <= 21) || b > 21) return a;
	  else return 0;
	}


//		Given three ints, a b c, one of them is small, one is medium and one is large. Return true if the three values are evenly spaced, so the difference between small and medium is the same as the difference between medium and large.
//
//		evenlySpaced(2, 4, 6) → true
//		evenlySpaced(4, 6, 2) → true
//		evenlySpaced(4, 6, 3) → false

public boolean evenlySpaced(int a, int b, int c) {
	if ((a == b || b == c) && !(a == b && b == c)) return false;
	else if (Math.abs(a-b)==Math.abs(b-c) || Math.abs(a-b)==Math.abs(a-c) 
			|| Math.abs(a-c)==Math.abs(b-c))
	{
		return true;
	}
	else return false;
}

//		We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars (5 kilos each). Return the number of small bars to use, assuming we always use big bars before small bars. Return -1 if it can't be done.
//
//		makeChocolate(4, 1, 9) → 4
//		makeChocolate(4, 1, 10) → -1
//		makeChocolate(4, 1, 7) → 2
		
public int makeChocolate(int small, int big, int goal) {
	  int sum;
	  
	  for (int i = big; i >= 0; i--) {
	    for (int j = small; j >= 0; j--) {
	      sum = i*5 + j;
	      if (sum == goal) return j;
	    }
	  }
	  return -1;
	}

		
		
		
	