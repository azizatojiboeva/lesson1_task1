package uz.azi.task1.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author Aziza Tojiboyeva
 */
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Address {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer homeNumber;


    @ManyToMany(mappedBy = "address")
    private Set<Worker> workers=new HashSet<>();


}
