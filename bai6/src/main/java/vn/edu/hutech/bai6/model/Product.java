package vn.edu.hutech.bai6.model;

import org.hibernate.validator.constraints.Length;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@RequiredArgsConstructor
@Data
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Length(min = 1, max = 100)
    private String name;

    @Min(1)
    @Max(10000)
    private double price;

    @NotBlank
    @Length(min = 1, max = 1000)
    private String description;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
