public class Ceiling {
    public static void main(String[] args) {
        int[] a = {-1, 0, 1, 4, 6, 8, 90};
        int t = 105;
        int ans = ceiling(a, t);
        int ans1 = flooring(a, t);
        System.out.println(ans);
        System.out.println(ans1);
    }

    static int ceiling(int[] a, int t){
        int s = 0;
        int e = a.length - 1;

        if(t > a[e])
            return a[e];

        while(s <= e){
            int m = (s + e) / 2;

            if(a[m] < t)
                s = m + 1;
            else if(a[m] > t)
                e = m - 1;
            else
                return a[m];
        }
        return a[s];
    }

    static int flooring(int[] a, int t){
        int s = 0;
        int e = a.length - 1;

        if(t < a[s])
            return a[s];

        while(s <= e){
            int m = (s + e) / 2;

            if(a[m] < t)
                s = m + 1;
            else if(a[m] > t)
                e = m - 1;
            else
                return a[m];
        }
        return a[e];
    }
}
