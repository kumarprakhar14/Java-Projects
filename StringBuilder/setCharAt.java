package StringBuilder;

public class setCharAt {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");

        //char at index 0
        System.out.println(sb.charAt(0));

        //set char at index 0
        sb.setCharAt(0, 'P');
        System.out.println(sb);
    }
}
