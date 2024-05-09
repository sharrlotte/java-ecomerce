package vn.edu.hutech.bai2.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Data
@RequiredArgsConstructor
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerName;

    @OneToMany(mappedBy = "order")
    private List<OrderDetail> orderDetails;
}
