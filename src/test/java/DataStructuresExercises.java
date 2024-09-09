import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class DataStructuresExercises {

    @Test
    public void testArrayList() {
        // TODO: Créez une ArrayList de String nommée 'fruits'
        List<String> fruits=new ArrayList<>();
        // TODO: Ajoutez "pomme", "banane", et "orange" à la liste
        fruits.add("pomme");
        fruits.add("banane");
        fruits.add("orange");
        assertEquals(3, fruits.size());

        assertEquals("banane", fruits.get(1));

        // TODO: Supprimez "banane" de la liste
        fruits.remove(1);
        assertEquals(2, fruits.size());
    }

    @Test
    public void testLinkedList() {
        // TODO: Créez une LinkedList de Integer nommée 'numbers'
        LinkedList<Integer> numbers = new LinkedList<>();
        // TODO: Ajoutez les nombres 10, 20, 30 à la liste
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        // TODO: Insérez le nombre 15 à l'index 1
            numbers.add(1, 15);
        assertEquals(10, numbers.getFirst());
        assertEquals(30, numbers.getLast());

        // TODO: Supprimez le premier élément
        numbers.removeFirst();
        assertEquals(3, numbers.size());
    }

    @Test
    public void testStack() {
        // TODO: Créez un Stack de Character nommé 'stack'
        Stack stack = new Stack();

        // TODO: Ajoutez les caractères 'A', 'B', 'C' au stack
        stack.push('A');
        stack.push('B');
        stack.push('C');
        assertEquals('C', stack.peek());

        // TODO: Retirez deux éléments du stack
        stack.pop();
        stack.pop();
        assertEquals(1, stack.size());
    }

    @Test
    public void testQueue() {
        // TODO: Créez une Queue de String nommée 'queue' en utilisant LinkedList
        Queue<String> queue= new LinkedList<>();

        // TODO: Ajoutez "premier", "deuxième", "troisième" à la queue
        queue.offer("premier");
        queue.offer("deuxième");
        queue.offer("troisième");

        assertEquals("premier", queue.peek());

        // TODO: Retirez deux éléments
        queue.poll();
        queue.poll();
        assertEquals(1, queue.size());
    }

    @Test
    public void testHashMap() {
        // TODO: Créez une HashMap<String, Integer> nommée 'ages'
        HashMap<String, Integer> ages = new HashMap<>();

        // TODO: Ajoutez trois paires clé-valeur : "Alice" -> 25, "Bob" -> 30, "Charlie" -> 35
        ages.put("Alice",25);
        ages.put("Bob",30);
        ages.put("Charlie",35);

        assertEquals(3, ages.size());

        assertEquals(30, ages.get("Bob"));

        // TODO: Mettez à jour l'âge d'Alice à 26
        ages.put("Alice",26);


        assertEquals(26, ages.get("Alice"));
    }

    @Test
    public void testHashSet() {
        // TODO: Créez un HashSet de Integer nommé 'uniqueNumbers'
        HashSet<Integer> uniqueNumbers = new HashSet<>();

        // TODO: Ajoutez les nombres 1, 2, 3, 2, 1
        uniqueNumbers.add(1);
        uniqueNumbers.add(1);
        uniqueNumbers.add(2);
        uniqueNumbers.add(3);
        assertEquals(3, uniqueNumbers.size());

        assertTrue(uniqueNumbers.contains(2));

        // TODO: Supprimez 2

        uniqueNumbers.remove(2);
        assertEquals(2, uniqueNumbers.size());
    }
}