 public class Solution {
 public int maxArea(int[] height){
    int n = height.length;
    int maxWater = 0;
    int lp = 0,rp=n-1;
    while(lp<rp){
            int width = rp-lp;
            int minheight = Math.min(height[lp],height[rp]);
            int area = width * minheight;
            maxWater = Math.max(maxWater,area);
           int temp =  height[lp]<height[rp]? lp++:rp--;
    }
    return maxWater;
 }
 }
