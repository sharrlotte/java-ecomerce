package vn.edu.hutech.bai5.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
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

    @NotBlank(message = "Tên là bắt buộc")
    private String customerName;

    @NotBlank(message = "Địa chỉ là bắt buộc")
    private String address;

    @NotBlank(message = "Số điện thoại là bắt buộc")
    private String phone;

    private String email;
    private String note;
    private String paymentMethod;

    @OneToMany(mappedBy = "order")
    private List<OrderDetail> orderDetails;
}
