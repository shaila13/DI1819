
package org.netbeans.validation.api.builtin.stringvalidation;

import org.netbeans.validation.api.Problems;
import org.openide.util.NbBundle;

/**
 *
 * @author Shaila
 */
public class MayusculaValidator extends StringValidator{

    @Override
    public void validate(Problems problems, String compName, String texto) {
        if (!texto.isEmpty() && !Character.isUpperCase(texto.charAt(0))) {
           String message=NbBundle.getMessage(MayusculaValidator.class, "VALIDATION_CAPITAL_LETTER",compName);
           problems.add(message);
        }
    }
    
}
