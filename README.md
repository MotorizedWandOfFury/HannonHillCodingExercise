Hannon Hill Coding Exercise
========================

Assumption:

Let N = 12, and Secret encapsulate the function: f(x)

Then Secret is an additive function for all primes less than 12 (i.e. 2,3,5,7,11) iff:
Secret(2+3) = Secret(2) + Secret(3)
Secret(3+5) = Secret(3) + Secret(5)
Secret(5+7) = Secret(5) + Secret(7)
Secret(7+11) = Secret(7) + Secret(11)


Example Functions:

Secret returnMe = (int x) -> x;
        
Secret add5Divide2 = (int x) -> {
  x += 5;
  x /= 2;
  return x;
  };
        
System.out.print("Is returnMe additive? ");
System.out.println(FunctionCheck.isAdditiveFunction(returnMe, 100));
//true
        
System.out.print("Is add5Divide2 additive? "); 
System.out.println(FunctionCheck.isAdditiveFunction(add5Divide2, 4));
//false
