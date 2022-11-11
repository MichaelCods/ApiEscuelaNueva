/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.apiescuelanueva.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.apiescuelanueva.entity.ApoderadoEntity;


public interface ApoderadoRepository extends JpaRepository<ApoderadoEntity, Long>{
     @Query("select p from  ApoderadoEntity p where p.codigo=1")
    List<ApoderadoEntity> findAllCustom();
    
}
