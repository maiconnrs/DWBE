package br.com.siteperiscopio.repository;

import br.com.siteperiscopio.models.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryEvent extends JpaRepository<Event, Integer> {


}
