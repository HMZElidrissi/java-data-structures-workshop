import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class DataStructuresExercises {

    @Test
    public void testArrayList() {
        // TODO: Créez une ArrayList de String nommée 'fruits'

        // TODO: Ajoutez "pomme", "banane", et "orange" à la liste

        assertEquals(3, fruits.size());

        assertEquals("banane", fruits.get(1));

        // TODO: Supprimez "banane" de la liste
        assertEquals(2, fruits.size());
    }

    @Test
    public void testLinkedList() {
        // TODO: Créez une LinkedList de Integer nommée 'numbers'

        // TODO: Ajoutez les nombres 10, 20, 30 à la liste

        // TODO: Insérez le nombre 15 à l'index 1

        assertEquals(10, numbers.getFirst());
        assertEquals(30, numbers.getLast());

        // TODO: Supprimez le premier élément

        assertEquals(3, numbers.size());
    }

    @Test
    public void testStack() {
        // TODO: Créez un Stack de Character nommé 'stack'


        // TODO: Ajoutez les caractères 'A', 'B', 'C' au stack

        assertEquals('C', stack.peek());

        // TODO: Retirez deux éléments du stack
        assertEquals(1, stack.size());
    }

    @Test
    public void testQueue() {
        // TODO: Créez une Queue de String nommée 'queue' en utilisant LinkedList


        // TODO: Ajoutez "premier", "deuxième", "troisième" à la queue

        assertEquals("premier", queue.peek());

        // TODO: Retirez deux éléments

        assertEquals(1, queue.size());
    }

    @Test
    public void testHashMap() {
        // TODO: Créez une HashMap<String, Integer> nommée 'ages'


        // TODO: Ajoutez trois paires clé-valeur : "Alice" -> 25, "Bob" -> 30, "Charlie" -> 35

        assertEquals(3, ages.size());

        assertEquals(30, ages.get("Bob"));

        // TODO: Mettez à jour l'âge d'Alice à 26

        assertEquals(26, ages.get("Alice"));
    }

    @Test
    public void testHashSet() {
        // TODO: Créez un HashSet de Integer nommé 'uniqueNumbers'

        // TODO: Ajoutez les nombres 1, 2, 3, 2, 1

        assertEquals(3, uniqueNumbers.size());

        assertTrue(uniqueNumbers.contains(2));

        // TODO: Supprimez 2

        assertEquals(2, uniqueNumbers.size());
    }
}