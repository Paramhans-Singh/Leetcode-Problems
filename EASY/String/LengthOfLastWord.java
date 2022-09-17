public class LengthOfLastWord{
    public static int lengthOfLastWord(String s) {
        char[] ch = s.toCharArray();
        boolean flag = false;
        int ans = 0;
        for (int i = s.length() - 1; i > -1; i--) {
            if (ch[i] != ' ') {
                ans++;
                flag = true;
            }
            if(ch[i]==' '&& flag==true  )
            { 
            break;
            }
        }
        return ans;
    }
    public static void main (String[] args){
        String s = "   fly me   to   the moon  ";
        int ans = lengthOfLastWord(s);

        System.out.println(ans);

    }
}