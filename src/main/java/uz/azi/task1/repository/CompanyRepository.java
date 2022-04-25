package uz.azi.task1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.azi.task1.entity.Company;

/**
 * @Author Aziza Tojiboyeva
 */
@Repository
public interface CompanyRepository  extends JpaRepository<Company, Long> {
}
