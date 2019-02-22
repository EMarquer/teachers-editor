package document;

/**
 *  Interface to record the methods requested by a user when pressing "Show statistics" button in the GUI.
 *  The interface itself is never called and used to conveniently separate the methods for basic and extended
 *  analysis of the text. The first to be updated in the next release.
 * @author Elena Khasanova
 * @version 1.0;
 * **/

interface ExtendedTextEvaluator {

    /** Calculates the number of occurrences of the words of major parts of speech**/
    void getPOSNumber();

    /** Calculates the number of occurrences of certain grammar forms**/
    void grammarAnalyser();

/// add the method that returns the level based on several wordlists;
// add the method that decides on the level considering grammar
}
