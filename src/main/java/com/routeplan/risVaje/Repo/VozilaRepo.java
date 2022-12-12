package com.routeplan.risVaje.Repo;

import com.routeplan.risVaje.Models.Vozila;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

@Repository
public interface VozilaRepo extends CrudRepository <Vozila,Long> {

    @Query(value = "SELECT * FROM vozila u WHERE v.proizvajalec='audi' ", nativeQuery = true)
    public abstract List<Vozila> vrniVozilo(String model, String proizvajalec) ;


}
