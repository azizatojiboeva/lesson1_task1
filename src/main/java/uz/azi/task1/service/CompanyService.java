package uz.azi.task1.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.azi.task1.entity.Company;
import uz.azi.task1.repository.CompanyRepository;

import java.util.List;

/**
 * @Author Aziza Tojiboyeva
 */
@Service
@RequiredArgsConstructor
public class CompanyService {
    private final CompanyRepository repository;

    public List<Company> getAll() {
        return repository.findAll();
    }

    public Company getOne(Long id) {
        return repository.getById(id);
    }
}
