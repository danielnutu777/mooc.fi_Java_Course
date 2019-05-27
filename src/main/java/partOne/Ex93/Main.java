public class Main {
  public static void main(String[] args) {
    // write test code here
    // Person pekka = new Person("Pekka", 15, 2, 1993);
    Person pekka = new Person("Pekka", 15, 2, 1983);
    Person martin = new Person("Martin", 1, 3, 1983);

    int j = pekka.age();
    int i = martin.age();

    System.out.println( martin.getName() + " is older than " +  pekka.getName() + ": "+ martin.olderThan(pekka) );
    System.out.println( pekka.getName() + " is older than " +  martin.getName() + ": "+ pekka.olderThan(martin) );
  }
}
