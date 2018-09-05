package edu.gatech.seclass;

/**
 * Interface created for use in Georgia Tech CS6300.
 *
 * This is an interface for a simple class that represents a string, defined
 * as a sequence of characters.
 *
 * This interface should NOT be altered in any way.
 */
public interface MyCustomStringInterface {

    /**
     * Returns the current string.
     * If the string is null, or has not been set to a value, it should return null.
     *
     * @return Current string
     */
    String getString();

    /**
     * Sets the value of the current string
     *
     * @param string The value to be set
     */
    void setString(String string);

    /**
     * Returns the number of duplicated characters.
     * This will count the number of characters that are immediately followed by another
     * identical character, even if the pairs overlap.
     * 
     * If the current string is null or empty, the method should return 0.
     * 
     * Examples:
     * - countDoubles would return 4 for string "Billy has 111 apples".
     *
     * @return Number of doubled characters in the current string
     */
    int countDuplicates();

    /**
     * Returns a string equivalent to the original string with n or -n added to every digit in the string.
     * If 'positive' is true, n is added to every digit.
     * If 'positive' is false, n is subtracted.
     * The digit will wrap from 9 to 0 or 0 to 9 whenever it passes those values.
     *
     * Examples:
     * - For n=2 and positive=true, "hello 90, bye 2" would be converted to "hello 12, bye 4".
     * - For n=4 and positive=true, "1234567890" would be converted to "5678901234".
     * - For n=2 and positive=false, "hello 90, bye 2" would be converted to "hello 78, bye 0".
     * - For n=4 and positive=false, "1234567890" would be converted to "7890123456".
     *
     * @param n amount to increment or decrement every digit
     * @param positive Boolean that indicates n should be treated as positive or negative
     * @return String with the original string's digits incremented or decremented by n
     * @throws NullPointerException     If the current string is null
     * @throws IllegalArgumentException If n > 9 or n <=0 (and the current string is not null)
     */
    String addDigits(int n, boolean positive);

    /**
     * Reverses the position of all letters (i.e. a-z and A-Z) in the current string, between startPosition and endPosition (both inclusive).
     * The first letter will become the last, and the last will become the first.  All other characters remain unchanged.
     * *Note: The first character in the string is considered to be in Position 1.
     * 
     * Examples:
     * - String "Rat" would be converted to "taR"
     * - String "3 Cats, 2 Dogs." would be converted to "3 sgoD, 2 staC."
     *
     * @param startPosition Position of the first character to consider
     * @param endPosition   Position of the last character to consider
     * @throws NullPointerException        If the current string is null
     * @throws MyIndexOutOfBoundsException If endPosition is > the length of the string or startPosition <= 0
     *                                     (and the current string is not null)
     * @throws IllegalArgumentException    If startPosition > endPosition
     *                                     (and the current string is not null, and neither position is out of bounds)
     */
    void flipLetttersInSubstring(int startPosition, int endPosition);
}
