package co.com.mybank.customers.repository;

import co.com.mybank.customers.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {


    Optional<Customer> findByDocument(String document);

    Optional<Customer> findByEmail(String email);
}
