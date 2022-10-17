package baeldung_solid.open_extension_closed_modification;

//we decide the Guitar is a little boring and could use a cool flame pattern to make it look more rock and roll.
//At this point, it might be tempting to just open up the Guitar class and add a flame pattern —
//but who knows what errors that might throw up in our application.
//Instead, let's stick to the open-closed principle and simply extend our Guitar class
public class SuperCoolGuitarWithFlames extends Guitar {
  private String flameColor;
}
