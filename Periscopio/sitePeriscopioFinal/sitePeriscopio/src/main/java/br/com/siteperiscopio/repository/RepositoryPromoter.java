package br.com.siteperiscopio.repository;

import br.com.siteperiscopio.models.Promoter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryPromoter extends JpaRepository<Promoter, Integer> {
}
