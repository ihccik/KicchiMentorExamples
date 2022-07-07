package week9;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class OpenURL {

  public static void main(String[] args) throws URISyntaxException, IOException {
    Desktop desk=Desktop.getDesktop();
    desk.browse(new URI("http://google.com"));
  }
}
