import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;
public class Histogram {
    static int largestSquareArea(int[] histogram)
    {
        Deque<Integer> stack = new LinkedList<>();
        int i=0, maxArea = 0;

        while (i < histogram.length) {
            // Stack keeps track of last largest height. As soon as we
            // encounter a height which is less than the previous height,
            // we need to find the maximum area for the bar at the top of stack as
            // the area cannot be extended to the right. 
            while (!stack.isEmpty() && histogram[i] < histogram[stack.peek()]) {
                int idx = stack.pop();
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                int edge = Math.min(width, histogram[idx]);
                maxArea = Math.max(maxArea, edge * edge);
            }

            stack.push(i++);
        }

        while (!stack.isEmpty()) {
            int idx = stack.pop();
            int width = stack.isEmpty() ? i : i - stack.peek() - 1;
            int edge = Math.min(width, histogram[idx]);
            maxArea = Math.max(maxArea, edge * edge);
        }

        return maxArea;
    }
    public static void main(String[] args) {
        int[] n={0,0,0,9,0,0};
        System.out.println(largestSquareArea(n));
    }
}
