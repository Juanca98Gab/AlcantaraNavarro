

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "categoria", path = "categoria")
public interface categoriarepositorio extends PagingAndSortingRepository<categoria, Integer>, CrudRepository<categoria, Integer> {
    
    List<instrumento> findByNombre(@Param("nombre") String nombre);

}
