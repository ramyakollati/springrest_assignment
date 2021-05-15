package one;

public class AResult {

   private String AResult;
   private String error;

   private AResult() {
   }

   static AResult withAResult(String AResultMessage) {
      AResult AResult = new AResult();
      AResult.AResult = AResultMessage;
      return AResult;
   }

   static AResult withError(String errorMessage) {
      AResult AResult = new AResult();
      AResult.error = errorMessage;
      return AResult;
   }

   public String getAResult() {
      return AResult;
   }

   public String getError() {
      return error;
   }
}
