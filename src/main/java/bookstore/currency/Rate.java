package bookstore.currency;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Rate {
    private String currency;
    private String code;
    private Double mid;
}
