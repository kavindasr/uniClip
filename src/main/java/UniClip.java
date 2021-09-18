public class UniClip {
    public static void main(String[] args) {
        UClipboard uClipboard = new UClipboard();
        System.out.println(uClipboard.getValue());
        uClipboard.setValue("HOOLA");
        System.out.println(uClipboard.getValue());
    }
}
