package List;

public class Start {
    public static void main(String[] args) {

        Element elementN = new Element(4);

        System.out.println("Adding new elements: ");
        elementN.add(1);
        elementN.add(2);
        elementN.add(3);
        elementN.add(4);
        outPrint(elementN);

        System.out.println("Amount of elements: " + "\n" + elementN.size());

        System.out.println("Removing an element at an index (3): ");
        elementN.remove(3);
        outPrint(elementN);

        System.out.println("Add new element by index (3): ");
        elementN.add(3, 100);
        outPrint(elementN);

        System.out.println("Replace element by index (1): ");
        elementN.set(1, 200);
        outPrint(elementN);

        System.out.println("Element under index (2): " + "\n" + elementN.get(2));

        System.out.println("Remove element with value (200): ");
        elementN.removeByValue(200);
        outPrint(elementN);

        System.out.println("Checking for elements" +
                "(isEmpty()): " + "\n" + elementN.isEmpty());

        System.out.println("Removing all elements: ");
        elementN.clear();
        outPrint(elementN);
    }

    private static void outPrint(Element elementN) {
        for (int i = 0; i < 4; i++) {
            System.out.print(elementN.get(i) + " ");
        }
        System.out.print("\n");
    }
}
