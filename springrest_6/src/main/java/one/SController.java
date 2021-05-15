package one;


import java.math.BigDecimal;
import java.math.BigInteger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import one.AResult;
import one.CalculatorService;




@RestController
@RequestMapping("/scientific")
public class SController {

   private final CalculatorService _scientificCalculator;

   public SController( CalculatorService scientificCalculator) {
      _scientificCalculator = scientificCalculator;
   }

   @GetMapping("/square/{factor}")
   public AResult square(@PathVariable BigDecimal factor ) {
      return getResult(factor.multiply(factor));
   }

   @GetMapping("/factorial/{number}")
   public AResult factorial(@PathVariable int number ) {
      try {
         BigInteger factorial = _scientificCalculator.calculateFactorial(number);
         return getResult(factorial);
      }
      catch ( ArithmeticException e ) {
         return getResultFromError(e.getMessage());
      }
   }

   @GetMapping("/prime/{number}")
   public AResult prime(@PathVariable long number ) {
      return getResult(_scientificCalculator.isPrime(number));
   }
}
