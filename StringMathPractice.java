public class StringMathPractice {

    // ===== Instance State =====
    private String text;

    // ===== Constructors =====
    public StringMathPractice() {
        // TODO: set a default value for the instance variable
    }

    public StringMathPractice(String input) {
        // TODO: set the instance variable to the "input" parameter
    }

    // ===== Easy String Challenges =====

    /**
     * Returns the number of characters in the instance variable 'text'.
     * Uses the .length() method.
     */
    public int getTextLength() {
        // TODO: return the number of characters
        return 0;
    }

    /**
     * Returns a portion (substring) of 'text' from start to end indexes.
     * Uses the .substring() method.
     */
    public String getSubstring(int start, int end) {
        // TODO: return a substring of text
        return null;
    }

    /**
     * Finds and returns the first index of the given substring within 'text'.
     * Uses the .indexOf() method.
     */
    public int findSubstringIndex(String sub) {
        // TODO: return index of sub in text
        return 0;
    }

    /**
     * Compares 'text' to another String alphabetically.
     * Uses the .compareTo() method.
     * Returns a negative number, zero, or positive number.
     */
    public int compareToOther(String other) {
        // TODO: compare text to other
        return 0;
    }

    /**
     * Checks if 'text' is equal to another String.
     * Uses the .equals() method.
     */
    public boolean isEqualTo(String other) {
        // TODO: return true if equal
        return false;
    }

    // ===== Easy Math Challenges =====

    /**
     * Returns a random number between 0 and 1.
     * Uses Math.random().
     */
    public double getRandomValue() {
        // TODO: return random number
        return 0.0;
    }

    /**
     * Returns the result of raising base to the exponent.
     * Uses Math.pow().
     */
    public double raiseToPower(double base, double exponent) {
        // TODO: return base ^ exponent
        return 0.0;
    }

    /**
     * Returns the absolute value of a number.
     * Uses Math.abs().
     */
    public double getAbsoluteValue(double number) {
        // TODO: return |number|
        return 0.0;
    }

    // ========== HARDER STRING METHOD ==========

    /**
     * Returns a string of length stringLength with random characters between a-z
     * Hint: you can print out a character by casting it as a "char" datatype
     * You might need to do a little research on ASCII characters and casting using (char)
     */
    public String randomString(int stringLength) {
        // TODO: build and return a random string of lowercase letters
        return "";
    }

    // ========== HARDER MATH METHODS ==========

    /**
     * Compute (|base| ^ exponent), then return the ABSOLUTE DIFFERENCE
     * between that result and the same power computed on 'otherBase'.
     * I.e., | |base|^exp  -  |otherBase|^exp |
     * Uses Math.abs() and Math.pow().
     */
    public double powerGap(double base, double otherBase, double exponent) {
        // TODO: compute Math.pow(Math.abs(base), exponent) and same for otherBase; return Math.abs(diff)
        return 0.0;
    }

    /**
     * Return the (non-negative) distance between two points (x1, y1) and (x2, y2)
     * using the distance formula: sqrt( (x2-x1)^2 + (y2-y1)^2 ).
     * Implement sqrt via Math.pow(value, 0.5).
     * Uses Math.abs() and Math.pow().
     */
    public double distance2D(double x1, double y1, double x2, double y2) {
        // TODO: dx = Math.abs(x2 - x1), dy = Math.abs(y2 - y1), distance = Math.pow(dx*dx + dy*dy, 0.5)
        return 0.0;
    }

    public static void main(String[] args) {
        // here is where you should instantiate an object or objects and test the various methods you have created above

    }
}
