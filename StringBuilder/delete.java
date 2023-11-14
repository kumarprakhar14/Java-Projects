package StringBuilder;

public class delete {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tonny");
        sb.delete(2, 3); //end index is non inclusive
        System.out.println(sb);
    }
}
