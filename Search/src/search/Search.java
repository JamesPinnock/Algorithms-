package search;

/**
 * Class of operations on ordered lists of strings. You should fill in the
 * bodies of these methods.
 */
public class Search {

    public int longestWord(StringList a) {

//        int largetWord = a.get(0).length();
        int index = 0;
        int i = 0;

        while (i < a.size()) {

            if (a.get(i).length() > a.get(index).length()) {
                index = i;

                i = a.get(i).length();

            }

            i = i + 1;

        }

        return index;
    }

    /**
     * Returns the number of unique elements in the list
     *
     * @param a list of strings, in ascending order
     * @return number of unique elements in the list.
     */
    public int countUnique(StringList a) {
	// I could really do with renaming these
	// they are too ambiguous

        int i = 1;
        int c = 0;
        int j = 0;

        boolean unique = true;

        while (i < a.size()) {

            if (a.get(i) != a.get(i - 1)) {
                c = c + 1;
            } else {
                c = c + 1;
            }
            i = i + 1;
        }
        return c;
    }

    public String mostFrequent(StringList a) {

        String previous = null;
        String Frequent = null;

        int reptd = 0;
        int i = 0;
        int c = 0;

        while (i < a.size()) {
            if (!a.get(i).equals(previous)) {
                c = 0;
                previous = a.get(i);
            } else if (c > reptd) {
                reptd = c;
                Frequent = previous;
            } else {
                c = c + 1;
            }
            i = i + 1;
        }
        return Frequent;
    }

    public int findElement(StringList a, String k) {
        // replace the following line with your implementation

        int lo = 0;
        int hi = a.size() - 1;
        int mid;

        while (lo <= hi) {
            mid = (lo + hi) / 2;

            if (a.get(mid).compareTo(k) < 0) {
                lo = mid + 1;
            } else if (a.get(lo).compareTo(k) > 0) {
                hi = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    /**
     * Position of a string in an ordered collection
     *
     * @param a collection of strings, in ascending order
     * @param k string to search for
     * @return number of strings in the collection a greater than or equal to k
     */
    public int countGreaterOrEqual(StringList a, String k) {
        // replace the following line with your implementation
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int countGreater(StringList a, String k) {
        // replace the following line with your implementation

        int hi = a.size() - 1;
        int mid = 0;
        int lo = 0;

        while (lo <= hi) {
            mid = (hi + lo) / 2;
            if (a.get(mid).compareTo(k) <= 0) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return (a.size() - lo);
    }

    /**
     * Determine the size of a range in an ordered collection
     *
     * @param a collection of strings, in ascending order
     * @param k1 first string to search for
     * @param k2 second string to search for (greater than or equal to k1)
     * @return number of strings between k1 and k2 (inclusive)
     */
    public int countBetween(StringList a, String k1, String k2) {
        // replace the following line with your implementation
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int countMatches(StringList a, String prefix, String substring) {
        // replace the following line with your implementation
        String at;
        int count = 0;
        int i = 0;
        while (i < a.size()) {
            if (a.get(i).startsWith(prefix) && a.get(i).contains(substring)) {
                count = count + 1;
            }
            i = i + 1;
        }
        return count;
    }
}
