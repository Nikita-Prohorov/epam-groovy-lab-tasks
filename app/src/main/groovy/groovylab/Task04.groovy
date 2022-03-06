/**
Return n-th element of Fibonacci's sequence
(https://en.wikipedia.org/wiki/Fibonacci_number). Example:
Task04.fib(4) == 3
*/

package groovylab

class Task04 {
    public static int fib(int n) {
        def list = [0,1]
        (n==0)?(list[n]=0):(2..n).each{list[it]=list[it-2]+list[it-1]}
        return(list[n])
    }
}
