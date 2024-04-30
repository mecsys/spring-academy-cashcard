package example.cashcard;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/cashcards")
public class CashCardController {

  @GetMapping("/{requestedId}")
  private ResponseEntity<CashCard> findById(@PathVariable Long requestedId) {

    if(requestedId.equals(99L)) {
      CashCard cashCard = new CashCard(99L, 123.45);
      return ResponseEntity.ok(cashCard);
    } else {
      return ResponseEntity.notFound().build();
    }
    
  }

}
