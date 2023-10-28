public class Main {
    public static void main(String[] args) {
        int[] newList = {74,59,97,54,-88};

        System.out.println("Największy element listy: " + SortingAlgorithm.findMax(newList));
        System.out.println("Najmniejszy element listy: " + SortingAlgorithm.findMin(newList));
        System.out.println("Index największego elementu: " + SortingAlgorithm.giveMaxPos(newList));
        System.out.println("Index najmniejszego elementu: " + SortingAlgorithm.giveMinPos(newList, 0));
        System.out.println("Lista po posortowaniu: " + SortingAlgorithm.simpleSort(newList));
    }
}

