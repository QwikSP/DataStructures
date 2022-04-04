package Week_2;

import Week_1.QueueManager;

/**
 * Driver Class
 * Tests queue with string, integers, and mixes of Classes and types
 */
public class QueueTester {
    public static void main(String[] args) {
        // Create iterable Queue of Words
        Object[] words = new String[]{"seven", "slimy", "snakes", "sallying", "slowly", "slithered", "southward"};
        QueueManager qWords = new QueueManager("Words", words);
        qWords.removeList(words);

    }
}
