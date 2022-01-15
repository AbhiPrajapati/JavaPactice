class Solution {
    public static boolean possiblyEquals(String s1, String s2) {
        String pri,sec;
        if(s1.equals(s2))
        {
            return  true;
        }
        if(s1.length() > s2.length())
        {
            pri = s1;
            sec = s2;
        }else{
            pri = s2;
            sec = s1;
        }
        System.out.println("primary :" + pri + " Secondary:" + sec);
        if(!checkInt(pri))
        {
            int privar =0;
            for (int i = 0; i < sec.length(); i++) {
                if(privar == pri.length()-1) return true;
                if(pri.charAt(privar) == sec.charAt(i))
                {

                    privar++;
                    System.out.println("equal   "+" privae " + privar);

                }else{
                    if(Character.isDigit(sec.charAt(i)))
                    {
                        System.out.println("this is digit");
                        int main = Integer.parseInt(String.valueOf(sec.charAt(i)));
                        privar = privar+main;
                        System.out.println("privar2 : "+privar);

                    }else{
                        return false;
                    }
                }
            }
        }else{
            
            System.out.println("Lagi padi hai");
        }


        return false;
    }
    public static boolean checkInt(String s)
    {
        for (int i = 0; i < s.length(); i++) {
            if(Character.isDigit(s.charAt(i)))
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String s1 = "innn";
        String s2 = "i2n";
        System.out.println(checkInt("abcd124"));
        System.out.println(checkInt("abcd"));
        System.out.println(possiblyEquals(s1,s2));
    }

}
