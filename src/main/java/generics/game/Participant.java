package generics.game;

import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
@Getter
public abstract class Participant {
    private String name;
    private int age;
}
