package vn.edu.hutech.bai2.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.*;

@RequiredArgsConstructor
@Data
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Min(1)
    @Max(100)
    private String name;

    @Min(1)
    @Max(10000)
    private double price;

    @Min(1)
    @Max(1000)
    private String description;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
