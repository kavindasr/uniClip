import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class UClipboard {
    private Toolkit toolkit;
    private Clipboard clipboard;

    public UClipboard() {
        this.toolkit = Toolkit.getDefaultToolkit();
        this.clipboard = toolkit.getSystemClipboard();
    }

    public String getValue() {
        try {
            return (String)this.clipboard.getData(DataFlavor.stringFlavor);
        } catch (UnsupportedFlavorException e) {
            return "";
        } catch (IOException e) {
            return "";
        }
    }

    public void setValue(String value) {
        StringSelection theValue = new StringSelection(value);
        clipboard.setContents(theValue, null);
    }
}
