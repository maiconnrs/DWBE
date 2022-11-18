package br.com.siteperiscopio.repository;

import br.com.siteperiscopio.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryUser extends JpaRepository<User, Integer> {
}
