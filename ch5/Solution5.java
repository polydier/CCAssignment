/* Explanation of 5
 * 
 * n&(n-1)==0 is for example: n=100000, n-1=011111, n&(n-1)==0
 * or if  n=abc0000,n-1=abc0111, only if abc=000, n&(n-1)==0
 * thus this function check whether n is the power of 2, or the higher
 * place of n is 0.
 * 
 */
