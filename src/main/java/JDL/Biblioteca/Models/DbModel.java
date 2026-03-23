package JDL.Biblioteca.Models;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class DbModel {

    protected int id;
    
    public DbModel(int id) {
        this.id = id;
    }
}
