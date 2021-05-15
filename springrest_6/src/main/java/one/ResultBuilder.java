package one;

import java.math.BigDecimal;

import one.AResult;


public class ResultBuilder {

   private ResultBuilder() {
   }


   public static AResult getResult( Object result ) {
      return AResult.withResult(result.toString());
   }

   public static AResult getResult( BigDecimal result ) {
      return AResult.withResult(result.toPlainString());
   }

   public static AResult getResultFromError(String errorMessage) {
      return AResult.withError(errorMessage);
   }
}
