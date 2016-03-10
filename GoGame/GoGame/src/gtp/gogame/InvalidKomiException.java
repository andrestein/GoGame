// InvalidKomiException.java

package gtp.gogame;



/** Exception thrown if parsing a komi from a string fails. */
public class InvalidKomiException
    extends Error
{
    public InvalidKomiException(String s)
    {
        super("Invalid komi: " + s);
    }
}
