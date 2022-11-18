package br.com.siteperiscopio.repository;

import br.com.siteperiscopio.models.Place;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryPlace extends JpaRepository<Place, Integer> {
}
