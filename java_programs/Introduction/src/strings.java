public class strings {
    public static void main(String[] args){
        String a,b,c,d,e;
        a="The";
        b="world";
        c="is";
        d="beautifull";
        e="pretty";
        String result=a.charAt(0)+"";
        result+=a.charAt(0);
        result+=b.charAt(0);
        result+=c.charAt(0);
        result+=d.charAt(0);
        result+=e.charAt(0);

        result+=a.charAt(a.length()-1);
        result+=b.charAt(b.length()-1);
        result+=c.charAt(c.length()-1);
        result+=d.charAt(d.length()-1);
        result+=e.charAt(e.length()-1);

        System.out.println(result);
        }
    
}
