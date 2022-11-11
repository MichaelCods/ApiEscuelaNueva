/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.apiescuelanueva.repository;

//primero hacer una herencia

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.apiescuelanueva.entity.DistritoEntity;

public interface DistritoRepository extends JpaRepository<DistritoEntity, Long>{
    @Query("select p from  DistritoEntity p where p.codigo=1")
    List<DistritoEntity> findAllCustom();
}
