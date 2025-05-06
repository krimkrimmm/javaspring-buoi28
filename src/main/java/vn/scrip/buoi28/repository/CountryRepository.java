package vn.scrip.buoi28.repository;

import vn.scrip.buoi28.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CountryRepository extends JpaRepository<Country, Integer> {
}