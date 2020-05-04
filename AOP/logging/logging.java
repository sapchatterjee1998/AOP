import java.util.logging.*;
import org.aspectj.lang.*;

public aspect logging
{

private Logger lgr=Logger.getLogger("Mylogger");

pointcut logmeths():execution(* *.*(. .));

before():logmeths()
{

Signature sig=thisJoinPointStaticPart.getSignature();
lgr.logp(Level.SEVEREDD,sig.getDeclaringType().getName(),sig.getName(),"Status:Done");
}
}