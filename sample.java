// Time Complexity : N^2
// Space Complexity : N
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : 


// Your code here along with comments explaining your approach
//if the temprate of next day is greater than current then take difference of index and add to result array
public int[] dailyTemperatures(int[] T) {
    int [] result = new int[T.length];
    for(int i=0;i<T.length;i++){
        for(int j=i+1;j<T.length;j++){
            if (T[i]<T[j]){
                result[i] = j-i;
                break;
            }
        }
    }
  return result;  
}  
}
O(N) ,O(N)
//Optimized Solution
 //only add element idf the next temp is higher than current and manipulate array
 public int[] dailyTemperatures(int[] T) {
    int [] result = new int[T.length];
    Stack<Integer> stack = new Stack<>();
    for(int i=0;i<T.length;i++){
        while(!stack.isEmpty() && T[stack.peek()]<T[i]){
           
            //add result in array
            result[stack.peek()] = i-stack.pop();
            
        }
        stack.push(i);
    }
  return result;  
}
}

