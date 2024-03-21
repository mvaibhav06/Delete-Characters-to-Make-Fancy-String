public class FancyString {
    public static String makeStringFancy(String s){
        StringBuffer sb = new StringBuffer(s);

        for(int i=0; i<sb.length(); i++){

            while (i<sb.length()-2 && sb.charAt(i)==sb.charAt(i+1) && sb.charAt(i)==sb.charAt(i+2)){
                sb.delete(i,i+1);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(makeStringFancy("abbcccddddeeeee"));
    }
}
