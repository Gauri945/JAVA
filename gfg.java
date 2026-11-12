public class gfg {
    

        public int peakElement(int[] arr) {
            int n = arr.length;
            
            // Edge case: if there is only one element, return the element itself
            if (n == 1) return arr[0];
            
            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    if (arr[i] > arr[i + 1]) {
                        return arr[i]; // Return the value of the peak element
                    }
                }   
                else if (i == n - 1) {
                    if (arr[i] > arr[i - 1]) {
                        return arr[i]; // Return the value of the peak element
                    }
                } 
                else {
                    if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                        return arr[i]; // Return the value of the peak element
                    }
                }
            }
            
            return -1; // This should never be reached if the array has at least one peak
        }
    }
    

