package week27.algo.phonebook;

public class Runner {

  public static void main(String[] args) {
    PhoneBookSinglyLinkedList list = new PhoneBookSinglyLinkedList();
    list.add(new Contact("Glenio", "Faria", "glenio.faria@gmail.com", "8787899"));
    list.add(new Contact("Ekaterina", "Sementeva", "ekaterina.sementeva@gmail.com", "435454345"));
    list.add(new Contact("Yuliia", "Karnoza", "yulia.karnoza@gmail.com", "879898789"));
    list.add(new Contact("Sumeye", "Dalkilinc", "dalkilincsumeye@gmail.com", "34753753"));
    list.add(new Contact("Sebastian", "Early", "sebas4idua@gmail.com", "9898989989"));
    list.add(new Contact("Yusuf", "Abakli", "abakliyusufziya@gmail.com", "8776554343"));
    list.add(new Contact("Iskender", "Colak", "iclk84@gmail.com", "12345689"));
    list.add(new Contact("Mehmet", "Ozbekler", "mehmetozbekler@gmail.com", "908734321"));
    list.add(new Contact("Mehmet", "Hero", "mehmet@hero.com", "54869987"));
    list.add(new Contact("Mehmet", "TheTeacher", "mehmet@theteacher.com", "46566765"));
    list.add(new Contact("Yusuf", "Hero", "yusuf@hero.com", "9088787675"));

    //list.deleteFirstNode(); list.printPhoneBook();

    //list.deleteLastNode(); list.printPhoneBook();

    //list.deleteByFirstName("Mehmet"); list.printPhoneBook();

    list.deleteAllMatchingLastName("Hero"); list.printPhoneBook();
  }
}
