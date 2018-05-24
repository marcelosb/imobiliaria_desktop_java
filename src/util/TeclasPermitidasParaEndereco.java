
package util;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author Marcelo
 */
public class TeclasPermitidasParaEndereco extends PlainDocument { 
    
        @Override
        public void insertString(int offs, String palavra, AttributeSet a) throws BadLocationException {
            super.insertString(offs, palavra.replaceAll("[*]", "").toUpperCase(), a);
        }
        
}
