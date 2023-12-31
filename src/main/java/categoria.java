

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OrderBy;
import jakarta.persistence.Table;

@Entity
@Table(name = "categoria")
public class categoria {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String nombre;
    @OneToMany(targetEntity = instrumento.class, mappedBy = "categoria")
    @OrderBy("nombre ASC")
    private Set<instrumento> instrumentos = new HashSet<instrumento>();

    public Set<instrumento> getinstrumentos() {
        return instrumentos;
    }
    public void setinstrumentos(Set<instrumento> instrumentos) {
        this.instrumentos = instrumentos;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
