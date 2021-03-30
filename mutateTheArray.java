// Given a function that takes two arguments, an array of integers and an integer. 
// The rules are that an element at the arrays index is equal to, a[i - 1] + a[i] + a[i + 1]. The catch is that if the a[i - 1] or a[i + 1] doesn't exist, they should be counted as zero.
// Return an array b for the given function
// Note that this code was written in a custom IDE which implies that if you want to run it in yours, you have to add Java's inbuilt main method and arguments.

int[] mutateTheArray(int n, int[] a) {
int b[] = new int[a.length];
    if(a.length == 1)
        return a;
    for(int i = 0; i < a.length; i++) 
    {
        if(i == 0) 
        {
            b[0] = 0 + a[i] + a[i + 1];
        }
        else if(i == a.length-1)
        {
            b[a.length-1] = a[i - 1] + a[i] + 0;
        }
        else
        {
            b[i] = a[i - 1] + a[i] + a[i + 1];
        }
    }
    return b;
}
