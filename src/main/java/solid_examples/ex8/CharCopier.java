package solid_examples.ex8;

public class CharCopier {

  void copy(Reader reader, Writer writer) {
    Character c;

    while ((c = reader.getChar()) != null) {
      writer.putChar(c);
    }
  }
}
