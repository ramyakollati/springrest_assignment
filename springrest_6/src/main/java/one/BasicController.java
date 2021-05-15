package one;




import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/basic")
public class BasicController {

   @GetMapping("/add")
   public AResult add(@RequestParam BigDecimal augend, @RequestParam BigDecimal addend ) {
      return getResult(augend.add(addend));
   }

   @GetMapping("/subtract")
   public AResult subtract(@RequestParam BigDecimal minuent, @RequestParam BigDecimal subtrahend) {
      return getResult(minuent.subtract(subtrahend));
   }

   @GetMapping("/multiply")
   public AResult multiply(@RequestParam BigDecimal multiplier, @RequestParam BigDecimal multiplicand) {
      return getResult(multiplier.multiply(multiplicand));
   }
   @GetMapping("/squareroot")
   public AResult squareroot(@RequestParam BigDecimal number) {
      return getResult(number.sqrt(new MathContext(10)));
   }


   @GetMapping("/divide")
   public AResult divide(@RequestParam BigDecimal dividend, @RequestParam BigDecimal divisor) {
      if (divisor.equals(BigDecimal.ZERO)) {
         return getResultFromError("no division by null");
      }
      return getResult(dividend.divide(divisor, RoundingMode.HALF_EVEN));
   }

}
