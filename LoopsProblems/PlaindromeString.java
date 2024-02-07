public class PlaindromeString {
    public static boolean isPlaindrome(String str,int n){
        int left=0;
        int right=n-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str="NITIN";
        
        int j=str.length();
     boolean flage=isPlaindrome(str,j);
        if(flage==true) System.out.println("Yes");
        else System.out.println("No"); 
    }
}
