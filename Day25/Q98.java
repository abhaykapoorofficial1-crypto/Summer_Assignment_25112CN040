public class Q98 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        for(int i = 0 ; i<str1.length() ; i++){
            char ch = str1.charAt(i);
            if(str2.indexOf(ch) != -1 && str1.indexOf(ch) == i){
                System.out.println(ch+" ");
            }
        }
    }
}
