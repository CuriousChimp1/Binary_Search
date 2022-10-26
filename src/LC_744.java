public class LC_744 {
    public static void main(String[] args) {
        char[] a = {'e','e','e','e', 'e', 'e', 'e', 'e', 'e', 'n', 'n', 'n',};
        char t = 'e';
        char ans = nextGreatestLetter(a, t);
        System.out.println(ans);
    }
    /*
    static char nextGreatestLetter(char[] a, char t) {
        int s = 0;
        int e = a.length - 1;

        if(a[s] > t || t >= a[e])
            return a[s];

        while (s <= e){
            int m = s + (e - s) / 2;

            if(t > a[m])
                s = m + 1;
            else if(t < a[m])
                e = m - 1;
            else{
                int i = m + 1;
                while(a[m] != a[i])
                    return a[i];
            }
        }
    return '\0';
    }
    */

    static char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        if(target >= letters[n - 1]) return letters[0];

        int left = 0;
        int right = n - 1;
        while(left < right){
            int mid = left + (right - left)/2;
            if(letters[mid] <= target) left = mid + 1;
            else right = mid;
        }

        return letters[right];
    }

}
