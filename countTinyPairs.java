// Given two array integers (int[]a and int[]b) of equal length and an integer k, Loop through int[]a from left to right and loop through int[]b from right to left
// Concatenate the index values of each value obtained and return the number of pairs that are less than k.
// For example int[] a = {1,2,3}; int[] b = {1,2,3}; k =32
// So for a function public int countTinyPairs(int[]a, int[]b, int k) to be satisfied with the above inputs.
// The amount of tiny paris will be equal to 2

int countTinyPairs(int[] a, int[] b, int k) {
int len = a.length; // The 'len' varaible works for both arrays because it is specified in the problem that the array will alwyas be equal
int count=0; // Initialize a count varaible to hold the current number of tiny pairs found
if (a.length==0){ // Retrun 0 if the length of the array is zero
    
    return 0;
}
int i,j;
  
//Use one for loop with i and j variables to loop through both arrays at the same time
for(i =0, j=len-1; j<=len-1 && i<a.length; i++, j--){
    
  // Convert the Integer values to strings
  String s1 = Integer.toString(a[i]); 
  String s2 = Integer.toString(b[j]);
  
  // Concatenate both strings
  String s = s1 +s2;
  
  // Convert the string into an integer so it can be compared with k
  int x = Integer.parseInt(s);
  
  if(x<k){
      count++;
  }
  
//Finally, the return type of this method is specified to be an Integer, hence, an integer value must be returned
}return count;



}
