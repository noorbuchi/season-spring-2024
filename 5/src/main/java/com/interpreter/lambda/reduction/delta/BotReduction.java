package com.interpreter.lambda.reduction.delta;

import com.interpreter.lambda.ast.ASTConstant;
import com.interpreter.lambda.ast.ASTTerm;

import java.util.List;
import java.util.Optional;

/**
 * Represents the bottom constant (i.e. non-termination)
 */
public class BotReduction extends DeltaReduction {
    @Override
    public int getNumberOfArguments() {
        return 0;
    }

    @Override
    public boolean isConstantMatching(ASTConstant c) {
        return (c.getValue().equals(PredefinedFunction.BOT));
    }

    @Override
    public Optional<ASTTerm> getRHS(ASTConstant constant, List<ASTTerm> terms) {
        // the constant must be BOT and it has no arguments
        if (isSignatureMatching(constant, terms)) {
            // bot -> bot
            return Optional.of(constant);
        }
        else {
            return Optional.empty();
        }
    }
}
